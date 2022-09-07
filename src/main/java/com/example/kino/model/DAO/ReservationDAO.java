package com.example.kino.model.DAO;

import com.example.kino.model.DTO.ReservationDTO;
import com.example.kino.model.Reservation;
import com.example.kino.model.repo.ReservationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ReservationDAO {
ReservationRepository reservationRepository;
    @Autowired
    public ReservationDAO(ReservationRepository reservationRepository) {
        this.reservationRepository = reservationRepository;
    }

    public Reservation save(Reservation reservation){
        return reservationRepository.save(reservation);
    }

    public List<ReservationDTO> findAllByMovieInProgressId(Long id ){
    return reservationRepository.findByMovies_MovieId(id).stream().map(ReservationDTO::new).collect(Collectors.toList());
    }
}
