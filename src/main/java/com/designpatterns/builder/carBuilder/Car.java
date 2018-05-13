package com.designpatterns.builder.carBuilder;

import java.util.List;

public class Car {

    private String company;

    private String model;

    private Double engineSize;

    private int year;

    private long millage;

    private String countryOfOrigin;

    private List<String> additionalMaterials;

    private Enum engineType;

    private Car(String company, String model, Double engineSize, int year, long millage, String countryOfOrigin, List <String> additionalMaterials, Enum engineType) {
        this.company = company;
        this.model = model;
        this.engineSize = engineSize;
        this.year = year;
        this.millage = millage;
        this.countryOfOrigin = countryOfOrigin;
        this.additionalMaterials = additionalMaterials;
        this.engineType = engineType;
    }

    public static class CarBuilder {

        String company;

        String model;

        double engineSize;

        int year;

        long millage;

        String countryOfOrigin;

        List<String> additionalMaterials;

        Enum engineType;

        public static CarBuilder builder() {
            return new CarBuilder();
        }

        public CarBuilder company(String company) {
            this.company = company;
            return this;
        }

        public CarBuilder model(String model) {
            this.model = model;
            return this;
        }

        public CarBuilder engineSize(double engineSize) {
            this.engineSize = engineSize;
            return this;
        }

        public CarBuilder year(int year) {
            this.year = year;
            return this;
        }

        public CarBuilder millage(long millage) {
            this.millage = millage;
            return this;
        }

        public CarBuilder countryOfOrigin(String countryOfOrigin) {
            this.countryOfOrigin = countryOfOrigin;
            return this;
        }

        public CarBuilder additionalMaterials(List<String> additionalMaterials) {
            this.additionalMaterials = additionalMaterials;
            return this;
        }

        public CarBuilder engineType(Enum engineType) {
            this.engineType = engineType;
            return this;
        }

        public Car build() {
            return new Car(company, model, engineSize, year, millage, countryOfOrigin, additionalMaterials, engineType);
        }
    }

    @Override
    public String toString() {
        return "CarBuilder{" +
                "company='" + company + '\'' +
                ", model='" + model + '\'' +
                ", engineSize=" + engineSize +
                ", year=" + year +
                ", millage=" + millage +
                ", countryOfOrigin='" + countryOfOrigin + '\'' +
                ", additionalMaterials=" + additionalMaterials +
                ", engineType=" + engineType +
                '}';
    }
}
