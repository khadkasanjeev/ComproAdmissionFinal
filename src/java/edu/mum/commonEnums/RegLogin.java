/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.mum.commonEnums;

/**
 *
 * @author Admin
 */
public enum RegLogin {
    //these are common results for login and registration
    DupEmail("Duplicate Email"),
    NoUser("No User Found"),
    RegSuccess("Register Success"),
    RegFail("Register Failure"),
    LoginApplicantSuccess("Login Applicant Success"),
    LoginAdminSuccess("Login Admin Success"),
    LoginFail("Login Failure"), 
    BadPassword("Invalid Password");
    
    private final String value;

    public String getValue() {
        return value;
    }
    RegLogin(String v){
        value = v;
    }
    
}
