public class Book {
    String title;
    String author;
    double price;

    Book() {
        this.title = "Unknown";
        this.author = "Unknown";
        this.price = 0.0;
    }

    Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public void displayBookDetails() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: " + price);
        System.out.println("-----------------------------");
    }
    public static void main(String[] args) {
        Book defaultBook = new Book();
        defaultBook.displayBookDetails();

        Book parameterizedBook = new Book("1984", "George Orwell", 15.99);
        parameterizedBook.displayBookDetails();
    }
}