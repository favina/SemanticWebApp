package faa.travel.agency.ontology.classes;

import java.util.Collection;

import org.protege.owl.codegeneration.WrappedIndividual;

import org.semanticweb.owlapi.model.OWLNamedIndividual;
import org.semanticweb.owlapi.model.OWLOntology;

/**
 * 
 * <p>
 * Generated by Protege (http://protege.stanford.edu). <br>
 * Source Class: Bushcraft <br>
 * @version generated on Mon Apr 17 12:31:16 BST 2017 by favina
 */

public interface Bushcraft extends Adventure {

    /* ***************************************************
     * Property http://www.le.ac.uk/travelAgencyOntology.owl#Activity_Mode
     */
     
    /**
     * Gets all property values for the Activity_Mode property.<p>
     * 
     * @returns a collection of values for the Activity_Mode property.
     */
    Collection<? extends String> getActivity_Mode();

    /**
     * Checks if the class has a Activity_Mode property value.<p>
     * 
     * @return true if there is a Activity_Mode property value.
     */
    boolean hasActivity_Mode();

    /**
     * Adds a Activity_Mode property value.<p>
     * 
     * @param newActivity_Mode the Activity_Mode property value to be added
     */
    void addActivity_Mode(String newActivity_Mode);

    /**
     * Removes a Activity_Mode property value.<p>
     * 
     * @param oldActivity_Mode the Activity_Mode property value to be removed.
     */
    void removeActivity_Mode(String oldActivity_Mode);



    /* ***************************************************
     * Property http://www.le.ac.uk/travelAgencyOntology.owl#Activity_Name
     */
     
    /**
     * Gets all property values for the Activity_Name property.<p>
     * 
     * @returns a collection of values for the Activity_Name property.
     */
    Collection<? extends String> getActivity_Name();

    /**
     * Checks if the class has a Activity_Name property value.<p>
     * 
     * @return true if there is a Activity_Name property value.
     */
    boolean hasActivity_Name();

    /**
     * Adds a Activity_Name property value.<p>
     * 
     * @param newActivity_Name the Activity_Name property value to be added
     */
    void addActivity_Name(String newActivity_Name);

    /**
     * Removes a Activity_Name property value.<p>
     * 
     * @param oldActivity_Name the Activity_Name property value to be removed.
     */
    void removeActivity_Name(String oldActivity_Name);



    /* ***************************************************
     * Common interfaces
     */

    OWLNamedIndividual getOwlIndividual();

    OWLOntology getOwlOntology();

    void delete();

}
