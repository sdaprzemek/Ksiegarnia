package com.programowanie2.ksiegarnia;

public class Book {

    private String title;
    private int ISBN;
    private int year;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getISBN() {
        return ISBN;
    }

    public void setISBN(int ISBN) {
        this.ISBN = ISBN;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public Book(String title, int isbn, int year) {
        this.title = title;
        ISBN = isbn;
        this.year = year;
    }

    @Override
    public String toString() {
        return "Tytuł: " + title + '\'' +
                ", ISBN: " + ISBN +
                ", Rok: " + year +
                '}' + "\n";
    }
}
