package library;

import java.util.ArrayList;
import java.util.List;

public class Library implements Issueable {
    private List<Book> bookCollection = new ArrayList<>();
    public void addBook(Book book) {
        bookCollection.add(book);
    }
    @Override
    public boolean borrowBook(String bookCode) {
        for (Book book : bookCollection) {
            if (book.getCode().equals(bookCode) && !book.isBorrowed()) {
                book.borrow();
                return true;
            }
        }
        return false;
    }
    @Override
    public boolean returnBook(String bookCode) {
        for (Book book : bookCollection) {
            if (book.getCode().equals(bookCode) && book.isBorrowed()) {
                book.returned();
                return true;
            }
        }
        return false;
    }
    @Override
    public boolean isBookAvailable(String bookCode) {
        for (Book book : bookCollection) {
            if (book.getCode().equals(bookCode)) {
                return !book.isBorrowed();
            }
        }
        return false;
    }
    public void showAllBooks() {
        for (Book book : bookCollection) {
            System.out.println(book);
        }
    }
}
