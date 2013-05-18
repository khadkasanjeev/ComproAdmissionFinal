/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.mum.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 *
 * @author sailendra
 */
@Entity
public class EducationSection extends Section implements Serializable {
    
      private String yesGradHigh;
    private String noGradHigh;
    private String yearrHighEdu;
    private String fieldHighEdu;
    private String degreeHighEdu;
    private String countryDegreeGrant;
    private String gradingScale;
    private String gpa;
    private String otherGradeScale;

    public String getYesGradHigh() {
        return yesGradHigh;
    }

    public void setYesGradHigh(String yesGradHigh) {
        this.yesGradHigh = yesGradHigh;
    }

    public String getNoGradHigh() {
        return noGradHigh;
    }

    public void setNoGradHigh(String noGradHigh) {
        this.noGradHigh = noGradHigh;
    }

    public String getYearrHighEdu() {
        return yearrHighEdu;
    }

    public void setYearrHighEdu(String yearrHighEdu) {
        this.yearrHighEdu = yearrHighEdu;
    }

    public String getFieldHighEdu() {
        return fieldHighEdu;
    }

    public void setFieldHighEdu(String fieldHighEdu) {
        this.fieldHighEdu = fieldHighEdu;
    }

    public String getDegreeHighEdu() {
        return degreeHighEdu;
    }

    public void setDegreeHighEdu(String degreeHighEdu) {
        this.degreeHighEdu = degreeHighEdu;
    }

    public String getCountryDegreeGrant() {
        return countryDegreeGrant;
    }

    public void setCountryDegreeGrant(String countryDegreeGrant) {
        this.countryDegreeGrant = countryDegreeGrant;
    }

    public String getGradingScale() {
        return gradingScale;
    }

    public void setGradingScale(String gradingScale) {
        this.gradingScale = gradingScale;
    }

    public String getGpa() {
        return gpa;
    }

    public void setGpa(String gpa) {
        this.gpa = gpa;
    }

    public String getOtherGradeScale() {
        return otherGradeScale;
    }

    public void setOtherGradeScale(String otherGradeScale) {
        this.otherGradeScale = otherGradeScale;
    }
  
 

    

    
}
