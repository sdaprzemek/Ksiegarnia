package com.programowanie2.ksiegarnia.book;

import com.programowanie2.ksiegarnia.book.Book;

import java.util.List;

public interface BooksPrintStrategy {
    void print(List <Book> allBooks);
}
