/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.mum.view;

import edu.mum.commonEnums.RegLogin;
import edu.mum.control.LoginControlBean;
import edu.mum.model.exceptions.RollbackFailureException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.ejb.EJB;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;

/**
 *
 * @author Admin
 */
@ManagedBean
@RequestScoped
public class LoginMB {

    /** Creates a new instance of LoginMB */
    public LoginMB() {
    }
    @EJB
    private LoginControlBean myLoginContBean;
    private String emailAddr;
    private String password;

    public String getEmailAddr() {
        return emailAddr;
    }

    public void setEmailAddr(String emailAddr) {
        this.emailAddr = emailAddr;
    }

    public String loginUser() {

        try {
            if (myLoginContBean.checkLogin(this) == RegLogin.LoginApplicantSuccess) {
                //successful login
                //the return should specify success with applicant or admin
                //which we use to navigate to the correct page.

                FacesMessage facesMessage = new FacesMessage("TBD - Navigate to application");
                facesMessage.setSeverity(FacesMessage.SEVERITY_INFO);
                FacesContext.getCurrentInstance().addMessage(null, facesMessage);

                return "loginConfirmation.xhtml";
            } else {
                FacesMessage facesMessage = new FacesMessage("TBD - Error");
                facesMessage.setSeverity(FacesMessage.SEVERITY_INFO);
                FacesContext.getCurrentInstance().addMessage(null, facesMessage);
                
                return "login.xhtml";
            }
        } catch (RollbackFailureException ex) {
            Logger.getLogger(LoginMB.class.getName()).log(Level.SEVERE, null, ex);
            return "login.xhtml";
        } catch (Exception ex) {
            Logger.getLogger(LoginMB.class.getName()).log(Level.SEVERE, null, ex);
            return "login.xhtml";
        }
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
