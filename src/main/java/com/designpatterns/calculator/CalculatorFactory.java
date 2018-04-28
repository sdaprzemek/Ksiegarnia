package com.designpatterns.calculator;

public class CalculatorFactory {


    public Calculator getCalculator (int calculatorType) {
        switch (calculatorType) {
            case 1:
                return new PolandCalculator(new BasicCalculatorPolicy());
            case 2:
                return new GermanyCalculator(new BasicCalculatorPolicy());
        }
        throw new RuntimeException("Wrong calculator type !");
    }
}
