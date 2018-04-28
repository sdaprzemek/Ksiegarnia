package com.designpatterns.calculator;

public interface Calculator {

    double calculate(double amount);

    void setCalculatorPolicy(CalculatorPolicy calculatorPolicy);
}
