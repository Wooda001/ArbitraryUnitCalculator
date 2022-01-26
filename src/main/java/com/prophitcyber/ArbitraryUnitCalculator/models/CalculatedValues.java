package com.prophitcyber.ArbitraryUnitCalculator.models;

import java.util.Objects;

public class CalculatedValues {

    private double newValue;
    private String originalUnit;
    private String normalUnit;
    private double length;


    public CalculatedValues(String originalUnit, String normalUnit, double length) {
        this.originalUnit = originalUnit;
        this.normalUnit = normalUnit;
        this.length = length;
    }

    public double getNewValue() {
        return newValue;
    }

    public String getOriginalUnit() {
        return originalUnit;
    }

    public void calculateValues() {
    if (Objects.equals(normalUnit, "cm")){
        this.newValue = (double) length / 2.54;
    } else {
        this.newValue = (double) length;
    }
    }
    public String generateFact1(){
        return "1 Mile is equal to " + (double) Math.round((63360/getNewValue()) * 100 )/100 + " " + originalUnit + "s";
    }
    public String generateFact2(){
        return "The Statue of Liberty is " + (double) Math.round(((305*12)/getNewValue()) * 100)/100 + " " + originalUnit + "s tall";
    }
    public String generateFact3(){
        return "The Mariana's Trench is " + (double) Math.round(((36201*12)/getNewValue()) * 100 )/100 + " " + originalUnit + "s deep";
    }

}