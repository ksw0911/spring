package com.example.kino.model.DTO;

import com.example.kino.model.MovieInProgress;

import java.time.LocalDate;

public class MovieInProgressDTO {
    Long movieId;
    LocalDate date;
    String room;
    MovieDTO movie;

    public MovieInProgressDTO(Long movieId, LocalDate date, String room, MovieDTO movie) {
        this.movieId = movieId;
        this.date = date;
        this.room = room;
        this.movie = movie;
    }

    public MovieInProgressDTO(MovieInProgressDTO movieInProgressDTO){
        this.movieId = movieInProgressDTO.getMovieId();
        this.date = movieInProgressDTO.getDate();
        this.room = movieInProgressDTO.getRoom();
        this.movie = new MovieDTO(movieInProgressDTO.getMovie());
    }

    public MovieInProgressDTO(MovieInProgress movies) {
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

    public MovieDTO getMovie() {
        return movie;
    }

    public void setMovie(MovieDTO movie) {
        this.movie = movie;
    }
}
