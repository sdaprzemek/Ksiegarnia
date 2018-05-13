package com.employeeBookstore;

class Seller extends Employee {
    long salaryUOP;

    public Seller(String name, String surname, int age, String email, long salaryUOP) {
        super(name, surname, age, email);
        this.salaryUOP = salaryUOP;
    }

    public long calculateSalary() {
        return salaryUOP;
    }

    @Override
    public String toString() {
        return "Seller" +
                " name: " + name + '\'' +
                " surname: " + surname + '\'' +
                " age: " + age;
    }
}
