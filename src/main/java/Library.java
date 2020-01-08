import java.nio.charset.Charset;
import java.util.ArrayList;

public class Library {

    private int capacity;
    private ArrayList<Book> books;

    public Library(int capacity) {
        this.capacity = capacity;
        this.books = new ArrayList<Book>();
    }

    public int countStock() {
        return this.books.size();
    }

    public void addBook(Book book) {
        if (this.capacity > this.countStock())
        this.books.add(book);
    }

    public void removeBook(Book book) {
        int removedBook = this.books.indexOf(book);
        this.books.remove(removedBook);
    }

    public ArrayList<Book> getBooks() {
        return new ArrayList<Book>(this.books);
    }
}
