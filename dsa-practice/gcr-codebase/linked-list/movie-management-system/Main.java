package LinkedList.MovieManagementSystem;

public class Main {
    public static void main(String[] args) {
        MovieDoublyLinkedList movies=new MovieDoublyLinkedList();
        movies.add("dhurandhar", "aditya dhar", 2025, 8.5f);
        movies.addFirst("KGF 2", "prashant neel", 2023, 9.1f);
        movies.addAt(2, "bahubali", "SS rajamouli", 2014, 9.2f);

        movies.display();

        movies.updateRatingByTitle("dhurandhar",9.0f);

        System.out.println("\nAfter Update:");
        movies.display();

        System.out.println("in reverse order");
        movies.displayInReverseOrder();

        movies.removeMovieByTitle("bahubali");

        System.out.println("After Deletion");
        movies.display();
    }
}
