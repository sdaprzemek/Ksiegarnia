package com.designpatterns.decorator.CarShop;

public class HybrideEngineDecorator implements Car {
    private Car car;

    public HybrideEngineDecorator(Car car) {
        this.car = car;
    }

    public void configure() {
        car.configure();
        System.out.println("Adding Hybride Engine ... ");
    }
}
