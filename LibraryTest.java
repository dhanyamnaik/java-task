package library;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class LibraryTest {
    private Library library;
    private Book book;

    @BeforeEach
    void setup() {
        library = new Library();
        book = new Book("Test Book", "Author", "TEST001");
        library.addBook(book);
    }

    @Test
    void testBorrowBook() {
        assertTrue(library.borrowBook("TEST001"), "Should be able to borrow the book");
        assertFalse(library.isBookAvailable("TEST001"), "Book should not be available after borrowing");
    }

    @Test
    void testReturnBook() {
        library.borrowBook("TEST001");
        assertTrue(library.returnBook("TEST001"), "Should be able to return the book");
        assertTrue(library.isBookAvailable("TEST001"), "Book should be available after returning");
    }

    @Test
    void testIsBookAvailable() {
        assertTrue(library.isBookAvailable("TEST001"), "Book should be available initially");
        library.borrowBook("TEST001");
        assertFalse(library.isBookAvailable("TEST001"), "Book should not be available after borrowing");
    }
}