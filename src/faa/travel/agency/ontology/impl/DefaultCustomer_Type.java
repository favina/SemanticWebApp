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
 * Source Class: DefaultCustomer_Type <br>
 * @version generated on Mon Apr 17 12:31:16 BST 2017 by favina
 */
public class DefaultCustomer_Type extends WrappedIndividualImpl implements Customer_Type {

    public DefaultCustomer_Type(CodeGenerationInference inference, IRI iri) {
        super(inference, iri);
    }





    /* ***************************************************
     * Object Property http://www.le.ac.uk/travelAgencyOntology.owl#categorizedBy
     */
     
    public Collection<? extends Customer> getCategorizedBy() {
        return getDelegate().getPropertyValues(getOwlIndividual(),
                                               Vocabulary.OBJECT_PROPERTY_CATEGORIZEDBY,
                                               DefaultCustomer.class);
    }

    public boolean hasCategorizedBy() {
	   return !getCategorizedBy().isEmpty();
    }

    public void addCategorizedBy(Customer newCategorizedBy) {
        getDelegate().addPropertyValue(getOwlIndividual(),
                                       Vocabulary.OBJECT_PROPERTY_CATEGORIZEDBY,
                                       newCategorizedBy);
    }

    public void removeCategorizedBy(Customer oldCategorizedBy) {
        getDelegate().removePropertyValue(getOwlIndividual(),
                                          Vocabulary.OBJECT_PROPERTY_CATEGORIZEDBY,
                                          oldCategorizedBy);
    }


}
