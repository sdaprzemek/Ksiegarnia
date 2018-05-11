package com.programowanie2.ksiegarnia.book;

import com.programowanie2.ksiegarnia.book.Book;
import com.programowanie2.ksiegarnia.book.BooksPrintStrategy;

import java.util.List;

public class YearFirstBooksPrintStrategy implements BooksPrintStrategy {
    @Override
    public void print(List<Book> allBooks) {
        allBooks.forEach(book -> System.out.println("Rok: " + book.getYear() + ", Tytuł: " + book.getTitle() + ", Isbn: " + book.getIsbn()));

    }
}
