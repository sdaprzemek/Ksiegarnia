package com.programowanie2.ksiegarnia;

import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;


public class KsiegarniaApp {


    public static final int YEAR_OF_PUBLISHING = 2000;

    public static void main(String[] args) {

        int menuNumber = 0;
        boolean stopPrintingMenu = false;
        String kontakt;

        ImportCSV importCSVBooks = new ImportCSV();
        importCSVBooks.readBooksCSV();

        //ImportCSV importCSVAuthors = new ImportCSV();
        //importCSVAuthors.readAuthorsCSV();

        while (stopPrintingMenu == false) {

            printMainMenu();

            try {
                Scanner in = new Scanner(System.in);
                menuNumber = in.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Podana wartość nie jest liczbą");
            }

            switch (menuNumber) {
                case 1: {
                    kontakt = new Kontakt().printEmail();
                    System.out.println(kontakt + "\n");
                    break;
                }
                case 2: {
                    printAllBooks();
                    break;
                }
                //case 3: {
                //    System.out.println(AuthorsData.getInstance().getAllAuthors() + "\n");
                //    break;
                //}
                case 4: {
                    List <Book> bookList = BooksData.getInstance().getAllBooks();
                    int counter = 0;
                    System.out.println("--------------------------------------------------------------------------");
                    System.out.println("Lista książek wydanych po 2004 r.:");
                    System.out.println("");

                    bookList
                            .stream()
                            .filter(s -> (s.getYear() > 2004))
                            .forEach(System.out::println);

                    /*for (Book x : bookList) {
                        if (x.getYear() > YEAR_OF_PUBLISHING) {
                            System.out.println(x);
                            counter++;
                        }
                    }

                    System.out.println("Liczba książek znalezionych: " + counter + "\n");
                    */
                    break;
                }
                case 5: {
                    System.out.println("Do zobaczenia");
                    break;
                }
                default: {
                    System.out.println("Wybrana wartość nie występuje w menu\n");
                }
            }
        }

    }

    private static void printAllBooks() {
        System.out.println(BooksData.getInstance().getAllBooks() + "\n");
    }


    public static void printMainMenu() {
        System.out.println("--------------------------------------------------------------------------");
        System.out.println("Witaj w aplikacji Księgarnia 1.0");
        System.out.println("Wybierz jedną z poniższych opcji:");
        System.out.println("1. Kontakt");
        System.out.println("2. Wydrukuj listę książek");
        //System.out.println("3. Wydrukuj listę autorów");
        System.out.println("4. Wydrukuj listę książek wydanych przed 2004 r.");
        System.out.println("5. Wyjdź z programu");
    }

}
