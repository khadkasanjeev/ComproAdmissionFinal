/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.mum.commonEnums;

/**
 *
 * @author Admin
 */
public enum ConstantInts {
    //these are common constant integers
    PasswordLength(6),
    MaxLoginAttempts(3);
    
    private final int value;

    public int getValue() {
        return value;
    }
    ConstantInts(int v){
        value = v;
    }
    
}
