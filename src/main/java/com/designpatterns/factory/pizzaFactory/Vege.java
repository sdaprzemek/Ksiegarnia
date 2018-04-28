package com.designpatterns.factory.pizzaFactory;

public class Vege implements Pizza {

    public void showIngredients() {
        System.out.println("Ingridients :");
        System.out.println("1. Cheese");
        System.out.println("2. Mozzarella");
        System.out.println("3. Rucola");
        System.out.println("4. Paprica");
        System.out.println("5. Tomatos");
    }
}
