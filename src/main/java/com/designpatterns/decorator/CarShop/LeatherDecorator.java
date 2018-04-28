package com.designpatterns.decorator.CarShop;

public class LeatherDecorator implements Car {

    private Car car;

    public LeatherDecorator(Car car) {
        this.car = car;
    }

    public void configure() {
        car.configure();
        System.out.println("Adding leather ...");
    }
}
