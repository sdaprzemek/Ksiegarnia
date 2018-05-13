package com.programowanie2.ksiegarnia;

import com.programowanie2.ksiegarnia.author.*;
import com.programowanie2.ksiegarnia.book.Book;
import com.programowanie2.ksiegarnia.category.Category;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

class ExportCSV {

    private static final String CSV_SEPARATOR = ";";

    void writeBooksToCSV(List <Book> books) {

        try {
            try (BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("books.csv")))) {
                for (Book book : books) {
                    StringBuffer oneLine = new StringBuffer();
                    oneLine.append(book.getTitle().trim().length() == 0 ? "" : book.getTitle());
                    oneLine.append(CSV_SEPARATOR);
                    oneLine.append(book.getIsbn().trim().length() == 0 ? "" : book.getIsbn());
                    oneLine.append(CSV_SEPARATOR);
                    oneLine.append(book.getYear() < 0 ? "" : book.getYear());
                    oneLine.append(CSV_SEPARATOR);
                    oneLine.append(book.getCover());
                    oneLine.append(CSV_SEPARATOR);
                    oneLine.append(reprintAuthorsIdToTheStringForBook(book));
                    bw.write(oneLine.toString());
                    bw.newLine();
                }
                bw.flush();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private String reprintAuthorsIdToTheStringForBook(Book book) {
        List <Integer> authorsIdArray = new ArrayList <>();
        List <Author> authors = book.getAuthors();
        String authorsId;
        for (Author author : authors) {
            authorsIdArray.add(author.getId());
        }
        authorsId = authorsIdArray
                .toString()
                .replace("[", "")
                .replace("]", "");

        return authorsId;
    }

    void writeAuthorsToCSV(List<Author> authors) {
        PrintWriter pw = null;
        try {
            pw = new PrintWriter(new File("authors.csv"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        StringBuilder sb = new StringBuilder();
        for (Author author : authors) {
            sb.append(author.getId()).append(CSV_SEPARATOR);
            sb.append(author.getName()).append(CSV_SEPARATOR);
            sb.append(author.getAge()).append("\n");
        }
        pw.write(sb.toString());
        pw.close();
    }

    void writeCategoriesToCSV(List<Category> categories) {
        PrintWriter pw = null;
        try {
            pw = new PrintWriter(new File("categories.csv"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        StringBuilder sb = new StringBuilder();
        for (Category category : categories) {
            sb.append(category.getCategoryID()).append(CSV_SEPARATOR);
            sb.append(category.getCategoryName()).append(CSV_SEPARATOR);
            sb.append(category.getPriority()).append(CSV_SEPARATOR);
        }
        pw.write(sb.toString());
        pw.close();
    }

}


