package com.employeeBookstore;

import java.util.ArrayList;
import java.util.List;

public class MainApp {

    public static void main(String[] args) {
        List <Employee> list = new ArrayList <>();

        Menager menager1 = new Menager("Anna", "Wanko", 31, "anna.wanko@gmail.com", "600 700 800", 600);
        Seller seller1 = new Seller("John", "Wick", 34, "j.wick@gmail.com", 5000);
        Intern intern1 = new Intern("Adam", "Bloch", 23, "adam.jas.fasola@gmail.com", 20, 23);

        list.add(menager1);
        list.add(seller1);
        list.add(intern1);

        for (Employee employee : list) {
            System.out.println(employee + " , " + "Salary: " + employee.calculateSalary());
        }
    }
}
