package faa.travel.agency.ontology.web.app.model;

import org.apache.jena.ontology.OntModel;
import org.apache.jena.ontology.OntModelSpec;
import org.apache.jena.rdf.model.ModelFactory;
import org.apache.jena.util.FileManager;

public class ModelProvider {
	private static final String ontology="travel_agency.owl";
	public static final OntModel MODEL;
	
	static{
    	MODEL = ModelFactory.createOntologyModel(OntModelSpec.OWL_DL_MEM);
    	MODEL.read(FileManager.get().open(ontology), null);	
	}
}
