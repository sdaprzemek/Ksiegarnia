package com.programowanie2.ksiegarnia.author;

import java.util.List;

public class AuthorsData {

    private static AuthorsData instance = new AuthorsData();

    private AuthorsData() {
    }

    private List <Author> authors;

    public static AuthorsData getInstance() {
        return instance;
    }

    public List <Author> getAllAuthors() {
        return authors;
    }

    public void setAuthors(List <Author> authors) {
        this.authors = authors;
    }


}
