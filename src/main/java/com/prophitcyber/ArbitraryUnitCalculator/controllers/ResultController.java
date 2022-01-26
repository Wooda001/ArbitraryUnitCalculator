package com.prophitcyber.ArbitraryUnitCalculator.controllers;

import com.prophitcyber.ArbitraryUnitCalculator.models.CalculatedValues;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ResultController {

    @RequestMapping("/")
    String getIndex(){
        return "results/index";
    }
    private final
    @RequestMapping("/result")
    String getResult(Model model, @RequestParam(value = "originalUnit") String originalUnit, @RequestParam(value = "length") double length, @RequestParam(value = "normalUnit") String normalUnit){
        CalculatedValues theseValues = new CalculatedValues(originalUnit, normalUnit, length);
        theseValues.calculateValues();
        model.addAttribute("factOne", theseValues.generateFact1());
        model.addAttribute("factTwo", theseValues.generateFact2());
        model.addAttribute("factThree", theseValues.generateFact3());
        return "results/results";
    }
}
