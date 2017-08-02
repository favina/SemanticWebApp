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
 * Source Class: DefaultBushcraft <br>
 * @version generated on Mon Apr 17 12:31:16 BST 2017 by favina
 */
public class DefaultBushcraft extends WrappedIndividualImpl implements Bushcraft {

    public DefaultBushcraft(CodeGenerationInference inference, IRI iri) {
        super(inference, iri);
    }





    /* ***************************************************
     * Data Property http://www.le.ac.uk/travelAgencyOntology.owl#Activity_Mode
     */
     
    public Collection<? extends String> getActivity_Mode() {
		return getDelegate().getPropertyValues(getOwlIndividual(), Vocabulary.DATA_PROPERTY_ACTIVITY_MODE, String.class);
    }

    public boolean hasActivity_Mode() {
		return !getActivity_Mode().isEmpty();
    }

    public void addActivity_Mode(String newActivity_Mode) {
	    getDelegate().addPropertyValue(getOwlIndividual(), Vocabulary.DATA_PROPERTY_ACTIVITY_MODE, newActivity_Mode);
    }

    public void removeActivity_Mode(String oldActivity_Mode) {
		getDelegate().removePropertyValue(getOwlIndividual(), Vocabulary.DATA_PROPERTY_ACTIVITY_MODE, oldActivity_Mode);
    }


    /* ***************************************************
     * Data Property http://www.le.ac.uk/travelAgencyOntology.owl#Activity_Name
     */
     
    public Collection<? extends String> getActivity_Name() {
		return getDelegate().getPropertyValues(getOwlIndividual(), Vocabulary.DATA_PROPERTY_ACTIVITY_NAME, String.class);
    }

    public boolean hasActivity_Name() {
		return !getActivity_Name().isEmpty();
    }

    public void addActivity_Name(String newActivity_Name) {
	    getDelegate().addPropertyValue(getOwlIndividual(), Vocabulary.DATA_PROPERTY_ACTIVITY_NAME, newActivity_Name);
    }

    public void removeActivity_Name(String oldActivity_Name) {
		getDelegate().removePropertyValue(getOwlIndividual(), Vocabulary.DATA_PROPERTY_ACTIVITY_NAME, oldActivity_Name);
    }


}
