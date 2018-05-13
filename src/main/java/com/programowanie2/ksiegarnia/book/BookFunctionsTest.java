package com.programowanie2.ksiegarnia.book;

import org.junit.*;

import java.util.ArrayList;
import java.util.List;
import static org.junit.Assert.*;


public class BookFunctionsTest {

    private BooksFunctions booksFunctions = new BooksFunctions();

    private List <Book> books = new ArrayList <>();

    @Before
    public void init() {
        books.add(new Book("Clean Code", "0132350882", 2008));
        books.add(new Book("Effective Java", "0134685997", 2018));
        books.add(new Book("Test Driven Development", "0321146530", 2003));
        books.add(new Book("Patterns of Enterprise Application Architecture", "0321127420", 2002));
        books.add(new Book("Head First Design Patterns", "0596007124", 2004));

    }

    @Test
    public void getIsbnTest() {
        Book book = booksFunctions.getIsbnNumber(books, "0132350882");
        assertEquals("0132350882", book.getIsbn());
    }

    @Test
    public void sortBooksAfterYearOfPublishingFromOldestTest() {
        List <Book> booksOldest = booksFunctions.sortBooksAfterYearOfPublishingFromOldest(books);
        assertEquals("0321127420", booksOldest.get(0).getIsbn());
        assertEquals("0134685997", booksOldest.get(4).getIsbn());
    }

    @Test
    public void getLastTwoBooksFromListTest() {
        List <Book> lastTwoBooks = booksFunctions.getLastTwoBooksFromList(books);
        assertEquals("0321127420", lastTwoBooks.get(0).getIsbn());
        assertEquals("0596007124", lastTwoBooks.get(1).getIsbn());
    }

    @Test
    public void sortBooksAfterYearOfPublishingFromYoungestTest() {
        List <Book> booksYoungest = booksFunctions.sortBooksAfterYearOfPublishingFromYoungest(books);
        assertEquals("0134685997", booksYoungest.get(0).getIsbn());
        assertEquals("0321127420", booksYoungest.get(4).getIsbn());
    }

    @Test
    public void getTheOldestBookTest() {
        Book oldestBook = booksFunctions.getTheOldestBook(books);
        assertEquals("0321127420", oldestBook.getIsbn());
    }

    @Test
    public void getTheYoungestBookTest() {
        Book youngestBook = booksFunctions.getTheYoungestBook(books);
        assertEquals("0134685997", youngestBook.getIsbn());
    }

    @Test
    public void getSumOfYearsTest() {
        Integer sumForCheck = 0;
        for (Book book : books) {
            sumForCheck = sumForCheck + book.getYear();
        }
        Integer sumOfYears = booksFunctions.getSumOfYears(books);
        assertEquals(sumForCheck, sumOfYears);
    }

    @Test
    public void getBooksAfter2007Test() {
        List <Book> booksAfter2007 = booksFunctions.getBooksAfter2007(books);
        assertEquals("0132350882", booksAfter2007.get(0).getIsbn());
        assertEquals("0134685997", booksAfter2007.get(1).getIsbn());
    }

    @Test
    public void areThereBooksOlderThan2000() {
        boolean areThereBooksOlderThan2000 = booksFunctions.areThereBooksOlderThan2000(books);
        assertFalse(areThereBooksOlderThan2000);
    }

    @Test
    public void averageAgeOfBookPublicationInTheCatalogTest() {
        Double averageFromMethod = booksFunctions.getAverageAgeOfBookPublicationInTheCatalog(books);
        Double averageToTest = 0D; // lub Double.valueOf(0)
        for (Book book : books) {
            averageToTest = averageToTest + book.getYear();
        }
        averageToTest = averageToTest / books.size();

        assertEquals(averageToTest, averageFromMethod);
    }

    @Test
    public void getBooksWithTitleOnTLetterAndPublishedAfter2009Test() {
        List <Book> booksWithTitleOnTLetterAndPublishedAfter2009 = booksFunctions.getBooksWithTitleOnTLetterAndPublishedAfter2009(books);
        int testSize = 0;
        assertEquals(testSize, booksWithTitleOnTLetterAndPublishedAfter2009.size());
        // nie ma zadnej pozycji w otrzymanej liscie dlatego sprawdzamy czy rozmiar otrzymanej listy wynosi 0
    }

    @Test
    public void getAllBooksExtra100Years() {
        List <Book> booksPlus100 = booksFunctions.getAllBooksExtra100Years(books);
        assertEquals(2108, booksPlus100.get(0).getYear());
        assertEquals(2104, booksPlus100.get(4).getYear());
    }

    @Test
    public void getBooksThatYearOfPublishingIsEven() {
        Integer listSizeReturned = booksFunctions.getBooksThatYearOfPublishingIsEven(books).size();
        Integer sizeExpected = 4;
        assertEquals(sizeExpected, listSizeReturned);
    }


}
