package controller;

import DAO.MovieDAO;
import DAO.MovieInProgressDAO;
import DAO.ReservationDAO;
import DTO.MovieDTO;
import DTO.MovieInProgressDTO;
import DTO.ReservationDTO;
import model.Movie;
import model.MovieInProgress;
import model.Reservation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import repo.MovieInProgressRepository;
import repo.ReservationRepository;

import java.time.LocalDate;
import java.util.List;


@RestController
public class TestController {

    MovieDAO movieDAO;
    MovieInProgressDAO movieInProgressDAO;
    ReservationDAO reservationDAO;

    @Autowired
    public TestController(MovieDAO movieDAO, MovieInProgressDAO movieInProgressDAO, ReservationDAO reservationDAO) {
        this.movieDAO = movieDAO;
        this.movieInProgressDAO = movieInProgressDAO;
        this.reservationDAO = reservationDAO;
    }



    @EventListener(ApplicationReadyEvent.class)
    public  void  get(){
        Movie firstMovie = new Movie("pulp", 120,"XYZ");
        movieDAO.save(firstMovie);
        MovieInProgress movieInProgress = new MovieInProgress(LocalDate.now(),"A13",firstMovie);
        movieInProgressDAO.save(movieInProgress);
        Reservation reservation = new Reservation(1L,57,"test@test.pl",123456789);
        reservationDAO.save(reservation);
    }


    @GetMapping("/movies")
    public List<MovieDTO> getAllMovies() {
    return movieDAO.findall();
    }

    @GetMapping("MovieInProgress/{movieId")
    public List<MovieInProgressDTO> getMovieInProgressById(@PathVariable Long movieId){
        return movieInProgressDAO.findMovieInProgressById(movieId);
    }

    @GetMapping("/reservations/{screeningId")
    public List<ReservationDTO> getReservationsByMovieInProgressId(@PathVariable Long movieInProgressId){
        return reservationDAO.findAllByMovieInProgressId( movieInProgressId);
    }
}
