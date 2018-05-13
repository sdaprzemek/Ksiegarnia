package com.programowanie2.ksiegarnia.book;

import com.programowanie2.ksiegarnia.author.Author;
import com.programowanie2.ksiegarnia.category.Category;

import java.util.List;

public class Book {

    private String title;
    private List<Author> authors;
    private String isbn;
    private int year;
    private String cover;
    private Category category;


    public String getTitle() {
        return title;
    }

    void setTitle(String title) {
        this.title = title;
    }

    public List <Author> getAuthors() {
        return authors;
    }

    public void setAuthors(List <Author> authors) {
        this.authors = authors;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public int getYear() {
        return year;
    }

    void setYear(int year) {
        this.year = year;
    }

    public String getCover() {
        return cover;
    }

    public void setCover(String cover) {
        this.cover = cover;
    }

    Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public Book(String title, String isbn, int year, String cover, List <Author> authors, Category category) {
        this.title = title;
        this.isbn = isbn;
        this.year = year;
        this.cover = cover;
        this.authors = authors;
        this.category = category;

    }

    public Book(String title, String isbn, int year) {
        this.title = title;
        this.isbn = isbn;
        this.year = year;
    }
}
