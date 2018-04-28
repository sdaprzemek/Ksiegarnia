package com.designpatterns.factory.pizzaFactory;

public class Hawaii implements Pizza{

    public void showIngredients() {
        System.out.println("Ingridients :");
        System.out.println("1. Cheese");
        System.out.println("2. Mozzarella");
        System.out.println("3. PineApple");
    }
}
