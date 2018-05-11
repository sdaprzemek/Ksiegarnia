package com.programowanie2.ksiegarnia.book;

import java.util.List;

public class TitleFirstBooksPrintStrategy implements BooksPrintStrategy {
    @Override
    public void print(List<Book> allBooks) {
        allBooks.forEach(book -> System.out.println("Tytuł: " + book.getTitle() + ", Rok: " + book.getYear() + ", Isbn: " + book.getIsbn() + ", Autorzy: " + book.getAuthors() + ", Oprawa: " + book.getCover() + ", Kategoria: " + book.getCategory()));
    }
}
