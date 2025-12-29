public class Book {
    private static String libraryName="GLA Library";
    private String title;
    private String author;
    final private int isbn;

    public Book(String title, String author, int isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }

    public void displayBookDetails() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("ISBN: " + isbn);
    }

    public static void displayLibraryName() {
        System.out.println("Library Name: " + libraryName);
    }
}