public class Main {
    public static void main(String[] args) {
        Book book = new Book("Advanced Java", "Jane Smith",2354);

        if(book instanceof Book) {
            book.displayBookDetails();
        } else {
            System.out.println("The object is not an instance of Book class."); 
        }
    }
}
