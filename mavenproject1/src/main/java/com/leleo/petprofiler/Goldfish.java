package com.leleo.petprofiler;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author leleo
 */
public class Goldfish extends Pet{
    
    public Goldfish(String someName, int someAge) {
        super(someName, someAge);
    }
    
    @Override
    public String selfDescrible(){
        return "Hello, my name is " + name + ". I am a goldfish and I am " +
                age + " years old. I swim around and nap all the day";
    }
    
}
