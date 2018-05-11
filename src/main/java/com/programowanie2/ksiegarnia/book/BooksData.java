package com.programowanie2.ksiegarnia.book;
//singleton

import java.util.List;

public class BooksData {

    private static BooksData instance = new BooksData();

    private BooksData() {
    }

    private List <Book> books;

    public static BooksData getInstance() {
        return instance;
    }

    public List <Book> getAllBooks() {
        return books;
    }

    public void setBooks(List <Book> books) {
        this.books = books;
    }
}

