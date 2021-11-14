package day01;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Cinema {

    // --- attributes ---------------------------------------------------------

    private List<Movie> movieList;

    // --- constructors -------------------------------------------------------

    public Cinema() {
        movieList = new ArrayList<>();
    }

    // --- getters and setters ------------------------------------------------

    public List<Movie> getMovieList() { return movieList; }

    // --- public methods -----------------------------------------------------

    public void addMovie(Movie movie) {
        movieList.add(movie);
    }

    public List<String> findMovieByTime(LocalDateTime dateTime) {
        List<String> moviesAtDateAndTime = new ArrayList<>();

        for (Movie movie : movieList) {
            for (LocalDateTime movieDateTime : movie.getDatesAndTimes()) {
                if (dateTime.equals(movieDateTime)) {
                    moviesAtDateAndTime.add(movie.getTitle());
                }
            }
        }
        return moviesAtDateAndTime;
    }
}