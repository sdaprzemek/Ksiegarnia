package com.programowanie2.ksiegarnia.author;

import com.programowanie2.ksiegarnia.book.Book;
import com.programowanie2.ksiegarnia.book.BooksData;

import java.util.List;
import java.util.Scanner;

public class AuthorsFunctions {

    public List<Author> changeAuthorAge() {
        List<Author> authors = AuthorsData.getInstance().getAllAuthors();

        System.out.println("Wprowadź id autora, któremu chcesz zmienić wiek: ");
        Scanner in = new Scanner(System.in);
        int id = in.nextInt();
        Author author = authors.stream().filter(a -> a.getId() == id).findFirst().get();
        int oldAge = author.getAge();

        System.out.println("Wprowadź wiek dla autora: " + author.getName() + "\n");
        int age = in.nextInt();
        author.setAge(age);

        System.out.println("Zmieniono wiek dla: " + author + " z wartości: " + oldAge + ", na wartość: " + author.getAge());

        return authors;
    }

    public static Author addNewAuthor(int id) {
        Author newAuthor = new Author();
        Scanner in = new Scanner(System.in);

        System.out.println("Wprowadź Imię i nazwisko nowego autora: \n");
        String name = in.nextLine();
        newAuthor.setName(name);

        System.out.println("Wprowadź wiek nowego autora: \n");
        int age = in.nextInt();
        newAuthor.setAge(age);

        newAuthor.setId(++id);

        return newAuthor;
    }

    public static void printBooksForGivenAuthor() {
        List<Book> books = BooksData.getInstance().getAllBooks();
        List<Author> authors = AuthorsData.getInstance().getAllAuthors();
        Author author;
        int id;

        System.out.println("Podaj id autora, dla którego chcesz wyświetlić wszystkie książki: ");
        Scanner in = new Scanner(System.in);
        id = in.nextInt();

        author = authors.stream().filter(a -> a.getId() == id).findFirst().get();

        System.out.println("Autor: " + authors.get(id).getName());
        System.out.println("Lista książek: ");
        for (Book book : books) {
            if (book.getAuthors().contains(author)) {
                System.out.println(book.getTitle());
            }
        }
    }
}
