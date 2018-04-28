package com.designpatterns.calculator;

import java.util.Scanner;

public class SalaryApp {

    public static void main(String[] args) {
        System.out.println("Hello, please choose country: ");
        System.out.println("1. Poland");
        System.out.println("2. Germany");

        Scanner in = new Scanner(System.in);
        int country = in.nextInt();

        CalculatorFactory factory = new CalculatorFactory();
        Calculator calculator = factory.getCalculator(country);

        System.out.println("If you are a student press 1, if politic press 2, otherwise press other number");
        int policy = in.nextInt();

        if (policy == 1) {
            calculator.setCalculatorPolicy(new StudentCalculatorPolicy());
        } else if (policy == 2) {
            calculator.setCalculatorPolicy(new ForPoliticsCalculatorPolicy());
        }
        double salary = 10000;
        double salaryAfterTaxes = calculator.calculate(salary);
        System.out.println("Your Slaray after Taxing : " + salaryAfterTaxes); //TODO <-- dokonczyc ten fragment
    }
}
