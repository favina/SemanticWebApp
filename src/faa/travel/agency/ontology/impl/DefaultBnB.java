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
 * Source Class: DefaultBnB <br>
 * @version generated on Mon Apr 17 12:31:15 BST 2017 by favina
 */
public class DefaultBnB extends WrappedIndividualImpl implements BnB {

    public DefaultBnB(CodeGenerationInference inference, IRI iri) {
        super(inference, iri);
    }





    /* ***************************************************
     * Object Property http://www.le.ac.uk/travelAgencyOntology.owl#hasRating
     */
     
    public Collection<? extends Rating> getHasRating() {
        return getDelegate().getPropertyValues(getOwlIndividual(),
                                               Vocabulary.OBJECT_PROPERTY_HASRATING,
                                               DefaultRating.class);
    }

    public boolean hasHasRating() {
	   return !getHasRating().isEmpty();
    }

    public void addHasRating(Rating newHasRating) {
        getDelegate().addPropertyValue(getOwlIndividual(),
                                       Vocabulary.OBJECT_PROPERTY_HASRATING,
                                       newHasRating);
    }

    public void removeHasRating(Rating oldHasRating) {
        getDelegate().removePropertyValue(getOwlIndividual(),
                                          Vocabulary.OBJECT_PROPERTY_HASRATING,
                                          oldHasRating);
    }


    /* ***************************************************
     * Object Property http://www.le.ac.uk/travelAgencyOntology.owl#situatedIn
     */
     
    public Collection<? extends City> getSituatedIn() {
        return getDelegate().getPropertyValues(getOwlIndividual(),
                                               Vocabulary.OBJECT_PROPERTY_SITUATEDIN,
                                               DefaultCity.class);
    }

    public boolean hasSituatedIn() {
	   return !getSituatedIn().isEmpty();
    }

    public void addSituatedIn(City newSituatedIn) {
        getDelegate().addPropertyValue(getOwlIndividual(),
                                       Vocabulary.OBJECT_PROPERTY_SITUATEDIN,
                                       newSituatedIn);
    }

    public void removeSituatedIn(City oldSituatedIn) {
        getDelegate().removePropertyValue(getOwlIndividual(),
                                          Vocabulary.OBJECT_PROPERTY_SITUATEDIN,
                                          oldSituatedIn);
    }


    /* ***************************************************
     * Object Property http://www.le.ac.uk/travelAgencyOntology.owl#suitableFor
     */
     
    public Collection<? extends Customer_Type> getSuitableFor() {
        return getDelegate().getPropertyValues(getOwlIndividual(),
                                               Vocabulary.OBJECT_PROPERTY_SUITABLEFOR,
                                               DefaultCustomer_Type.class);
    }

    public boolean hasSuitableFor() {
	   return !getSuitableFor().isEmpty();
    }

    public void addSuitableFor(Customer_Type newSuitableFor) {
        getDelegate().addPropertyValue(getOwlIndividual(),
                                       Vocabulary.OBJECT_PROPERTY_SUITABLEFOR,
                                       newSuitableFor);
    }

    public void removeSuitableFor(Customer_Type oldSuitableFor) {
        getDelegate().removePropertyValue(getOwlIndividual(),
                                          Vocabulary.OBJECT_PROPERTY_SUITABLEFOR,
                                          oldSuitableFor);
    }


    /* ***************************************************
     * Data Property http://www.le.ac.uk/travelAgencyOntology.owl#Acc_Avalibility
     */
     
    public Collection<? extends Object> getAcc_Avalibility() {
		return getDelegate().getPropertyValues(getOwlIndividual(), Vocabulary.DATA_PROPERTY_ACC_AVALIBILITY, Object.class);
    }

    public boolean hasAcc_Avalibility() {
		return !getAcc_Avalibility().isEmpty();
    }

    public void addAcc_Avalibility(Object newAcc_Avalibility) {
	    getDelegate().addPropertyValue(getOwlIndividual(), Vocabulary.DATA_PROPERTY_ACC_AVALIBILITY, newAcc_Avalibility);
    }

