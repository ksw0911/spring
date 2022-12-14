package com.example.kino.model.DTO;

import com.example.kino.model.Reservation;

public class ReservationDTO {
    Long reservationID;
    int place;
    String email;
    int phoneNumber;

   MovieInProgressDTO movieInProgress;

    public ReservationDTO(Long reservationID,int place, String email, int phoneNumber, MovieInProgressDTO movieInProgressDTO) {
       this.reservationID = reservationID;
        this.place = place;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.movieInProgress = movieInProgress;
    }

    public ReservationDTO(Reservation reservation) {
        this.reservationID = reservation.getReservationID();
        this.place = reservation.getPlace();
        this.email = reservation.getEmail();
        this.phoneNumber = reservation.getPhoneNumber();
        this.movieInProgress = new MovieInProgressDTO(reservation.getMovies());
    }
}
