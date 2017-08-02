package faa.travel.agency.main;

import java.io.File;
import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Formatter;
import java.util.List;

import org.apache.jena.ontology.Individual;
import org.apache.jena.ontology.OntModel;
import org.apache.jena.ontology.ProfileRegistry;
import org.apache.jena.query.Query;
import org.apache.jena.query.QueryExecution;
import org.apache.jena.query.QueryExecutionFactory;
import org.apache.jena.query.QueryFactory;
import org.apache.jena.query.QuerySolution;
import org.apache.jena.query.ResultSet;
import org.apache.jena.rdf.model.ModelFactory;
import org.apache.jena.rdf.model.RDFNode;
import org.apache.jena.rdf.model.Resource;
import org.apache.jena.tdb.store.IntegerNode;
import org.apache.jena.util.iterator.ExtendedIterator;
import org.semanticweb.owlapi.apibinding.OWLManager;
import org.semanticweb.owlapi.model.IRI;
import org.semanticweb.owlapi.model.OWLNamedIndividual;
import org.semanticweb.owlapi.model.OWLOntology;
import org.semanticweb.owlapi.model.OWLOntologyManager;

import faa.travel.agency.ontology.classes.*;
public class OntologyDataImporter {
	 OWLOntologyManager manager;
	 OWLOntology ont;
	 public static final String ontology="resources/travel_agency.owl";
	 public static final String ontology_save="resources/travel_agency_saved.owl";
	 
	 //Load ontology
	 public OntologyDataImporter(){
		 try{
			manager = OWLManager.createOWLOntologyManager();
			File ontFile=new File(ontology);
	        IRI iri = IRI.create(ontFile);
	        ont= manager.loadOntologyFromOntologyDocument(iri);
	        System.out.println("Loaded ontology: " + ont);
		 }
			 catch(Exception ex){
			 ex.printStackTrace();
		 }
	 }

	 /**
	 * Question 3
	 *
	 * populate()
	 *
	 * Query RDF store(s) via their
	 * SPARQL endpoints using Jena API. Use the data
	 * obtained to populate your ontology
	 * (adding instances).
	 */

