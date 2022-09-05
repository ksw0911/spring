package DAO;

import DTO.ReservationDTO;
import model.Movie;
import model.Reservation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repo.MovieRepository;
import repo.ReservationRepository;

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
