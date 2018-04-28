package com.programowanie2.ksiegarnia;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class ImportCSV {

    public void readBooksCSV() {

        List <Book> books = new ArrayList <>();
        BufferedReader bReader;

        try {
            bReader = new BufferedReader(new InputStreamReader(ClassLoader.getSystemResourceAsStream("books.csv")));
            String line = bReader.readLine();

            while (line != null) {
                String[] infoBook = line.split(";");

                Book book = createBook(infoBook);
                books.add(book);

                line = bReader.readLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        BooksData booksData = BooksData.getInstance();
        booksData.setBooks(books);
    }

    private static Book createBook(String[] infoBook) {
        return new Book(infoBook[0], Integer.parseInt(infoBook[1]), Integer.parseInt(infoBook[2]));
    }

    public void readAuthorsCSV() {
        List <Author> authors = new ArrayList <>();
        BufferedReader bReader;

        try {
            bReader = new BufferedReader(new InputStreamReader(ClassLoader.getSystemResourceAsStream("authors.csv")));
            String line = bReader.readLine();

            while (line != null) {
                String[] infoAuthor = line.split(";");

                Author author = createAuthor(infoAuthor);
                authors.add(author);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        AuthorsData authorsData = AuthorsData.getInstance();
        authorsData.setAuthors(authors);
    }

    private static Author createAuthor(String[] infoAuthor) {
        return new Author(Integer.parseInt(infoAuthor[0]), infoAuthor[1], Integer.parseInt(infoAuthor[2]));
    }

}
