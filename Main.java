package library;

public class Main {
    public static void main(String[] args) {
        Library cityLibrary = new Library();
        Book firstBook = new Book("Harry Potter", "J.K. Rowling", "BOOK001");
        Book secondBook = new Book("Introduction to Algorithms", "Thomas H. Cormen", "BOOK002");
        cityLibrary.addBook(firstBook);
        cityLibrary.addBook(secondBook);
        System.out.println("Books in the library:");
        cityLibrary.showAllBooks();
        System.out.println("\nBorrowing BOOK001: " + cityLibrary.borrowBook("BOOK001"));
        System.out.println("Is BOOK001 available? " + cityLibrary.isBookAvailable("BOOK001"));
        System.out.println("\nLibrary after borrowing BOOK001:");
        cityLibrary.showAllBooks();
        System.out.println("\nReturning BOOK001: " + cityLibrary.returnBook("BOOK001"));
        System.out.println("Is BOOK001 available now? " + cityLibrary.isBookAvailable("BOOK001"));
        System.out.println("\nFinal state of the library:");
        cityLibrary.showAllBooks();
    }
}