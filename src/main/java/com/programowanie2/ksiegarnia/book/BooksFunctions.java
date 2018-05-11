package com.programowanie2.ksiegarnia.book;

import com.programowanie2.ksiegarnia.author.Author;
import com.programowanie2.ksiegarnia.book.Book;
import com.programowanie2.ksiegarnia.category.CategoriesData;

import java.util.*;
import java.util.stream.Collectors;

public class BooksFunctions {

    public List<Book> editTitleOfTheBook (List<Book> books) {
        System.out.println("Podaj numer isbn książki, której tytuł chcesz edytować: \n");
        Scanner in = new Scanner(System.in);
        String bookIsbn = in.nextLine();
        Book bookToChange = books.stream().filter(book -> book.getIsbn().equals(bookIsbn)).findFirst().get();
        String oldTitle = bookToChange.getTitle();

        System.out.println("Wprowadź nowy tytuł dla wskazanej pozycji:\n");
        String newTitle = in.nextLine();

        bookToChange.setTitle(newTitle);

       System.out.println("Zmianiłeś tytuł książki z : " + oldTitle + "\n" + "na nowy tytuł: " + newTitle);
        return books;
    }

    public void countEachAuthorBooks(List <Author> authors, List <Book> books) {
        int counter = 0;
        for (Author author : authors) {
            for (Book book : books) {
                if (book.getAuthors().contains(author)) {
                    counter++;
                }
            }
            System.out.println(author + " - liczba książek: " + counter);
            counter = 0;
        }
    }


    public List <Book> getAllBooksFromCategoryDesignPatterns(List <Book> books) {
        return books.stream().filter(book -> book.getCategory().equals(CategoriesData.getInstance().getAllCategories().get(1))).collect(Collectors.toList());
    }

    public Book getIsbnNumber(List <Book> books, String isbn) {
        return books.stream()
                .filter(book -> book.getIsbn()
                        .equals(isbn))
                .findFirst()
                .get();
    }

    public List <Book> sortBooksAfterYearOfPublishingFromOldest(List <Book> books) {
        return books.stream()
                .sorted(Comparator.comparing(Book::getYear))
                .collect(Collectors.toList());
    }

    public List <Book> getLastTwoBooksFromList(List <Book> books) {
        return books.stream()
                .skip(books.size() - 2)
                .collect(Collectors.toList());
    }

    public List <Book> sortBooksAfterYearOfPublishingFromYoungest(List <Book> books) {
        return books.stream()
                .sorted(Comparator.comparing(Book::getYear).reversed())
                .collect(Collectors.toList());
    }

    public Book getTheOldestBook(List <Book> books) {
        return books.stream()
                .sorted(Comparator.comparing(Book::getYear))
                .findFirst().get();
    }

    public Book getTheYoungestBook(List <Book> books) {
        return books.stream().max(Comparator.comparing(Book::getYear))
                .get();
    }

    public Integer getSumOfYears(List <Book> books) {
        return books.stream()
                .mapToInt(book -> book.getYear())
                .sum();
    }

    public List <Book> getBooksAfter2007(List <Book> books) {
        return books.stream()
                .filter(book -> book.getYear() > 2007)
                .collect(Collectors.toList());
    }

    public boolean areThereBooksOlderThan2000(List <Book> books) {
        return books.stream()
                .anyMatch(book -> book.getYear() < 2000);
    }

    public double getAverageAgeOfBookPublicationInTheCatalog(List <Book> books) {
        OptionalDouble averageAge = books.stream()
                .mapToDouble(book -> book.getYear())
                .average();

        return averageAge.getAsDouble();
    }

    public List <Book> getBooksWithTitleOnTLetterAndPublishedAfter2009(List <Book> books) {
        return books.stream().
                filter(book -> book.getYear() > 2009).
                filter(book -> book.getTitle()
                        .startsWith("T"))
                .collect(Collectors.toList());
    }

    public List <Book> getAllBooksExtra100Years(List <Book> books) {
        return books.stream()
                .peek(book -> book.setYear(book.getYear() + 100))
                .collect(Collectors.toList());
    }

    public List <Book> getBooksThatYearOfPublishingIsEven(List <Book> books) {
        return books.stream().filter(book -> book.getYear() % 2 == 0).collect(Collectors.toList());
    }


}
