package com.designpatterns.calculator;

public class BasicCalculatorPolicy implements CalculatorPolicy {


    public double calculate(double basicSalary) {
        return basicSalary;
    }
}
