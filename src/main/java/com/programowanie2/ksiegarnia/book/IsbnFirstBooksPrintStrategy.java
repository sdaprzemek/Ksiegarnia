package com.programowanie2.ksiegarnia.book;

import com.programowanie2.ksiegarnia.book.Book;
import com.programowanie2.ksiegarnia.book.BooksPrintStrategy;

import java.util.List;

public class IsbnFirstBooksPrintStrategy implements BooksPrintStrategy {
    @Override
    public void print(List<Book> allBooks) {
        allBooks.forEach(book -> System.out.println("Isbn: " + book.getIsbn() + ", Tytuł: " + book.getTitle() + ", Rok: " + book.getYear()));
    }
}
