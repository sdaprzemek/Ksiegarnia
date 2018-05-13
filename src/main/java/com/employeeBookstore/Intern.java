package com.employeeBookstore;

class Intern extends Employee {
    int hours;
    long stake;

    public Intern(String name, String surname, int age, String email, int hours, long stake) {
        super(name, surname, age, email);
        this.hours = hours;
        this.stake = stake;
    }

    public long calculateSalary() {
        return (hours * stake);
    }

    @Override
    public String toString() {
        return "Intern" +
                " name: " + name + '\'' +
                " surname: " + surname + '\'' +
                " age: " + age;
    }
}
