package com.example.kino.model;

import javax.persistence.*;

@Entity
public class Reservation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long reservationID;
    int place;
    String email;
    int phoneNumber;

    @ManyToOne
    MovieInProgress Movies;

    public Reservation() {
    }

    public Reservation(Long reservationID,int place, String email, int phoneNumber) {
        this.reservationID = reservationID;
        this.place = place;
        this.email = email;
        this.phoneNumber = phoneNumber;

    }

    public Long getReservationID() {
        return reservationID;
    }

    public void setReservationID(Long reservationID) {
        this.reservationID = reservationID;
    }

    public int getPlace() {
        return place;
    }

    public void setPlace(int place) {
        this.place = place;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public MovieInProgress getMovies() {
        return Movies;
    }

    public void setMovies(MovieInProgress movies) {
        Movies = movies;
    }


}
