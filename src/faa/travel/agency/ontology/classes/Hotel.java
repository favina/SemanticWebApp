package faa.travel.agency.ontology.classes;

import java.util.Collection;

import org.protege.owl.codegeneration.WrappedIndividual;

import org.semanticweb.owlapi.model.OWLNamedIndividual;
import org.semanticweb.owlapi.model.OWLOntology;

/**
 * 
 * <p>
 * Generated by Protege (http://protege.stanford.edu). <br>
 * Source Class: Hotel <br>
 * @version generated on Mon Apr 17 12:31:16 BST 2017 by favina
 */

public interface Hotel extends Accomodation {

    /* ***************************************************
     * Property http://www.le.ac.uk/travelAgencyOntology.owl#hasRating
     */
     
    /**
     * Gets all property values for the hasRating property.<p>
     * 
     * @returns a collection of values for the hasRating property.
     */
    Collection<? extends Rating> getHasRating();

    /**
     * Checks if the class has a hasRating property value.<p>
     * 
     * @return true if there is a hasRating property value.
     */
    boolean hasHasRating();

    /**
     * Adds a hasRating property value.<p>
     * 
     * @param newHasRating the hasRating property value to be added
     */
    void addHasRating(Rating newHasRating);

    /**
     * Removes a hasRating property value.<p>
     * 
     * @param oldHasRating the hasRating property value to be removed.
     */
    void removeHasRating(Rating oldHasRating);


    /* ***************************************************
     * Property http://www.le.ac.uk/travelAgencyOntology.owl#situatedIn
     */
     
    /**
     * Gets all property values for the situatedIn property.<p>
     * 
     * @returns a collection of values for the situatedIn property.
     */
    Collection<? extends City> getSituatedIn();

    /**
     * Checks if the class has a situatedIn property value.<p>
     * 
     * @return true if there is a situatedIn property value.
     */
    boolean hasSituatedIn();

    /**
     * Adds a situatedIn property value.<p>
     * 
     * @param newSituatedIn the situatedIn property value to be added
     */
    void addSituatedIn(City newSituatedIn);

    /**
     * Removes a situatedIn property value.<p>
     * 
     * @param oldSituatedIn the situatedIn property value to be removed.
     */
    void removeSituatedIn(City oldSituatedIn);


    /* ***************************************************
     * Property http://www.le.ac.uk/travelAgencyOntology.owl#suitableFor
     */
     
    /**
     * Gets all property values for the suitableFor property.<p>
     * 
     * @returns a collection of values for the suitableFor property.
     */
    Collection<? extends Customer_Type> getSuitableFor();

    /**
     * Checks if the class has a suitableFor property value.<p>
     * 
     * @return true if there is a suitableFor property value.
     */
    boolean hasSuitableFor();

    /**
     * Adds a suitableFor property value.<p>
     * 
     * @param newSuitableFor the suitableFor property value to be added
     */
    void addSuitableFor(Customer_Type newSuitableFor);

    /**
     * Removes a suitableFor property value.<p>
     * 
     * @param oldSuitableFor the suitableFor property value to be removed.
     */
    void removeSuitableFor(Customer_Type oldSuitableFor);


    /* ***************************************************
     * Property http://www.le.ac.uk/travelAgencyOntology.owl#Acc_Avalibility
     */
     
    /**
     * Gets all property values for the Acc_Avalibility property.<p>
     * 
     * @returns a collection of values for the Acc_Avalibility property.
     */
    Collection<? extends Object> getAcc_Avalibility();

    /**
     * Checks if the class has a Acc_Avalibility property value.<p>
     * 
     * @return true if there is a Acc_Avalibility property value.
     */
    boolean hasAcc_Avalibility();

    /**
     * Adds a Acc_Avalibility property value.<p>
     * 
     * @param newAcc_Avalibility the Acc_Avalibility property value to be added
     */
    void addAcc_Avalibility(Object newAcc_Avalibility);

    /**
     * Removes a Acc_Avalibility property value.<p>
     * 
     * @param oldAcc_Avalibility the Acc_Avalibility property value to be removed.
     */
    void removeAcc_Avalibility(Object oldAcc_Avalibility);



