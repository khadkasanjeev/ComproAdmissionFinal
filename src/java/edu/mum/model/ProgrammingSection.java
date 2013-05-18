/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.mum.model;

import java.io.Serializable;
import javax.persistence.*;

/**
 *
 *
 */
@Entity
public class ProgrammingSection extends Section implements Serializable {
    private String javaProf;
    private String CPPProf;
    private String CSharpProf;
    private String CProf;
    private String PascalProf;
    private String VB;
    private String OPS; 
    private String mostProfLang;

   

    public String getJavaProf() {
        return javaProf;
    }

    public void setJavaProf(String javaProf) {
        this.javaProf = javaProf;
    }

    public String getCPPProf() {
        return CPPProf;
    }

    public void setCPPProf(String CPPProf) {
        this.CPPProf = CPPProf;
    }

    public String getCSharpProf() {
        return CSharpProf;
    }

    public void setCSharpProf(String CSharpProf) {
        this.CSharpProf = CSharpProf;
    }

    public String getCProf() {
        return CProf;
    }

    public void setCProf(String CProf) {
        this.CProf = CProf;
    }

    public String getPascalProf() {
        return PascalProf;
    }

    public void setPascalProf(String PascalProf) {
        this.PascalProf = PascalProf;
    }

    public String getVB() {
        return VB;
    }

    public void setVB(String VB) {
        this.VB = VB;
    }

    public String getOPS() {
        return OPS;
    }

    public void setOPS(String OPS) {
        this.OPS = OPS;
    }

    public String getMostProfLang() {
        return mostProfLang;
    }

    public void setMostProfLang(String mostProfLang) {
        this.mostProfLang = mostProfLang;
    }
    
    
    
    
}
