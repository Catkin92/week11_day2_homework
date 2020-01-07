import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

public class LibraryTest {

    private Library library;
    private Book book1;
    private Book book2;
    private Book book3;

    @Before
    public void before() {
        library = new Library(2);
        book1 = new Book("Pride and Prejudice", "Jane Austen", "Romance");
        book2 = new Book("It", "Steven King", "Horror");
        book3 = new Book("The Hobbit", "J.R.R.Tolkien", "Fantasy");
    }

    @Test
    public void libraryStockStartsEmpty() {
        assertEquals(0, library.countStock());
    }

    @Test
    public void canAddBookToLibraryStock() {
        library.addBook(book1);
        library.addBook(book2);
        assertEquals(2, library.countStock());
    }

    @Test
    public void libraryAtMaxCapacity() {
        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);
        assertFalse(library.getBooks().contains(book3));
        assertEquals(2, library.countStock());
    }

    @Test
    public void libraryCanRemoveBook() {
        library.addBook(book1);
        library.addBook(book2);
        library.removeBook(book1);
        assertFalse(library.getBooks().contains(book1));
        assertEquals(1, library.countStock());
    }
}
