import java.nio.charset.Charset;
import java.util.ArrayList;

public class Borrower {

    private String name;
    private ArrayList<Book> books;

    public Borrower(String name) {
        this.name = name;
        this.books = new ArrayList<Book>();
    }

    public int booksCount() {
        return this.books.size();
    }

    public ArrayList<Book> getBooks() {
        return this.books;
    }

    public void addBook(Library library, Book book) {
        if (library.getBooks().contains(book)) {
            library.removeBook(book);
            this.books.add(book);
        }
    }
}
