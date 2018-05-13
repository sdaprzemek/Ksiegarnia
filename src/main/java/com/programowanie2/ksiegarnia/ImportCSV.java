package com.programowanie2.ksiegarnia;

import com.programowanie2.ksiegarnia.author.Author;
import com.programowanie2.ksiegarnia.author.AuthorsData;
import com.programowanie2.ksiegarnia.book.Book;
import com.programowanie2.ksiegarnia.book.BooksData;
import com.programowanie2.ksiegarnia.category.CategoriesData;
import com.programowanie2.ksiegarnia.category.Category;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

class ImportCSV {

    void readBooksCSV() {

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
        String[] authorsId = infoBook[4].split(",");
        List<Author> authorsList = new ArrayList <>();

        for (String authorId : authorsId) {
            int id = Integer.parseInt(authorId) - 1;
            authorsList.add(AuthorsData.getInstance().getAllAuthors().get(id));
        }

        int catId = Integer.parseInt(infoBook[5]) - 1;
        Category category = CategoriesData.getInstance().getAllCategories().get(catId);

        return new Book(infoBook[0], infoBook[1], Integer.parseInt(infoBook[2]), infoBook[3], authorsList, category);
    }

    void readAuthorsCSV() {
        List <Author> authors = new ArrayList <>();
        BufferedReader aReader;

        try {
            aReader = new BufferedReader(new InputStreamReader(ClassLoader.getSystemResourceAsStream("authors.csv")));
            String line = aReader.readLine();

            while (line != null) {
                String[] infoAuthor = line.split(";");

                Author author = createAuthor(infoAuthor);
                authors.add(author);

                line = aReader.readLine();
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


    void readCategoriesCSV() {
        List<Category> categories = new ArrayList <>();
        BufferedReader cReader;

        try {
            cReader = new BufferedReader(new InputStreamReader(ClassLoader.getSystemResourceAsStream("categories.csv")));
            String line = cReader.readLine();

            while (line != null) {
                String[] infoCategory = line.split(";");

                Category category = createCategory(infoCategory);
                categories.add(category);

                line = cReader.readLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        CategoriesData categoriesData = CategoriesData.getInstance();
        categoriesData.setCategories(categories);

    }

    private static Category createCategory(String[] infoCategory) {
        return new Category(Integer.parseInt(infoCategory[0]), infoCategory[1], Integer.parseInt(infoCategory[2]));
    }

}
