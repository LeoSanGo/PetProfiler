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
public class Dog extends Pet{
    
    public Dog(String someName, int someAge) {
        super(someName, someAge, 7);
        
    }
    
    @Override
    public String selfDescrible(){
        return "Fun dog looking to make friends! " + super.selfDescrible();
    }
    
}
