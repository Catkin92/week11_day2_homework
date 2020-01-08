import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class BorrowerTest {

    private Borrower borrower;
    private Library library;
    private Book book1;
    private Book book2;
    private Book book3;

    @Before
    public void before() {
        borrower = new Borrower("Eugene");
        library = new Library(3);
        book1 = new Book("Pride and Prejudice", "Jane Austen", "Romance");
        book2 = new Book("It", "Steven King", "Horror");
        book3 = new Book("The Hobbit", "J.R.R.Tolkien", "Fantasy");
        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);
    }

    @Test
    public void borrowerShouldStartWithNoBooks() {
        assertEquals(0, borrower.booksCount());
    }

    @Test
    public void borrowerShouldBeAbleToBorrowBooks() {
        borrower.addBook(library, book2);
        assertFalse(library.getBooks().contains(book2));
        assertEquals(2, library.countStock());
        assertTrue(borrower.getBooks().contains(book2));
        assertEquals(1, borrower.booksCount());
    }
}
