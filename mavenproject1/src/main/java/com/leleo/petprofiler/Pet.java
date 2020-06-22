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
    
    private String name = "";
    private int age = 0;
    
    
    public Pet (String someName, int someAge){
        name = someName;
        age  = someAge;
        
    }
    
    public String selfDecrible(){
        return "Hello, my name is " + name + ". I am " +
        + age +  "year(s) old.";
        
    }
            
}
