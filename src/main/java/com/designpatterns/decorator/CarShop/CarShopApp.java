package com.designpatterns.decorator.CarShop;

import java.util.Scanner;

class CarShopApp {

    public static void main(String[] args) {
        printMainMenu();

        Scanner in = new Scanner(System.in);
        int producentNumber = in.nextInt();

        Car car = null;

        switch (producentNumber) {
            case 1:
                car = new Volvo();
                break;
            case 2:
                car = new Fiat();
                break;
            case 3:
                car = new Renault();
                break;
        }

        printAddonsMenu();

        int extrasAddons = in.nextInt();

        while (extrasAddons != 4) {
            switch (extrasAddons) {
                case 1:
                    car = new TempomatDecorator(car);
                    break;
                case 2:
                    car = new LeatherDecorator(car);
                    break;
                case 3:
                    car = new HybrideEngineDecorator(car);
                    break;
            }
        }

        car.configure();


    }

    private static void printAddonsMenu() {
        System.out.println("Choose extra addons to your new Car:");
        System.out.println("1. Tempomat");
        System.out.println("2. Leather");
        System.out.println("3. Hybride Engine");
        System.out.println("4. END");
    }

    private static void printMainMenu() {
        System.out.println("Hello in our Car Shop");
        System.out.println("Please choose producent:");
        System.out.println("1. Volvo");
        System.out.println("2. Fiat");
        System.out.println("3. Renault");
    }
}
