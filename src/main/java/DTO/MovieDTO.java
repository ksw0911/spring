package DTO;

import model.Movie;
import model.MovieInProgress;

import javax.persistence.OneToMany;
import java.util.ArrayList;
import java.util.List;

public class MovieDTO {
    Long movieId;
    String title;
    int duration;
    String genre;

    public MovieDTO(Movie movie){
        this.movieId = movie.getMovieId();
        this.title = movie.getTitle();
        this.duration = movie.getDuration();
        this.genre = movie.getGenre();
    }

    public MovieDTO(Long movieId,String title, int duration, String genre) {
        this.movieId = movieId;
        this.title = title;
        this.duration = duration;
        this.genre = genre;
    }

    public MovieDTO(MovieDTO movie) {
    }

    public Long getMovieId() {
        return movieId;
    }

    public void setMovieId(Long movieId) {
        this.movieId = movieId;
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
}
