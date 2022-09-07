package com.example.kino.model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Movie {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long movieId;
    String title;
    int duration;
    String genre;

    @OneToMany(mappedBy = "movie")
    List<MovieInProgress> Movies = new ArrayList<>();

    public Movie(Long movieId, String title, int duration, String genre, List<MovieInProgress> movies) {
        this.movieId = movieId;
        this.title = title;
        this.duration = duration;
        this.genre = genre;
        Movies = movies;
    }

    public Long getMovieId() {
        return movieId;
    }

    public void setMovieId(Long movieId) {
        this.movieId = movieId;
    }

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
