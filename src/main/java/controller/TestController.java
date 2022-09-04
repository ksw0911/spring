package controller;

import model.Movie;
import model.MovieInProgress;
import model.Reservation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.web.bind.annotation.RestController;
import repo.MovieInProgressRepository;
import repo.MovieRepository;
import repo.ReservationRepository;

import java.time.LocalDate;


@RestController
public class TestController {

    MovieRepository movieRepository;
    MovieInProgressRepository movieInProgressRepository;
    ReservationRepository reservationRepository;

    @Autowired
    public TestController(MovieRepository movieRepository, MovieInProgressRepository movieInProgressRepository, ReservationRepository reservationRepository) {
        this.movieRepository = movieRepository;
        this.movieInProgressRepository = movieInProgressRepository;
        this.reservationRepository = reservationRepository;
    }



    @EventListener(ApplicationReadyEvent.class)
    public  void  get(){
        Movie firstMovie = new Movie("pulp", 120,"XYZ");
        movieRepository.save(firstMovie);
        MovieInProgress screening = new MovieInProgress(LocalDate.now(),"A13",firstMovie);
        movieInProgressRepository.save(screening);
        Reservation reservation = new Reservation(57,"test@test.pl",123456789);
        reservationRepository.save(reservation);
    }

//    @GetMapping
//    public ModelAndView getTestData() {
//        ModelAndView mv = new ModelAndView();
//        mv.setViewName("welcome");
//        mv.getModel().put("data", "Welcome home man");
//
//        return mv;
//    }
//
//    @GetMapping("/students/{id}")
//    public Long sayHello(@PathVariable(required = false) Long id){
//        return id;
//    }
//
//    @GetMapping("/marks")
//    public String test(@RequestParam(required = false) Long id){
//        return "ocena nr:" + id;
//    }

}
