package com.programowanie2.ksiegarnia;

import com.programowanie2.ksiegarnia.book.Book;

import java.io.*;
import java.util.List;

class ExportCSV {

    //https://stackoverflow.com/questions/3666007/how-to-serialize-object-to-csv-file

    private static final String CSV_SEPARATOR = ";";

    void writeBooksToCSV(List <Book> books) throws IOException {
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
                    oneLine.append(book.getAuthors());// napisac metode ktora bedzie wpiywała do pliku id autora a nie imie
                    bw.write(oneLine.toString());
                    bw.newLine();
                }
                bw.flush();
            }
        } catch (IOException e) {
        }
    }
}

