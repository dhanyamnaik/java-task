
package library;

public interface Issueable {
    boolean borrowBook(String bookCode);
    boolean returnBook(String bookCode);
    boolean isBookAvailable(String bookCode);
}