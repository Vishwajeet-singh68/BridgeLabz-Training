package dsapractice.librarymanagementsystem;

public class Node {
    String bookTitle;
    String author;
    String genre;
    int bookId;
    boolean isAvailable;
    Node next;
    Node prev;

    Node(String bookTitle, String author, String genre, int bookId, boolean isAvailable) {
        this.bookTitle = bookTitle;
        this.author = author;
        this.genre = genre;
        this.bookId = bookId;
        this.isAvailable = isAvailable;
        this.next = null;
        this.prev = null;
    }
}
