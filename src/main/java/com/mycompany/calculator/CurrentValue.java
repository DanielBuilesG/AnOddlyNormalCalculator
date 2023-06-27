/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.calculator;

/**
 *
 * @author daniel.builes
 */
public class CurrentValue {

    private static CurrentValue currentVal = new CurrentValue();
    private double currentval =0;
    
    
    private CurrentValue(){}
    
    public static CurrentValue getInstance(){
        return currentVal;
    }
    
    public double getCurrentValue(){
        return currentval;
    }
    
    public void setCurrentValue(double newvalue){
        currentval = newvalue;
    }
}
