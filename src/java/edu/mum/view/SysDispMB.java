/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.mum.view;

import edu.mum.commonEnums.RegLogin;
import edu.mum.control.OverrideControlBean;
import edu.mum.model.exceptions.RollbackFailureException;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;

/**
 *
 * @author Sanjeev
 */
@Named(value = "sysDispMB")
@ManagedBean
@SessionScoped
public class SysDispMB implements Serializable {

    private String emailAddr;
    private String dispositionStatus;

    public String getEmailAddr() {
        return emailAddr;
    }

    public void setEmailAddr(String emailAddr) {
        this.emailAddr = emailAddr;
    }
    private OverrideControlBean overideControl;

    public SysDispMB() {
    }

    public String getSysDisp() {
        
        return "sysDisposition";
    }

    public void success() {
        
    }
}
