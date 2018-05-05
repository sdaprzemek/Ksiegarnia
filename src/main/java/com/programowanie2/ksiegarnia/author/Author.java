package com.programowanie2.ksiegarnia.author;

import java.util.Scanner;

public class Author {

    private int id;
    private String name;
    private int age;

    public Author(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public Author() {}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "id: " + id +
                ", Imię i nazwisko: " + name + '\'' +
                ", wiek: " + age + "\n";
    }

    public static Author addNewAuthor(int id) {
        Author newAuthor = new Author();
        Scanner in = new Scanner(System.in);

        System.out.println("Wprowadź Imię i nazwisko nowego autora: \n");
        String name = in.nextLine();
        newAuthor.setName(name);

        System.out.println("Wprowadź wiek nowego autora: \n");
        int age = in.nextInt();
        newAuthor.setAge(age);

        newAuthor.setId(id++);

        return newAuthor;
    }
}
