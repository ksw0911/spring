package model;

import javax.persistence.*;
import java.util.List;

@Entity

public class Movie {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    String title;
    int duration;
    String genre;

    @OneToMany(mappedBy = "movie")
    List<MovieInProgress> Movies;


    public Movie() {
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public List<MovieInProgress> getMovies() {
        return Movies;
    }

    public void setMovies(List<MovieInProgress> movies) {
        Movies = movies;
    }

    public Movie( String title, int duration, String genre) {

        this.title = title;
        this.duration = duration;
        this.genre = genre;

    }

}
