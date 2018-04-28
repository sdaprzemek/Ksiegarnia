package com.designpatterns.decorator;

public class MilkDecorator implements HotDrink {

    HotDrink hotDrink;

    public MilkDecorator(HotDrink hotDrink) {
        this.hotDrink = hotDrink;

    }

    public void prepare() {
        hotDrink.prepare();
        System.out.println("Adding milk ...");
    }

}
