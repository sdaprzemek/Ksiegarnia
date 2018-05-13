package com.designpatterns.factory.pizzaFactory;

import java.util.Scanner;

class PizzaApp {

    public static void main(String[] args) {
        PizzaFactory pizzaFactory = PizzaFactory.getInstance();

        System.out.println("Please choose pizza from our menu : ");
        System.out.println("1. Margheritta ");
        System.out.println("2. Hawaii");
        System.out.println("3. Diabolo");
        System.out.println("4. Double Chees");
        System.out.println("5. Vege");
        Scanner in = new Scanner(System.in);
        Pizza pizza = pizzaFactory.createPizza(in.nextInt());
        pizza.showIngredients();

    }
}
