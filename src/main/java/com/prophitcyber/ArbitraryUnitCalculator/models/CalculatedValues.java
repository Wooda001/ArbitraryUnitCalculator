package com.prophitcyber.ArbitraryUnitCalculator.models;

public class CalculatedValues {

    private double newValue;
    private String originalUnit;

    public CalculatedValues() {
        this.newValue = 200;
        this.originalUnit = "Banana";
    }

    public double getNewValue() {
        return newValue;
    }

    public String getOriginalUnit() {
        return originalUnit;
    }
}
