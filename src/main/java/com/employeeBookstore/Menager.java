package com.employeeBookstore;

class Menager extends Employee {
    private String phoneNumber;
    private long b2bSalary;


    public long calculateSalary() {
        int hours = 160;
        return (hours * b2bSalary);
    }


    public Menager(String name, String surname, int age, String email, String phoneNumber, long b2bSalary) {
        super(name, surname, age, email);
        this.phoneNumber = phoneNumber;
        this.b2bSalary = b2bSalary;
    }

    @Override
    public String toString() {
        return "Menager: " +
                "name: " + name + '\'' +
                ", surname: " + surname + '\'' +
                ", age: " + age;
    }
}
