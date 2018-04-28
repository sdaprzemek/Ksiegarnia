package com.designpatterns.calculator;

public class ForPoliticsCalculatorPolicy implements CalculatorPolicy {
    public double calculate(double basicSalary) {
        return basicSalary * 5;
    }
}
