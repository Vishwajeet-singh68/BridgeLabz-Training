package dsapractice.librarymanagementsystem;

public class Main {
	public static void main(String[] args) {
		LibraryManagementSystem library = new LibraryManagementSystem();
        library.addAtBeginning("1984", "Orwell", "Dystopian", 101, true);
        library.addAtEnd("Pride and Prejudice", "Austen", "Romance", 102, true);
        library.addAtPosition(2, "The Hobbit", "Tolkien", "Fantasy", 103, false);
        System.out.println("Forward display:");
        library.displayForward();
        System.out.println("Reverse display:");
        library.displayReverse();
        library.searchByAuthor("Orwell");
        library.updateAvailability(102, false);
        System.out.println("Total books: " + library.countBooks());
        library.removeByBookId(101);
        System.out.println("After deletion:");
        library.displayForward();
	}
}
