package com.mycompany.calculator;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 *
 * @author daniel.builes
 */

@Controller
public class CalculadoraController {
    
    
    @GetMapping("/add")
    public String add(@RequestParam(name="number", required=true, defaultValue="0")String valor){
        CurrentValue cv = CurrentValue.getInstance();
        cv.setCurrentValue(CurrentValue.getInstance().getCurrentValue() + Double.parseDouble(valor));
        return "calculadora";
    }
    
    @GetMapping("/calc")
    public String defaultCalc(){
        return "calculadora";
    }
    
}
