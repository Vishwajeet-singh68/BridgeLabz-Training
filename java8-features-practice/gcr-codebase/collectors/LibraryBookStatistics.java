package collectors;

import java.util.*;
import java.util.stream.Collectors;

class Book {
    String title;
    String genre;
    int pages;

    public Book(String title, String genre, int pages) {
        this.title = title;
        this.genre = genre;
        this.pages = pages;
    }
}

public class LibraryBookStatistics {

    public static void main(String[] args) {

        List<Book> books = Arrays.asList(
            new Book("The Hobbit", "Fantasy", 310),
            new Book("Harry Potter", "Fantasy", 450),
            new Book("Game of Thrones", "Fantasy", 835),

            new Book("Clean Code", "Programming", 464),
            new Book("Effective Java", "Programming", 412),
            new Book("Java Concurrency", "Programming", 385),

            new Book("The Alchemist", "Fiction", 197),
            new Book("The Kite Runner", "Fiction", 371),
            new Book("Life of Pi", "Fiction", 348)
        );

        Map<String, IntSummaryStatistics> stats = books.stream().collect(Collectors.groupingBy(b -> b.genre, Collectors.summarizingInt(b -> b.pages)));

        System.out.println("Library Book Statistics:");
        stats.forEach((genre, s) -> {
            System.out.println("Genre: " + genre);
            System.out.println("  Total Pages   : " + s.getSum());
            System.out.println("  Average Pages : " + s.getAverage());
            System.out.println("  Max Pages     : " + s.getMax());
            System.out.println();
        });
    }
}

