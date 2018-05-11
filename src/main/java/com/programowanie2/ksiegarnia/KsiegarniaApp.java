package com.programowanie2.ksiegarnia;

import com.programowanie2.ksiegarnia.author.Author;
import com.programowanie2.ksiegarnia.author.AuthorsFunctions;
import com.programowanie2.ksiegarnia.author.AuthorsData;
import com.programowanie2.ksiegarnia.book.*;
import com.programowanie2.ksiegarnia.category.CategoriesData;
import com.programowanie2.ksiegarnia.category.Category;
import com.programowanie2.ksiegarnia.book.BooksFunctions;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;


public class KsiegarniaApp {

    public static void main(String[] args) throws IOException {

        BooksPrintStrategy booksPrintStrategy = new TitleFirstBooksPrintStrategy();

        int menuNumber = 0;
        boolean stopPrintingMenu = false;
        String kontakt;
        BooksFunctions booksFunctions = new BooksFunctions();
        AuthorsFunctions authorsFunctions = new AuthorsFunctions();

        ImportCSV importCSVAuthors = new ImportCSV();
        importCSVAuthors.readAuthorsCSV();
        List<Author> authors = AuthorsData.getInstance().getAllAuthors();

        ImportCSV importCSVCategories = new ImportCSV();
        importCSVCategories.readCategoriesCSV();
        List<Category> categories = CategoriesData.getInstance().getAllCategories();

        ImportCSV importCSVBooks = new ImportCSV();
        importCSVBooks.readBooksCSV();
        List <Book> books = BooksData.getInstance().getAllBooks();


        while (!stopPrintingMenu) {

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
                    booksPrintStrategy.print(books);
                    break;
                }
                case 3: {
                    printAllAuthors();
                    break;
                }
                case 4: {
                    printAllCategories();
                    break;
                }
                case 5: {
                    booksPrintStrategy.print(booksFunctions.getBooksAfter2007(books));
                    break;
                }
                case 6: {
                    booksPrintStrategy.print(booksFunctions.sortBooksAfterYearOfPublishingFromOldest(books));
                    break;
                }
                case 7: {
                    booksPrintStrategy.print(booksFunctions.sortBooksAfterYearOfPublishingFromYoungest(books));
                    break;
                }
                case 8: {
                    booksPrintStrategy.print(booksFunctions.getAllBooksFromCategoryDesignPatterns(books));
                    break;
                }
                case 9: {
                    int lastId = getLastAuthorId(authors);
                    authors.add(authorsFunctions.addNewAuthor(lastId));
                    break;
                }
                case 10: {
                    booksFunctions.countEachAuthorBooks(authors, books);
                    break;
                }
                case 11: {
                    booksPrintStrategy = new IsbnFirstBooksPrintStrategy();
                    booksPrintStrategy.print(books);
                    booksFunctions.editTitleOfTheBook(books);
                    booksPrintStrategy = new TitleFirstBooksPrintStrategy();
                    break;
                }
                case 12: {
                    ExportCSV exportBooks = new ExportCSV();
                    exportBooks.writeBooksToCSV(books);
                    break;
                }
                case 13: {
                    printAllAuthors();
                    authorsFunctions.changeAuthorAge(authors);
                    break;
                }
                case 20: {
                    booksPrintStrategy = new YearFirstBooksPrintStrategy();
                    break;
                }
                case 21: {
                    booksPrintStrategy = new TitleFirstBooksPrintStrategy();
                    break;
                }
                case 22: {
                    booksPrintStrategy = new IsbnFirstBooksPrintStrategy();
                    break;
                }
                case 99: {
                    System.out.println("Do zobaczenia");
                    stopPrintingMenu = true;
                    break;
                }
                default: {
                    System.out.println("Wybrana wartość nie występuje w menu\n");
                }
            }
        }
    }

    private static int getLastAuthorId(List <Author> authors) {
        return authors.get(authors.size()).getId();
    }

    private static void printAllCategories() {
        System.out.println(CategoriesData.getInstance().getAllCategories() + "\n");
    }

    private static void printAllAuthors() {
        System.out.println(AuthorsData.getInstance().getAllAuthors() + "\n");
    }


    private static void printMainMenu() {
        System.out.println("--------------------------------------------------------------------------");
        System.out.println("Witaj w aplikacji Księgarnia 1.0");
        System.out.println("Wybierz jedną z poniższych opcji:");
        System.out.println("1. Kontakt");
        System.out.println("2. Wydrukuj listę książek");
        System.out.println("3. Wydrukuj listę autorów");
        System.out.println("4. Wydrukuj listę kategori");
        System.out.println("5. Wydrukuj listę książek wydanych po 2007 r.");
        System.out.println("6. Posortuj listę książek od najwcześniej wydanej");
        System.out.println("7. Posortuj listę książek od najpóźniej wydanej");
        System.out.println("8. Wyświetl wszystkie książki z kategorii wzorce projektowe");
        System.out.println("9. Dodaj nowego autora");
        System.out.println("10. Wyświetl listę autorów i liczbę książek jaką wydali");
        System.out.println("11. Edytuj nazwę książki");
        System.out.println("12. Zapisz książki do pliku na dysku");
        System.out.println("13. Edytuj wiek autora");
        System.out.println("20. Zmień sposób wyświetlania książek na: rok, tytuł, isbn");
        System.out.println("21. Zmień sposób wyświetlania książek na: tytuł, rok, isbn");
        System.out.println("22. Zmień sposób wyświetlania książek na: isbn, tytuł, rok");
        System.out.println("99. Wyjdź z programu");
    }

}
