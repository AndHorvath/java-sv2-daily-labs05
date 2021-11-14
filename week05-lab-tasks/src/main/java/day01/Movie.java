package day01;

import java.time.LocalDateTime;
import java.util.List;

public class Movie {

    // --- attributes ---------------------------------------------------------

    private String title;
    private List<LocalDateTime> datesAndTimes;

    // --- constructors -------------------------------------------------------

    public Movie(String title, List<LocalDateTime> datesAndTimes) {
        this.title = title;
        this.datesAndTimes = datesAndTimes;
    }

    // --- getters and setters ------------------------------------------------

    public String getTitle() { return title; }
    public List<LocalDateTime> getDatesAndTimes() { return datesAndTimes; }
}