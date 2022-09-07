package com.example.kino.model;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Entity
public class MovieInProgress {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long movieId;
    LocalDate date;
    String room;


    @ManyToOne
    Movie movie;

    @OneToMany(mappedBy = "Movies")
    List<Reservation> reservations = new ArrayList<>();

    public MovieInProgress(LocalDate now, String a13, Movie movie){

    }

    public MovieInProgress(Long movieId, LocalDate date, String room) {

        this.date = date;
        this.room = room;
        this.movie = movie;
    }

    public MovieInProgress() {

    }


    public Movie getMovie() {
        return movie;
    }

    public void setMovie(Movie movie) {
        this.movie = movie;
    }

    public List<Reservation> getReservations() {
        return reservations;
    }

    public void setReservations(List<Reservation> reservations) {
        this.reservations = reservations;
    }

    public Long getMovieId() {
        return movieId;
    }

    public void setMovieId(Long movieId) {
        this.movieId = movieId;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public String getRoom() {
        return room;
    }

    public void setRoom(String room) {
        this.room = room;
    }
}