	public void populate(){

		 //Question 2.1
		 //DBpedia SPARQL endpoint
		 String sparqlEndpoint="http://dbpedia.org/sparql";
		 
		 //Query One: Populates customer class with name, gender and dob.
		
		 String sparql1 = "PREFIX : <http://dbpedia.org/resource/>\n"+
				  "PREFIX dbp: <http://dbpedia.org/property/>\n"+
				  "PREFIX dbo: <http://dbpedia.org/ontology/> \n"+
				  "SELECT ?name ?gen  ?dob {\n"+
		          "?person dbp:name ?name.\n"+				  
				  "?person ?gender ?gen.\n"+
				  "?person dbo:birthDate ?dob.\n"+
				  " FILTER((?gen = 'Female'@en) || (?gen = 'Male'@en))\n"+
	              "} LIMIT 1";
	              
	    
		//Query two: Populates Activity Class with type and name.
		 
		 String sparql2 = 
				  "PREFIX rdfs: <http://www.w3.org/2000/01/rdf-schema#>\n"+
				  "PREFIX dbo: <http://dbpedia.org/ontology/> \n"+
				  "PREFIX dbp: <http://dbpedia.org/property/>\n"+
				  "SELECT  ?activity_Label ?type {\n"+
		          "?activity a dbo:Activity.\n"+				  
				  " ?activity rdfs:label ?activity_Label.\n"+
				  "?activity dbp:type ?type.\n"+
	              "} LIMIT 1";
	              
	       
		//Query three:Populates the monument class with name and location
		 
		 
		 String sparql3 = "PREFIX rdfs: <http://www.w3.org/2000/01/rdf-schema#>\n"+
				  "PREFIX dbo: <http://dbpedia.org/ontology/> \n"+
				  "SELECT ?monument_Label ?monument_location  {\n"+
		          " ?monument a dbo:Monument.\n"+
		          " ?monument rdfs:label ?monument_Label.\n"+
				  "?monument_location dbo:location ?monument.\n"+
	              "} LIMIT 1";
		 
		 
		//Query Four: Populates City with name
		
		 String sparql4 = "PREFIX rdfs: <http://www.w3.org/2000/01/rdf-schema#>\n"+
				  "PREFIX dbo: <http://dbpedia.org/ontology/> \n"+
				  "SELECT ?city_Label  {\n"+
		          " ?city a dbo:City.\n"+
		          " ?city rdfs:label ?city_Label.\n"+
	              "} LIMIT 1";
	     
		
		 Query query = QueryFactory.create(sparql2);
		 
	     QueryExecution qexec =  QueryExecutionFactory.sparqlService(sparqlEndpoint, query);

	     try
	         {
	           ResultSet results = qexec.execSelect();
	           while(results.hasNext()){
	        	   QuerySolution qs = results.nextSolution();
	        	   List<String> columnNames=results.getResultVars();
	        	   for(String heading: columnNames){      		   
	        		  System.out.format("%10s",heading+"\t");
	        	   }
	        	   System.out.println("\n");
	        	   for(int column=0;column<columnNames.size();column++){
	        		   RDFNode node=qs.get(columnNames.get(column));
	        		
	        		   if(node.isAnon()){
	        			   //if this RDFNode is an anonymous resource. 
	        			   System.out.print("anonymous:");
	        		   }else if(node.isURIResource()){
	        			   //if this RDFNode is an URI resource 
	        			   System.out.print("URI:");
	        		   }else if(node.isLiteral()){
	        			   //if this RDFNode is a literal
	        			   System.out.print("literal:");
	        		   }else if(node.isResource()){
	        			   //if this node is a resource
	        			   System.out.print("resource:");
	        		   }else{
	        			   System.out.print("others:");
	        			   //else
	        		   }
	        		   System.out.print(node.toString()+"\n");
	        	   }
	        	   OntFactory factory=new OntFactory (ont);
        		   String prefix="http://www.le.ac.uk/travelAgencyOntology.owl#";
        		   
        		   /*Customer - Query One 
	        	   String name= qs.get("name").toString();
        		   String dob= qs.get("dob").toString();
        		   String gen= qs.get("gen").toString();
        		  	
        		   //populate for query one
	        	   Customer cust = factory.createCustomer(prefix+"cust1");
	               //add DatatypeProperty values
	        	   cust.addCust_ID(new Integer(1));
	        	   cust.addPerson_dob(dob);
	        	   cust.addPerson_Name(name);
	        	   cust.addPerson_Gender(gen); 
	        	 */
	        	   
	        	   /* Activity - Query Two */
	        	    Activity act = factory.createActivity(prefix+"Activity1");
	        	   String ActName= qs.get("activity_Label").toString();
        		   String Acttype= qs.get("type").toString();
        		  
        		   //add DatatypeProperty values
        		   act.addActivity_Name(ActName);
        		   act.addActivity_Mode(Acttype); 
        		
        
        		   /* Monuments  - Query Three
        		   String MonName= qs.get("monument_Label").toString();
        		   String MonLocation= qs.get("monument_location").toString();
        		   Monument mon = factory.createMonument(prefix+"Monument1");
        		   //add DatatypeProperty values
        		   mon.addAttraction_Name(MonName);
        		   mon.addAttraction_Location(MonLocation); 
        		 
        		  
        	
        		   /*City - Query Four
        		   String CityName= qs.get("city_Label").toString();
        		   City city = factory.createCity(prefix+"City1");
        		   //add DatatypeProperty values
        		   city.addCity_ID(new Integer(10));
        		   city.addCity_Name(CityName);
         		   */
         		 
         		 
      		    
	           }
	         }
	        finally{
	             qexec.close();
	         }

	 }


     public  void createRelationships(){

		 try{

			OntFactory factory=new OntFactory (ont);
			String prefix="http://www.le.ac.uk/travelAgencyOntology.owl#";
			
			/*add Object Property relationships*/
			
			/*Customer  - Query 1
		 	Customer cust = factory.getCustomer(prefix+"cust1");
		 	//Create a new customer type called group
		   	Customer_Type customer_type = factory.createCustomer_Type("Group");
		   	cust.addIsCategorized(customer_type);
		   	customer_type.addCategorizedBy(cust);
		   
			
		   /* Monuments - Query 2
	    	Monument mon = factory.getMonument(prefix+"Monument1");
	    	//Get existing activity: BushcraftInBarcelona
	  		Activity act = factory.getActivity(prefix+"BushcraftInBarcelona");
      		mon.addRecommend(act);
		    
			
			/*City - Query 3
			
			 City city = factory.getCity(prefix+"City1");
			 
			 //Get existing monument, activity and Customer
   		  Monument mon = factory.getMonument(prefix+"Louvre");
   		  Activity act = factory.getActivity(prefix+"BushcraftInBarcelona");  		 
   		  Customer cust = factory.getCustomer(prefix + "Jenny");
   		  
       		 city.addHasToDo(act);
     		 city.addToVisit(mon);
     		 cust.addSelect(city);
		
			 */
			 
  		  
   
		 }catch(Exception ex){
			 ex.printStackTrace();
		 }

	 }
     public void save(String filepath){

			try{
				File file=new File(filepath);
				 manager.saveOntology(ont, IRI.create(file.toURI()));
				 System.out.println("Saved ontology: " + ont);

			}catch(Exception ex){
				ex.printStackTrace();
			}

		}
     public static void main(String[] args){
		 OntologyDataImporter app=new OntologyDataImporter();
		 app.populate();
		 app.createRelationships();
		 app.save(ontology_save); 
	 }

}
