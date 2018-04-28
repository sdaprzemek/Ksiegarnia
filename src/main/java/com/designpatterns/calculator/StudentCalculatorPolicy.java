package com.designpatterns.calculator;

public class StudentCalculatorPolicy implements CalculatorPolicy{

    public double calculate(double basicSalary) {
        return basicSalary * 1.2;
    }
}
