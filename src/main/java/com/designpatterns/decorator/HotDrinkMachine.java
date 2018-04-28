package com.designpatterns.decorator;

import java.util.Scanner;

public class HotDrinkMachine {

    public static void main(String[] args) {
        printMainMenu();

        Scanner in = new Scanner(System.in);
        int drinkNumber = in.nextInt();
        HotDrink hotDrink = null;

        switch (drinkNumber) {
            case 1:
                hotDrink = new Tea();
                break;
            case 2:
                hotDrink = new Coffee();
                break;
            case 3:
                hotDrink = new Chocolate();
                break;
        }

        printExtras();
        int extrasNumber = in.nextInt();

        while(extrasNumber != 4) {
            switch (extrasNumber) {
                case 1:
                    hotDrink = new SugarDecorator(hotDrink);
                    break;
                case 2:
                    hotDrink = new MilkDecorator(hotDrink);
                    break;
                case 3:
                    hotDrink = new ToppingDecorator(hotDrink);
                    break;
            }
        }

        hotDrink.prepare();
    }

    private static void printMainMenu() {
        System.out.println("Hello, choose hot drink:");
        System.out.println("1. Tea");
        System.out.println("2. Coffe");
        System.out.println("3. Chocolate");
    }

    private static void printExtras() {
        System.out.println("Add extras :");
        System.out.println("1. Sugar");
        System.out.println("2. Milk");
        System.out.println("3. Kakao tapping");
        System.out.println("4. End");
    }
}