    public void removeAcc_Avalibility(Object oldAcc_Avalibility) {
		getDelegate().removePropertyValue(getOwlIndividual(), Vocabulary.DATA_PROPERTY_ACC_AVALIBILITY, oldAcc_Avalibility);
    }


    /* ***************************************************
     * Data Property http://www.le.ac.uk/travelAgencyOntology.owl#Acc_ID
     */
     
    public Collection<? extends Integer> getAcc_ID() {
		return getDelegate().getPropertyValues(getOwlIndividual(), Vocabulary.DATA_PROPERTY_ACC_ID, Integer.class);
    }

    public boolean hasAcc_ID() {
		return !getAcc_ID().isEmpty();
    }

    public void addAcc_ID(Integer newAcc_ID) {
	    getDelegate().addPropertyValue(getOwlIndividual(), Vocabulary.DATA_PROPERTY_ACC_ID, newAcc_ID);
    }

    public void removeAcc_ID(Integer oldAcc_ID) {
		getDelegate().removePropertyValue(getOwlIndividual(), Vocabulary.DATA_PROPERTY_ACC_ID, oldAcc_ID);
    }


    /* ***************************************************
     * Data Property http://www.le.ac.uk/travelAgencyOntology.owl#Acc_Location
     */
     
    public Collection<? extends Integer> getAcc_Location() {
		return getDelegate().getPropertyValues(getOwlIndividual(), Vocabulary.DATA_PROPERTY_ACC_LOCATION, Integer.class);
    }

    public boolean hasAcc_Location() {
		return !getAcc_Location().isEmpty();
    }

    public void addAcc_Location(Integer newAcc_Location) {
	    getDelegate().addPropertyValue(getOwlIndividual(), Vocabulary.DATA_PROPERTY_ACC_LOCATION, newAcc_Location);
    }

    public void removeAcc_Location(Integer oldAcc_Location) {
		getDelegate().removePropertyValue(getOwlIndividual(), Vocabulary.DATA_PROPERTY_ACC_LOCATION, oldAcc_Location);
    }


    /* ***************************************************
     * Data Property http://www.le.ac.uk/travelAgencyOntology.owl#Acc_Name
     */
     
    public Collection<? extends String> getAcc_Name() {
		return getDelegate().getPropertyValues(getOwlIndividual(), Vocabulary.DATA_PROPERTY_ACC_NAME, String.class);
    }

    public boolean hasAcc_Name() {
		return !getAcc_Name().isEmpty();
    }

    public void addAcc_Name(String newAcc_Name) {
	    getDelegate().addPropertyValue(getOwlIndividual(), Vocabulary.DATA_PROPERTY_ACC_NAME, newAcc_Name);
    }

    public void removeAcc_Name(String oldAcc_Name) {
		getDelegate().removePropertyValue(getOwlIndividual(), Vocabulary.DATA_PROPERTY_ACC_NAME, oldAcc_Name);
    }


    /* ***************************************************
     * Data Property http://www.le.ac.uk/travelAgencyOntology.owl#Acc_ProvidesBreakfast
     */
     
    public Collection<? extends Boolean> getAcc_ProvidesBreakfast() {
		return getDelegate().getPropertyValues(getOwlIndividual(), Vocabulary.DATA_PROPERTY_ACC_PROVIDESBREAKFAST, Boolean.class);
    }

    public boolean hasAcc_ProvidesBreakfast() {
		return !getAcc_ProvidesBreakfast().isEmpty();
    }

    public void addAcc_ProvidesBreakfast(Boolean newAcc_ProvidesBreakfast) {
	    getDelegate().addPropertyValue(getOwlIndividual(), Vocabulary.DATA_PROPERTY_ACC_PROVIDESBREAKFAST, newAcc_ProvidesBreakfast);
    }

    public void removeAcc_ProvidesBreakfast(Boolean oldAcc_ProvidesBreakfast) {
		getDelegate().removePropertyValue(getOwlIndividual(), Vocabulary.DATA_PROPERTY_ACC_PROVIDESBREAKFAST, oldAcc_ProvidesBreakfast);
    }


}