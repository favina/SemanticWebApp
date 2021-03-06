package faa.travel.agency.ontology.impl;

import faa.travel.agency.ontology.classes.*;

import java.util.Collection;

import org.protege.owl.codegeneration.WrappedIndividual;
import org.protege.owl.codegeneration.impl.WrappedIndividualImpl;

import org.protege.owl.codegeneration.inference.CodeGenerationInference;

import org.semanticweb.owlapi.model.IRI;
import org.semanticweb.owlapi.model.OWLOntology;


/**
 * Generated by Protege (http://protege.stanford.edu).<br>
 * Source Class: DefaultCity <br>
 * @version generated on Mon Apr 17 12:31:16 BST 2017 by favina
 */
public class DefaultCity extends WrappedIndividualImpl implements City {

    public DefaultCity(CodeGenerationInference inference, IRI iri) {
        super(inference, iri);
    }





    /* ***************************************************
     * Object Property http://www.le.ac.uk/travelAgencyOntology.owl#hasToDo
     */
     
    public Collection<? extends Activity> getHasToDo() {
        return getDelegate().getPropertyValues(getOwlIndividual(),
                                               Vocabulary.OBJECT_PROPERTY_HASTODO,
                                               DefaultActivity.class);
    }

    public boolean hasHasToDo() {
	   return !getHasToDo().isEmpty();
    }

    public void addHasToDo(Activity newHasToDo) {
        getDelegate().addPropertyValue(getOwlIndividual(),
                                       Vocabulary.OBJECT_PROPERTY_HASTODO,
                                       newHasToDo);
    }

    public void removeHasToDo(Activity oldHasToDo) {
        getDelegate().removePropertyValue(getOwlIndividual(),
                                          Vocabulary.OBJECT_PROPERTY_HASTODO,
                                          oldHasToDo);
    }


    /* ***************************************************
     * Object Property http://www.le.ac.uk/travelAgencyOntology.owl#toVisit
     */
     
    public Collection<? extends Place> getToVisit() {
        return getDelegate().getPropertyValues(getOwlIndividual(),
                                               Vocabulary.OBJECT_PROPERTY_TOVISIT,
                                               DefaultPlace.class);
    }

    public boolean hasToVisit() {
	   return !getToVisit().isEmpty();
    }

    public void addToVisit(Place newToVisit) {
        getDelegate().addPropertyValue(getOwlIndividual(),
                                       Vocabulary.OBJECT_PROPERTY_TOVISIT,
                                       newToVisit);
    }

    public void removeToVisit(Place oldToVisit) {
        getDelegate().removePropertyValue(getOwlIndividual(),
                                          Vocabulary.OBJECT_PROPERTY_TOVISIT,
                                          oldToVisit);
    }


    /* ***************************************************
     * Data Property http://www.le.ac.uk/travelAgencyOntology.owl#City_ID
     */
     
    public Collection<? extends Integer> getCity_ID() {
		return getDelegate().getPropertyValues(getOwlIndividual(), Vocabulary.DATA_PROPERTY_CITY_ID, Integer.class);
    }

    public boolean hasCity_ID() {
		return !getCity_ID().isEmpty();
    }

    public void addCity_ID(Integer newCity_ID) {
	    getDelegate().addPropertyValue(getOwlIndividual(), Vocabulary.DATA_PROPERTY_CITY_ID, newCity_ID);
    }

    public void removeCity_ID(Integer oldCity_ID) {
		getDelegate().removePropertyValue(getOwlIndividual(), Vocabulary.DATA_PROPERTY_CITY_ID, oldCity_ID);
    }


    /* ***************************************************
     * Data Property http://www.le.ac.uk/travelAgencyOntology.owl#City_Name
     */
     
    public Collection<? extends String> getCity_Name() {
		return getDelegate().getPropertyValues(getOwlIndividual(), Vocabulary.DATA_PROPERTY_CITY_NAME, String.class);
    }

    public boolean hasCity_Name() {
		return !getCity_Name().isEmpty();
    }

    public void addCity_Name(String newCity_Name) {
	    getDelegate().addPropertyValue(getOwlIndividual(), Vocabulary.DATA_PROPERTY_CITY_NAME, newCity_Name);
    }

    public void removeCity_Name(String oldCity_Name) {
		getDelegate().removePropertyValue(getOwlIndividual(), Vocabulary.DATA_PROPERTY_CITY_NAME, oldCity_Name);
    }


    /* ***************************************************
     * Data Property http://www.le.ac.uk/travelAgencyOntology.owl#City_Type
     */
     
    public Collection<? extends String> getCity_Type() {
		return getDelegate().getPropertyValues(getOwlIndividual(), Vocabulary.DATA_PROPERTY_CITY_TYPE, String.class);
    }

    public boolean hasCity_Type() {
		return !getCity_Type().isEmpty();
    }

    public void addCity_Type(String newCity_Type) {
	    getDelegate().addPropertyValue(getOwlIndividual(), Vocabulary.DATA_PROPERTY_CITY_TYPE, newCity_Type);
    }

    public void removeCity_Type(String oldCity_Type) {
		getDelegate().removePropertyValue(getOwlIndividual(), Vocabulary.DATA_PROPERTY_CITY_TYPE, oldCity_Type);
    }


}
