package LinkedList.MovieManagementSystem;

public class Movie {
    String title;
    String director;
    int yearOfRelease;
    float rating;

    Movie prev, next;

    public Movie(String title, String director, int yearOfRelease, float rating) {
        this.title = title;
        this.director = director;
        this.yearOfRelease = yearOfRelease;
        this.rating = rating;
    }
}
