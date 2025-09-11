package library;

public class Book {
    private String title;
    private String author;
    private String code;
    private boolean borrowed;

    public Book(String title, String author, String code) {
        this.title = title;
        this.author = author;
        this.code = code;
        this.borrowed = false;
    }

    public String getTitle() { return title; }
    public String getAuthor() { return author; }
    public String getCode() { return code; }
    public boolean isBorrowed() { return borrowed; }
    public void borrow() { this.borrowed = true; }
    public void returned() { this.borrowed = false; }
    @Override
    public String toString() {
        String status = borrowed ? "Borrowed" : "Available";
        return "\"" + title + "\" by " + author + " [" + code + "] - " + status;
    }
}