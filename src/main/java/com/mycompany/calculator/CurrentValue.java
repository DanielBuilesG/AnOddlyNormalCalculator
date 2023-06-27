/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.calculator;

import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.SessionScope;

/**
 *
 * @author daniel.builes
 */

@Component
@SessionScope
public class CurrentValue {

    private double currentval =0;

    public CurrentValue(){}
    
    public double getCurrentValue(){
        return currentval;
    }
    
    public void setCurrentValue(double newvalue){
        currentval = newvalue;
    }
}
