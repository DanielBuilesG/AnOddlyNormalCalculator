package com.mycompany.calculator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 *
 * @author daniel.builes
 */

@Controller
public class CalculadoraController {
    
    
    @Autowired
    CurrentValue cv;
    
    @GetMapping("/add")
    public String add(@RequestParam(name="number", required=true, defaultValue="0") String valor, Model model){
        cv.setCurrentValue(cv.getCurrentValue() + Double.parseDouble(valor));
        model.addAttribute("currval", cv.getCurrentValue());
        return "calculadora";
    }
    
    @GetMapping("/multi")
    public String multi(@RequestParam(name="number", required=true, defaultValue="0") String valor, Model model){
        cv.setCurrentValue(cv.getCurrentValue() * Double.parseDouble(valor));
        model.addAttribute("currval", cv.getCurrentValue());
        return "calculadora";
    }
    
    @GetMapping("/substract")
    public String substract(@RequestParam(name="number", required=true, defaultValue="0") String valor, Model model){
        cv.setCurrentValue(cv.getCurrentValue() - Double.parseDouble(valor));
        model.addAttribute("currval", cv.getCurrentValue());
        return "calculadora";
    }
    
    
    @GetMapping("/divide")
    public String divide(@RequestParam(name="number", required=true, defaultValue="0") String valor, Model model){
        cv.setCurrentValue(cv.getCurrentValue() / Double.parseDouble(valor));
        model.addAttribute("currval", cv.getCurrentValue());
        return "calculadora";
    }
    
    @GetMapping("/calc")
    public String defaultCalc(Model model){
        model.addAttribute("currval", 0);
        return "calculadora";
    }
    
}
