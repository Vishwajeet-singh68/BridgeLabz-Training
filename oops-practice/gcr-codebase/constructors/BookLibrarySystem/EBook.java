public class EBook extends Book {
    public EBook(String ISBN, String title, String author) {
        super(ISBN, title, author);
    }

    public void displayDetails() {
        System.out.println("E-Book Details:");
        System.out.println("ISBN: " + ISBN);//public variable has global access
        System.out.println("Title: " + title);//protected variable has subclass access and within package
        System.out.println("Author: " + getAuthor());//private variable can be accessed via public getter method
    }
}
