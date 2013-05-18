/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.mum.model;

import java.io.Serializable;
import javax.persistence.*;

/**
 *
 * @author Minh Nguyen
 */
@Entity
public class EnglishSection extends Section implements Serializable {
    private String englishReadWrite;
    private String englishSpeak;
    private String englishUnderstand;
    private String englishToeflYear;
    private String englishToeflScore;
    private String englishGreYear;
    private String englishGreVerbalScore;
    private String englishGreVerbalPercentile;
    private String englishGreQuantitativeScore;
    private String englishGreQuantitativePercentile;
    private String englishGreAnalyticalScore;
    private String englishGreAnalyticalPercentile;

    public String getEnglishReadWrite() {
        return englishReadWrite;
    }

    public void setEnglishReadWrite(String englishReadWrite) {
        this.englishReadWrite = englishReadWrite;
    }

    public String getEnglishSpeak() {
        return englishSpeak;
    }

    public void setEnglishSpeak(String englishSpeak) {
        this.englishSpeak = englishSpeak;
    }

    public String getEnglishUnderstand() {
        return englishUnderstand;
    }

    public void setEnglishUnderstand(String englishUnderstand) {
        this.englishUnderstand = englishUnderstand;
    }

    public String getEnglishToeflYear() {
        return englishToeflYear;
    }

    public void setEnglishToeflYear(String englishToeflYear) {
        this.englishToeflYear = englishToeflYear;
    }

    public String getEnglishToeflScore() {
        return englishToeflScore;
    }

    public void setEnglishToeflScore(String englishToeflScore) {
        this.englishToeflScore = englishToeflScore;
    }

    public String getEnglishGreYear() {
        return englishGreYear;
    }

    public void setEnglishGreYear(String englishGreYear) {
        this.englishGreYear = englishGreYear;
    }

    public String getEnglishGreVerbalScore() {
        return englishGreVerbalScore;
    }

    public void setEnglishGreVerbalScore(String englishGreVerbalScore) {
        this.englishGreVerbalScore = englishGreVerbalScore;
    }

    public String getEnglishGreVerbalPercentile() {
        return englishGreVerbalPercentile;
    }

    public void setEnglishGreVerbalPercentile(String englishGreVerbalPercentile) {
        this.englishGreVerbalPercentile = englishGreVerbalPercentile;
    }

    public String getEnglishGreQuantitativeScore() {
        return englishGreQuantitativeScore;
    }

    public void setEnglishGreQuantitativeScore(String englishGreQuantitativeScore) {
        this.englishGreQuantitativeScore = englishGreQuantitativeScore;
    }

    public String getEnglishGreQuantitativePercentile() {
        return englishGreQuantitativePercentile;
    }

    public void setEnglishGreQuantitativePercentile(String englishGreQuantitativePercentile) {
        this.englishGreQuantitativePercentile = englishGreQuantitativePercentile;
    }

    public String getEnglishGreAnalyticalScore() {
        return englishGreAnalyticalScore;
    }

    public void setEnglishGreAnalyticalScore(String englishGreAnalyticalScore) {
        this.englishGreAnalyticalScore = englishGreAnalyticalScore;
    }

    public String getEnglishGreAnalyticalPercentile() {
        return englishGreAnalyticalPercentile;
    }

    public void setEnglishGreAnalyticalPercentile(String englishGreAnalyticalPercentile) {
        this.englishGreAnalyticalPercentile = englishGreAnalyticalPercentile;
    }
    
}
