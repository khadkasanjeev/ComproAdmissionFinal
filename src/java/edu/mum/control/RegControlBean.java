/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.mum.control;

import edu.mum.commonEnums.ConstantInts;
import edu.mum.commonEnums.RegLogin;
import edu.mum.model.ApplicantDaoBean;
import edu.mum.model.Applicant;
import edu.mum.model.exceptions.RollbackFailureException;
import edu.mum.view.RegMB;
import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.ejb.LocalBean;

/**
 *
 * @author Admin
 */
@Stateless
@LocalBean
public class RegControlBean {
    @EJB
    ApplicantDaoBean myApplicantDAO;

    /**
     * check that the email address is unique if not - fail with non-unique email address
     *generate password - if not fail with password sys fail
     *new applicant and populate with RegMB fields and new password
     *save the applicant in the DB
     *send email with password
     *if all goes well return success
     * @param regMB
     * @return
     * @throws RollbackFailureException
     * @throws Exception 
     */
    public RegLogin saveRegInfo(RegMB regMB) throws RollbackFailureException, Exception {

        if (myApplicantDAO.findApplicantByEmailAddr(regMB.getEmailAddr()) != null) {
            //an Applicant with this emailAddress exists -- giveup with duplicate email address
            System.out.println("RegControlBean duplicate email");
            return RegLogin.DupEmail;
        }
        // if we made it to here the email address is unique -- proceed to save the applicant
        System.out.println("RegControlBean unique email = " + regMB.getEmailAddr());
        Applicant newAppl = new Applicant();

        newAppl.setEmailAddr(regMB.getEmailAddr());
        int len = ConstantInts.PasswordLength.getValue();
        newAppl.setPassword(PasswordGenerator.getPassword(len));
        newAppl.setFirstName(regMB.getFirstName());
        newAppl.setLastName(regMB.getLastName());
        newAppl.setMiddleName(regMB.getMiddleName());
        //note there is no Application yet
        newAppl.setApplication(null);

       // System.out.println("RegControlBean saving the applicant");
        String fromEmail = "snolle@mum.edu";
        String subject = "MUM Application Password";
        String text = ("Your password is " + newAppl.getPassword());

        myApplicantDAO.create(newAppl);
        SendMail mailSender = new SendMail(fromEmail, regMB.getEmailAddr(), subject, text);
        mailSender.send();

        return RegLogin.RegSuccess;

    }
}
