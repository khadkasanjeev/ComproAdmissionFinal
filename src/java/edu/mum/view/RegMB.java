/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.mum.view;

import edu.mum.commonEnums.RegLogin;
import edu.mum.control.RegControlBean;
import edu.mum.model.exceptions.RollbackFailureException;
import java.io.Serializable;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.ejb.EJB;
import javax.enterprise.context.SessionScoped;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;

/**
 *
 * @author Admin
 */
@ManagedBean
@SessionScoped
public class RegMB implements Serializable {

    /** Creates a new instance of RegMB */
    public RegMB() {
    }
    @EJB
    private RegControlBean myRegContBean;
    private String firstName;
    private String middleName;
    private String lastName;
    private String emailAddr;
    
    public String saveRegInfo() throws RollbackFailureException, Exception {
        //FacesMessage facesMessage = new FacesMessage("RegMB passes reg info to RegController");
       // facesMessage.setSeverity(FacesMessage.SEVERITY_INFO);
       // FacesContext.getCurrentInstance().addMessage(null, facesMessage);
       try {
            if (myRegContBean.saveRegInfo(this) == RegLogin.RegSuccess) {

                System.out.println("sds");
                return "regConfirmation.xhtml";
            } else {
                System.out.println("sds2");
                return "regFailConfirmation.xhtml";
            }
      } catch (RollbackFailureException ex) {
           Logger.getLogger(RegMB.class.getName()).log(Level.SEVERE, null, ex);
      } catch (Exception ex) {
           Logger.getLogger(RegMB.class.getName()).log(Level.SEVERE, null, ex);
      }
      return "regFailConfirmation.xhtml";
      

    }

    public String getEmailAddr() {
        return emailAddr;
    }

    public void setEmailAddr(String emailAddr) {
        this.emailAddr = emailAddr;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }
    
    
}
