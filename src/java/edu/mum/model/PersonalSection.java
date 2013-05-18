/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.mum.model;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

/**
 *
 * @author Minh Nguyen
 */
@Entity
public class PersonalSection extends Section implements Serializable {
    private Boolean personalpreApplied;
    private String personalfirstName;
    private String personalmiddleName;
    private String personallastName;
    private String personalsex;
    private String personalmaritalStatus;
    private String personalcountryOfCitizenship;
    

    public Boolean getPersonalpreApplied() {
        return personalpreApplied;
    }

    public void setPersonalpreApplied(Boolean personalpreApplied) {
        this.personalpreApplied = personalpreApplied;
    }

    public String getPersonalfirstName() {
        return personalfirstName;
    }

    public void setPersonalfirstName(String personalfirstName) {
        this.personalfirstName = personalfirstName;
    }

    public String getPersonalmiddleName() {
        return personalmiddleName;
    }

    public void setPersonalmiddleName(String personalmiddleName) {
        this.personalmiddleName = personalmiddleName;
    }

    public String getPersonallastName() {
        return personallastName;
    }

    public void setPersonallastName(String personallastName) {
        this.personallastName = personallastName;
    }

    public String getPersonalsex() {
        return personalsex;
    }

    public void setPersonalsex(String personalsex) {
        this.personalsex = personalsex;
    }

    public String getPersonalmaritalStatus() {
        return personalmaritalStatus;
    }

    public void setPersonalmaritalStatus(String personalmaritalStatus) {
        this.personalmaritalStatus = personalmaritalStatus;
    }

    public String getPersonalcountryOfCitizenship() {
        return personalcountryOfCitizenship;
    }

    public void setPersonalcountryOfCitizenship(String personalcountryOfCitizenship) {
        this.personalcountryOfCitizenship = personalcountryOfCitizenship;
    }

    
}
