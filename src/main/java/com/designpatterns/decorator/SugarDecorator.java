package com.designpatterns.decorator;

public class SugarDecorator implements HotDrink  {

    private HotDrink hotDrink;

    public SugarDecorator(HotDrink hotDrink) {
        this.hotDrink = hotDrink;
    }

    public void prepare() {
        hotDrink.prepare();
        System.out.println("Added sugar ...");
    }

}
