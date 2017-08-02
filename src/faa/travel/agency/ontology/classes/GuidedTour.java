package faa.travel.agency.ontology.classes;

import java.util.Collection;

import org.protege.owl.codegeneration.WrappedIndividual;

import org.semanticweb.owlapi.model.OWLNamedIndividual;
import org.semanticweb.owlapi.model.OWLOntology;

/**
 * 
 * <p>
 * Generated by Protege (http://protege.stanford.edu). <br>
 * Source Class: GuidedTour <br>
 * @version generated on Mon Apr 17 12:31:16 BST 2017 by favina
 */

public interface GuidedTour extends WrappedIndividual {

    /* ***************************************************
     * Property http://www.le.ac.uk/travelAgencyOntology.owl#consistof
     */
     
    /**
     * Gets all property values for the consistof property.<p>
     * 
     * @returns a collection of values for the consistof property.
     */
    Collection<? extends Place> getConsistof();

    /**
     * Checks if the class has a consistof property value.<p>
     * 
     * @return true if there is a consistof property value.
     */
    boolean hasConsistof();

    /**
     * Adds a consistof property value.<p>
     * 
     * @param newConsistof the consistof property value to be added
     */
    void addConsistof(Place newConsistof);

    /**
     * Removes a consistof property value.<p>
     * 
     * @param oldConsistof the consistof property value to be removed.
     */
    void removeConsistof(Place oldConsistof);


    /* ***************************************************
     * Property http://www.le.ac.uk/travelAgencyOntology.owl#isIncluded
     */
     
    /**
     * Gets all property values for the isIncluded property.<p>
     * 
     * @returns a collection of values for the isIncluded property.
     */
    Collection<? extends Package> getIsIncluded();

    /**
     * Checks if the class has a isIncluded property value.<p>
     * 
     * @return true if there is a isIncluded property value.
     */
    boolean hasIsIncluded();

    /**
     * Adds a isIncluded property value.<p>
     * 
     * @param newIsIncluded the isIncluded property value to be added
     */
    void addIsIncluded(Package newIsIncluded);

    /**
     * Removes a isIncluded property value.<p>
     * 
     * @param oldIsIncluded the isIncluded property value to be removed.
     */
    void removeIsIncluded(Package oldIsIncluded);


    /* ***************************************************
     * Property http://www.le.ac.uk/travelAgencyOntology.owl#GT_Details
     */
     
    /**
     * Gets all property values for the GT_Details property.<p>
     * 
     * @returns a collection of values for the GT_Details property.
     */
    Collection<? extends String> getGT_Details();

    /**
     * Checks if the class has a GT_Details property value.<p>
     * 
     * @return true if there is a GT_Details property value.
     */
    boolean hasGT_Details();

    /**
     * Adds a GT_Details property value.<p>
     * 
     * @param newGT_Details the GT_Details property value to be added
     */
    void addGT_Details(String newGT_Details);

    /**
     * Removes a GT_Details property value.<p>
     * 
     * @param oldGT_Details the GT_Details property value to be removed.
     */
    void removeGT_Details(String oldGT_Details);



    /* ***************************************************
     * Property http://www.le.ac.uk/travelAgencyOntology.owl#GT_ID
     */
     
    /**
     * Gets all property values for the GT_ID property.<p>
     * 
     * @returns a collection of values for the GT_ID property.
     */
    Collection<? extends Integer> getGT_ID();

    /**
     * Checks if the class has a GT_ID property value.<p>
     * 
     * @return true if there is a GT_ID property value.
     */
    boolean hasGT_ID();

    /**
     * Adds a GT_ID property value.<p>
     * 
     * @param newGT_ID the GT_ID property value to be added
     */
    void addGT_ID(Integer newGT_ID);

    /**
     * Removes a GT_ID property value.<p>
     * 
     * @param oldGT_ID the GT_ID property value to be removed.
     */
    void removeGT_ID(Integer oldGT_ID);



    /* ***************************************************
     * Property http://www.le.ac.uk/travelAgencyOntology.owl#GT_Location
     */
     
    /**
     * Gets all property values for the GT_Location property.<p>
     * 
     * @returns a collection of values for the GT_Location property.
     */
    Collection<? extends String> getGT_Location();

    /**
     * Checks if the class has a GT_Location property value.<p>
     * 
     * @return true if there is a GT_Location property value.
     */
    boolean hasGT_Location();

    /**
     * Adds a GT_Location property value.<p>
     * 
     * @param newGT_Location the GT_Location property value to be added
     */
    void addGT_Location(String newGT_Location);

    /**
     * Removes a GT_Location property value.<p>
     * 
     * @param oldGT_Location the GT_Location property value to be removed.
     */
    void removeGT_Location(String oldGT_Location);



    /* ***************************************************
     * Property http://www.le.ac.uk/travelAgencyOntology.owl#GT_MultiLocations
     */
     
    /**
     * Gets all property values for the GT_MultiLocations property.<p>
     * 
     * @returns a collection of values for the GT_MultiLocations property.
     */
    Collection<? extends Boolean> getGT_MultiLocations();

    /**
     * Checks if the class has a GT_MultiLocations property value.<p>
     * 
     * @return true if there is a GT_MultiLocations property value.
     */
    boolean hasGT_MultiLocations();

    /**
     * Adds a GT_MultiLocations property value.<p>
     * 
     * @param newGT_MultiLocations the GT_MultiLocations property value to be added
     */
    void addGT_MultiLocations(Boolean newGT_MultiLocations);

    /**
     * Removes a GT_MultiLocations property value.<p>
     * 
     * @param oldGT_MultiLocations the GT_MultiLocations property value to be removed.
     */
    void removeGT_MultiLocations(Boolean oldGT_MultiLocations);



    /* ***************************************************
     * Property http://www.le.ac.uk/travelAgencyOntology.owl#GT_Timing
     */
     
    /**
     * Gets all property values for the GT_Timing property.<p>
     * 
     * @returns a collection of values for the GT_Timing property.
     */
    Collection<? extends Integer> getGT_Timing();

    /**
     * Checks if the class has a GT_Timing property value.<p>
     * 
     * @return true if there is a GT_Timing property value.
     */
    boolean hasGT_Timing();

    /**
     * Adds a GT_Timing property value.<p>
     * 
     * @param newGT_Timing the GT_Timing property value to be added
     */
    void addGT_Timing(Integer newGT_Timing);

    /**
     * Removes a GT_Timing property value.<p>
     * 
     * @param oldGT_Timing the GT_Timing property value to be removed.
     */
    void removeGT_Timing(Integer oldGT_Timing);



    /* ***************************************************
     * Common interfaces
     */

    OWLNamedIndividual getOwlIndividual();

    OWLOntology getOwlOntology();

    void delete();

}