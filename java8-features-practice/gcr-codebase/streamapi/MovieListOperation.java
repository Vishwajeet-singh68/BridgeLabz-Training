package streamapi;

import java.util.Date;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class Movie {
    String name;
    float rating;
    LocalDate releaseDate;

    public Movie(String name, float rating, LocalDate releaseDate) {
        this.name = name;
        this.rating = rating;
        this.releaseDate = releaseDate;
    }
}

public class MovieListOperation {

    public static void main(String[] args) {

        List<Movie> movies = new ArrayList<>();

        movies.add(new Movie("Inception", 8.8f, LocalDate.of(2010, 7, 16)));
        movies.add(new Movie("Interstellar", 8.6f, LocalDate.of(2014, 11, 7)));
        movies.add(new Movie("The Dark Knight", 9.0f, LocalDate.of(2008, 7, 18)));
        movies.add(new Movie("Avengers Endgame", 8.4f, LocalDate.of(2019, 4, 26)));
        movies.add(new Movie("Titanic", 7.9f, LocalDate.of(1997, 12, 19)));
        movies.add(new Movie("Jurassic Park", 8.2f, LocalDate.of(1993, 6, 11)));
        movies.add(new Movie("The Matrix", 8.7f, LocalDate.of(1999, 3, 31)));
        movies.add(new Movie("Gladiator", 8.5f, LocalDate.of(2000, 5, 5)));
        movies.add(new Movie("Avatar", 7.8f, LocalDate.of(2009, 12, 18)));
        movies.add(new Movie("Forrest Gump", 8.8f, LocalDate.of(1994, 7, 6)));

        List<Movie> filteredMovie = movies.stream().filter(movie -> movie.releaseDate.getYear()>=2000)
        .sorted((movie1, movie2)-> Float.compare(movie1.rating, movie2.rating))
        .limit(5).collect(Collectors.toList());
        
        
        for(Movie m:filteredMovie) {
        	System.out.println(m.name);
        	System.out.println(m.rating);
        	System.out.println(m.releaseDate);
        }
    }
}
