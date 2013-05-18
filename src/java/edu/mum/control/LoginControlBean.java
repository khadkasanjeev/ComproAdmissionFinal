/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.mum.control;

import edu.mum.commonEnums.RegLogin;
import edu.mum.model.Applicant;
import edu.mum.model.ApplicantDaoBean;
import edu.mum.model.exceptions.RollbackFailureException;
import edu.mum.view.LoginMB;
import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.ejb.LocalBean;

/**
 *
 * @author Admin
 */
@Stateless
@LocalBean
public class LoginControlBean {

   @EJB
    ApplicantDaoBean myApplicantDAO;

    /**
     * first find an applicant by emailAddr
     *verify that the passwords match
     * @param loginMB
     * @return
     * @throws RollbackFailureException
     * @throws Exception 
     */
    public RegLogin checkLogin(LoginMB loginMB) throws RollbackFailureException, Exception {
        
        // in iteration2 we need to modifiy this code to get a USER from the DB and then decide if an applicant or admin
        String loginEmail = loginMB.getEmailAddr();
        System.out.println("LoginControlBean email = " + loginEmail);
        Applicant newAppl = myApplicantDAO.findApplicantByEmailAddr(loginEmail);
        if (newAppl == null) {
            //no Applicant with this emailAddress exists -- giveup with no login user found
            System.out.println("LoginControlBean no user found");
            return RegLogin.NoUser;
        }
        String password = newAppl.getPassword();
        System.out.println("newAppl password =" +password);

        if (password.equals(loginMB.getPassword()))
        {
            //successfully found the correct applicant
            //we will want to sent them to their application where they last 
            //left off -- for now just return success
            //TBD - we should at this point check if our User is an applicant or admin
            //for now we only have applicants
            return RegLogin.LoginApplicantSuccess;
        }

        else {
            //no luck for this login
            return RegLogin.BadPassword;
        }
    }

}
