package fis.java.bigexample.model;

import fis.java.bigexample.enums.CaseStatus;
import fis.java.bigexample.enums.CaseType;

import java.time.LocalDateTime;
import java.util.Set;

public class CriminalCase extends AbstractEntity {
    private CaseStatus status;
    private CaseType type;
    private Detective leadInvestigator;
    private Set<Detective> assigned;
    private String number;
    private String shortDescription;
    private String detailedDescription;
    private String notes;
    private Set<Evidence> evidencesSet;

    public CriminalCase() {
    }

    public CriminalCase(String number, CaseType type, String shortDescription, String detailedDescription,
                        CaseStatus status, String notes, Set<Evidence> evidencesSet,
                        Detective leadInvestigator, Set<Detective> assigned) {

        this.number = number;
        this.type = type;
        this.shortDescription = shortDescription;
        this.detailedDescription = detailedDescription;
        this.status = status;
        this.notes = notes;
        this.evidencesSet = evidencesSet;
        this.leadInvestigator = leadInvestigator;
        this.assigned = assigned;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public CaseType getType() {
        return type;
    }

    public void setType(CaseType type) {
        this.type = type;
    }

    public String getShortDescription() {
        return shortDescription;
    }

    public void setShortDescription(String shortDescription) {
        this.shortDescription = shortDescription;
    }

    public String getDetailedDescription() {
        return detailedDescription;
    }

    public void setDetailedDescription(String detailedDescription) {
        this.detailedDescription = detailedDescription;
    }

    public CaseStatus getStatus() {
        return status;
    }

    public void setStatus(CaseStatus status) {
        this.status = status;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public Set<Evidence> getEvidencesSet() {
        return evidencesSet;
    }

    public void setEvidencesSet(Set<Evidence> evidencesSet) {
        this.evidencesSet = evidencesSet;
    }

    public Detective getLeadInvestigator() {
        return leadInvestigator;
    }

    public void setLeadInvestigator(Detective leadInvestigator) {
        this.leadInvestigator = leadInvestigator;
    }

    public Set<Detective> getAssigned() {
        return assigned;
    }

    public void setAssigned(Set<Detective> assigned) {
        this.assigned = assigned;
    }
}
