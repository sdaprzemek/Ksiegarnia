package com.designpatterns.builder.carBuilder;

import java.util.Arrays;

import static com.designpatterns.builder.carBuilder.EngineType.DIESEL;
import static com.designpatterns.builder.carBuilder.EngineType.GAS;
import static com.designpatterns.builder.carBuilder.EngineType.PETROL;

public class CarApp {

    public static void main(String[] args) {
        Car car1 = Car.CarBuilder.builder()
                .company("Volvo")
                .countryOfOrigin("Sweden").engineSize(1.6).millage(200000).engineType(PETROL).build();

        Car car2 = Car.CarBuilder.builder()
                .company("FSO").countryOfOrigin("Poland")
                .engineSize(1.6)
                .millage(100000)
                .engineType(PETROL)
                .model("CARO").build();

        Car car3 = Car.CarBuilder.builder()
                .company("RENAULT")
                .countryOfOrigin("France")
                .engineSize(2.1)
                .year(2008)
                .engineType(DIESEL).build();

        Car car4 = Car.CarBuilder.builder()
                .company("RENAULT")
                .countryOfOrigin("France")
                .engineSize(2.1)
                .year(2008)
                .engineType(GAS).additionalMaterials(Arrays.asList("Tempomat", "Glass Roof")).build();

        System.out.println(car1);
        System.out.println(car2);
        System.out.println(car3);
        System.out.println(car4);
    }
}
