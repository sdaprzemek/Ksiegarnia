package com.designpatterns.calculator;

public class GermanyCalculator implements Calculator {

    private double zusAmount;

    private int taxPercentage;

    private CalculatorPolicy calculatorPolicy;

    public GermanyCalculator(CalculatorPolicy calculatorPolicy) {
        this.calculatorPolicy = calculatorPolicy;
        zusAmount = 1400;
        taxPercentage = 10;
    }

    public double calculate(double amount) {
        double newAmount = (amount - zusAmount) - (amount - zusAmount) * (taxPercentage / 100.0);
        return calculatorPolicy.calculate(newAmount);
    }

    public void setCalculatorPolicy(CalculatorPolicy calculatorPolicy) {
        this.calculatorPolicy = calculatorPolicy;

    }
}
