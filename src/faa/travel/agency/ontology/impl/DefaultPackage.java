package faa.travel.agency.ontology.impl;

import faa.travel.agency.ontology.classes.*;
import faa.travel.agency.ontology.classes.Package;

import java.util.Collection;

import org.protege.owl.codegeneration.WrappedIndividual;
import org.protege.owl.codegeneration.impl.WrappedIndividualImpl;

import org.protege.owl.codegeneration.inference.CodeGenerationInference;

import org.semanticweb.owlapi.model.IRI;
import org.semanticweb.owlapi.model.OWLOntology;


/**
 * Generated by Protege (http://protege.stanford.edu).<br>
 * Source Class: DefaultPackage <br>
 * @version generated on Mon Apr 17 12:31:16 BST 2017 by favina
 */
public class DefaultPackage extends WrappedIndividualImpl implements Package {

    public DefaultPackage(CodeGenerationInference inference, IRI iri) {
        super(inference, iri);
    }





    /* ***************************************************
     * Object Property http://www.le.ac.uk/travelAgencyOntology.owl#Incoporate
     */
     
    public Collection<? extends Budget> getIncoporate() {
        return getDelegate().getPropertyValues(getOwlIndividual(),
                                               Vocabulary.OBJECT_PROPERTY_INCOPORATE,
                                               DefaultBudget.class);
    }

    public boolean hasIncoporate() {
	   return !getIncoporate().isEmpty();
    }

    public void addIncoporate(Budget newIncoporate) {
        getDelegate().addPropertyValue(getOwlIndividual(),
                                       Vocabulary.OBJECT_PROPERTY_INCOPORATE,
                                       newIncoporate);
    }

    public void removeIncoporate(Budget oldIncoporate) {
        getDelegate().removePropertyValue(getOwlIndividual(),
                                          Vocabulary.OBJECT_PROPERTY_INCOPORATE,
                                          oldIncoporate);
    }


    /* ***************************************************
     * Data Property http://www.le.ac.uk/travelAgencyOntology.owl#Pkg_Avalibility
     */
     
    public Collection<? extends Integer> getPkg_Avalibility() {
		return getDelegate().getPropertyValues(getOwlIndividual(), Vocabulary.DATA_PROPERTY_PKG_AVALIBILITY, Integer.class);
    }

    public boolean hasPkg_Avalibility() {
		return !getPkg_Avalibility().isEmpty();
    }

    public void addPkg_Avalibility(Integer newPkg_Avalibility) {
	    getDelegate().addPropertyValue(getOwlIndividual(), Vocabulary.DATA_PROPERTY_PKG_AVALIBILITY, newPkg_Avalibility);
    }

    public void removePkg_Avalibility(Integer oldPkg_Avalibility) {
		getDelegate().removePropertyValue(getOwlIndividual(), Vocabulary.DATA_PROPERTY_PKG_AVALIBILITY, oldPkg_Avalibility);
    }


    /* ***************************************************
     * Data Property http://www.le.ac.uk/travelAgencyOntology.owl#Pkg_Detail
     */
     
    public Collection<? extends String> getPkg_Detail() {
		return getDelegate().getPropertyValues(getOwlIndividual(), Vocabulary.DATA_PROPERTY_PKG_DETAIL, String.class);
    }

    public boolean hasPkg_Detail() {
		return !getPkg_Detail().isEmpty();
    }

    public void addPkg_Detail(String newPkg_Detail) {
	    getDelegate().addPropertyValue(getOwlIndividual(), Vocabulary.DATA_PROPERTY_PKG_DETAIL, newPkg_Detail);
    }

    public void removePkg_Detail(String oldPkg_Detail) {
		getDelegate().removePropertyValue(getOwlIndividual(), Vocabulary.DATA_PROPERTY_PKG_DETAIL, oldPkg_Detail);
    }


    /* ***************************************************
     * Data Property http://www.le.ac.uk/travelAgencyOntology.owl#Pkg_Duration
     */
     
    public Collection<? extends Integer> getPkg_Duration() {
		return getDelegate().getPropertyValues(getOwlIndividual(), Vocabulary.DATA_PROPERTY_PKG_DURATION, Integer.class);
    }

