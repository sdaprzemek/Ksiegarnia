package com.designpatterns.decorator.CarShop;

public class TempomatDecorator implements Car {

    private Car car;

    public TempomatDecorator(Car car) {
        this.car = car;
    }

    public void configure() {
        car.configure();
        System.out.println("Adding tempomat ...");
    }
}