    /* ***************************************************
     * Property http://www.le.ac.uk/travelAgencyOntology.owl#Acc_ID
     */
     
    /**
     * Gets all property values for the Acc_ID property.<p>
     * 
     * @returns a collection of values for the Acc_ID property.
     */
    Collection<? extends Integer> getAcc_ID();

    /**
     * Checks if the class has a Acc_ID property value.<p>
     * 
     * @return true if there is a Acc_ID property value.
     */
    boolean hasAcc_ID();

    /**
     * Adds a Acc_ID property value.<p>
     * 
     * @param newAcc_ID the Acc_ID property value to be added
     */
    void addAcc_ID(Integer newAcc_ID);

    /**
     * Removes a Acc_ID property value.<p>
     * 
     * @param oldAcc_ID the Acc_ID property value to be removed.
     */
    void removeAcc_ID(Integer oldAcc_ID);



    /* ***************************************************
     * Property http://www.le.ac.uk/travelAgencyOntology.owl#Acc_Location
     */
     
    /**
     * Gets all property values for the Acc_Location property.<p>
     * 
     * @returns a collection of values for the Acc_Location property.
     */
    Collection<? extends Integer> getAcc_Location();

    /**
     * Checks if the class has a Acc_Location property value.<p>
     * 
     * @return true if there is a Acc_Location property value.
     */
    boolean hasAcc_Location();

    /**
     * Adds a Acc_Location property value.<p>
     * 
     * @param newAcc_Location the Acc_Location property value to be added
     */
    void addAcc_Location(Integer newAcc_Location);

    /**
     * Removes a Acc_Location property value.<p>
     * 
     * @param oldAcc_Location the Acc_Location property value to be removed.
     */
    void removeAcc_Location(Integer oldAcc_Location);



    /* ***************************************************
     * Property http://www.le.ac.uk/travelAgencyOntology.owl#Acc_Name
     */
     
    /**
     * Gets all property values for the Acc_Name property.<p>
     * 
     * @returns a collection of values for the Acc_Name property.
     */
    Collection<? extends String> getAcc_Name();

    /**
     * Checks if the class has a Acc_Name property value.<p>
     * 
     * @return true if there is a Acc_Name property value.
     */
    boolean hasAcc_Name();

    /**
     * Adds a Acc_Name property value.<p>
     * 
     * @param newAcc_Name the Acc_Name property value to be added
     */
    void addAcc_Name(String newAcc_Name);

    /**
     * Removes a Acc_Name property value.<p>
     * 
     * @param oldAcc_Name the Acc_Name property value to be removed.
     */
    void removeAcc_Name(String oldAcc_Name);



    /* ***************************************************
     * Property http://www.le.ac.uk/travelAgencyOntology.owl#Acc_ProvidesBreakfast
     */
     
    /**
     * Gets all property values for the Acc_ProvidesBreakfast property.<p>
     * 
     * @returns a collection of values for the Acc_ProvidesBreakfast property.
     */
    Collection<? extends Boolean> getAcc_ProvidesBreakfast();

    /**
     * Checks if the class has a Acc_ProvidesBreakfast property value.<p>
     * 
     * @return true if there is a Acc_ProvidesBreakfast property value.
     */
    boolean hasAcc_ProvidesBreakfast();

    /**
     * Adds a Acc_ProvidesBreakfast property value.<p>
     * 
     * @param newAcc_ProvidesBreakfast the Acc_ProvidesBreakfast property value to be added
     */
    void addAcc_ProvidesBreakfast(Boolean newAcc_ProvidesBreakfast);

    /**
     * Removes a Acc_ProvidesBreakfast property value.<p>
     * 
     * @param oldAcc_ProvidesBreakfast the Acc_ProvidesBreakfast property value to be removed.
     */
    void removeAcc_ProvidesBreakfast(Boolean oldAcc_ProvidesBreakfast);



    /* ***************************************************
     * Common interfaces
     */

    OWLNamedIndividual getOwlIndividual();

    OWLOntology getOwlOntology();

    void delete();

}
