/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leleo.petprofiler;

/**
 *
 * @author leleo
 */
public class Pet {
    
    protected String name = "";
    protected int age = 0;
    private int ageMultiplier = 1;
    
    
    public Pet (String someName, int someAge){
        name = someName;
        age  = someAge;
        
    }
    
    public Pet (String someName, int someAge, int someMultiplier){
        name = someName;
        age  = someAge;
        ageMultiplier = someMultiplier;
        
    }
    
    public String selfDescrible(){
        return "Hello, my name is " + name + ". I am " +
        + calculateRealAge() +  " in human year(s).";
        
    }
    
    public int calculateRealAge(){
        return age * ageMultiplier;
    }
            
}
