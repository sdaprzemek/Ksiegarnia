package com.designpatterns.template;

import java.util.Scanner;

class EmailApp {

    public static void main(String[] args) {

        printMainMenu();

        Scanner in = new Scanner(System.in);
        int emailType = in.nextInt();
        EmailGenerator generator = null;

        switch (emailType) {
            case 1:
                generator = new ForMenagersEmailGenerator();
                break;
            case 2:
                generator = new ForHREmailGenerator();
                break;
            case 3:
                generator = new ForEmployeeEmailGenerator();
                break;
        }

        generator.sendEmail();
    }

    private static void printMainMenu() {
        System.out.println("Select mail type : ");
        System.out.println("1. Maganeger");
        System.out.println("2. HR");
        System.out.println("3. Employee");
    }
}