    public boolean hasPkg_Duration() {
		return !getPkg_Duration().isEmpty();
    }

    public void addPkg_Duration(Integer newPkg_Duration) {
	    getDelegate().addPropertyValue(getOwlIndividual(), Vocabulary.DATA_PROPERTY_PKG_DURATION, newPkg_Duration);
    }

    public void removePkg_Duration(Integer oldPkg_Duration) {
		getDelegate().removePropertyValue(getOwlIndividual(), Vocabulary.DATA_PROPERTY_PKG_DURATION, oldPkg_Duration);
    }


    /* ***************************************************
     * Data Property http://www.le.ac.uk/travelAgencyOntology.owl#Pkg_GuidedTour
     */
     
    public Collection<? extends String> getPkg_GuidedTour() {
		return getDelegate().getPropertyValues(getOwlIndividual(), Vocabulary.DATA_PROPERTY_PKG_GUIDEDTOUR, String.class);
    }

    public boolean hasPkg_GuidedTour() {
		return !getPkg_GuidedTour().isEmpty();
    }

    public void addPkg_GuidedTour(String newPkg_GuidedTour) {
	    getDelegate().addPropertyValue(getOwlIndividual(), Vocabulary.DATA_PROPERTY_PKG_GUIDEDTOUR, newPkg_GuidedTour);
    }

    public void removePkg_GuidedTour(String oldPkg_GuidedTour) {
		getDelegate().removePropertyValue(getOwlIndividual(), Vocabulary.DATA_PROPERTY_PKG_GUIDEDTOUR, oldPkg_GuidedTour);
    }


    /* ***************************************************
     * Data Property http://www.le.ac.uk/travelAgencyOntology.owl#Pkg_ID
     */
     
    public Collection<? extends Integer> getPkg_ID() {
		return getDelegate().getPropertyValues(getOwlIndividual(), Vocabulary.DATA_PROPERTY_PKG_ID, Integer.class);
    }

    public boolean hasPkg_ID() {
		return !getPkg_ID().isEmpty();
    }

    public void addPkg_ID(Integer newPkg_ID) {
	    getDelegate().addPropertyValue(getOwlIndividual(), Vocabulary.DATA_PROPERTY_PKG_ID, newPkg_ID);
    }

    public void removePkg_ID(Integer oldPkg_ID) {
		getDelegate().removePropertyValue(getOwlIndividual(), Vocabulary.DATA_PROPERTY_PKG_ID, oldPkg_ID);
    }


    /* ***************************************************
     * Data Property http://www.le.ac.uk/travelAgencyOntology.owl#Pkg_budget
     */
     
    public Collection<? extends String> getPkg_budget() {
		return getDelegate().getPropertyValues(getOwlIndividual(), Vocabulary.DATA_PROPERTY_PKG_BUDGET, String.class);
    }

    public boolean hasPkg_budget() {
		return !getPkg_budget().isEmpty();
    }

    public void addPkg_budget(String newPkg_budget) {
	    getDelegate().addPropertyValue(getOwlIndividual(), Vocabulary.DATA_PROPERTY_PKG_BUDGET, newPkg_budget);
    }

    public void removePkg_budget(String oldPkg_budget) {
		getDelegate().removePropertyValue(getOwlIndividual(), Vocabulary.DATA_PROPERTY_PKG_BUDGET, oldPkg_budget);
    }


    /* ***************************************************
     * Data Property http://www.le.ac.uk/travelAgencyOntology.owl#Pkg_type
     */
     
    public Collection<? extends String> getPkg_type() {
		return getDelegate().getPropertyValues(getOwlIndividual(), Vocabulary.DATA_PROPERTY_PKG_TYPE, String.class);
    }

    public boolean hasPkg_type() {
		return !getPkg_type().isEmpty();
    }

    public void addPkg_type(String newPkg_type) {
	    getDelegate().addPropertyValue(getOwlIndividual(), Vocabulary.DATA_PROPERTY_PKG_TYPE, newPkg_type);
    }

    public void removePkg_type(String oldPkg_type) {
		getDelegate().removePropertyValue(getOwlIndividual(), Vocabulary.DATA_PROPERTY_PKG_TYPE, oldPkg_type);
    }


}
