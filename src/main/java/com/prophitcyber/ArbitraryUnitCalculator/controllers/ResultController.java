package com.prophitcyber.ArbitraryUnitCalculator.controllers;

import com.prophitcyber.ArbitraryUnitCalculator.models.CalculatedValues;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ResultController {

    private final
    @RequestMapping("/result")
    String getResult(Model model){
        CalculatedValues theseValues = new CalculatedValues();
        model.addAttribute("newValue", theseValues.getNewValue());
        model.addAttribute("originalUnit", theseValues.getOriginalUnit());

        return "results/results";
    }
}
