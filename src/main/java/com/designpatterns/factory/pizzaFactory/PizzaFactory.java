package com.designpatterns.factory.pizzaFactory;

public class PizzaFactory {

    //wplecione do Factory wzorzec Singleton
    private static PizzaFactory pizzaFactory = null;
    private PizzaFactory(){}

    public static PizzaFactory getInstance(){
        if (pizzaFactory == null) {
            pizzaFactory = new PizzaFactory();
        }
        return pizzaFactory;
    }
    //--------------------------------------------------------

    public Pizza createPizza(int pizzaNumber) {
        switch (pizzaNumber) {
            case 1:
                return new Margheritta();
            case 2:
                return new Hawaii();
            case 3:
                return new Diabolo();
            case 4:
                return new DoublleChees();
            case 5:
                return new Vege();
        }
        throw new RuntimeException("Invalid number, out of the menu");
    }
}
