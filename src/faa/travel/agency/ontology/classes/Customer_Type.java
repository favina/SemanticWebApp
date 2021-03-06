package faa.travel.agency.ontology.classes;

import java.util.Collection;

import org.protege.owl.codegeneration.WrappedIndividual;

import org.semanticweb.owlapi.model.OWLNamedIndividual;
import org.semanticweb.owlapi.model.OWLOntology;

/**
 * 
 * <p>
 * Generated by Protege (http://protege.stanford.edu). <br>
 * Source Class: Customer_Type <br>
 * @version generated on Mon Apr 17 12:31:16 BST 2017 by favina
 */

public interface Customer_Type extends WrappedIndividual {

    /* ***************************************************
     * Property http://www.le.ac.uk/travelAgencyOntology.owl#categorizedBy
     */
     
    /**
     * Gets all property values for the categorizedBy property.<p>
     * 
     * @returns a collection of values for the categorizedBy property.
     */
    Collection<? extends Customer> getCategorizedBy();

    /**
     * Checks if the class has a categorizedBy property value.<p>
     * 
     * @return true if there is a categorizedBy property value.
     */
    boolean hasCategorizedBy();

    /**
     * Adds a categorizedBy property value.<p>
     * 
     * @param newCategorizedBy the categorizedBy property value to be added
     */
    void addCategorizedBy(Customer newCategorizedBy);

    /**
     * Removes a categorizedBy property value.<p>
     * 
     * @param oldCategorizedBy the categorizedBy property value to be removed.
     */
    void removeCategorizedBy(Customer oldCategorizedBy);


    /* ***************************************************
     * Common interfaces
     */

    OWLNamedIndividual getOwlIndividual();

    OWLOntology getOwlOntology();

    void delete();

}
