package DAO;

import DTO.MovieInProgressDTO;
import model.MovieInProgress;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repo.MovieInProgressRepository;
import repo.MovieRepository;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class MovieInProgressDAO {
    MovieInProgressRepository movieInProgressRepository;

    @Autowired
    public MovieInProgressDAO(MovieInProgressRepository movieInProgressRepository) {
        this.movieInProgressRepository= movieInProgressRepository;
    }
public List<MovieInProgressDTO> findMovieInProgressById (Long movieId){
        return  movieInProgressRepository.findAllByMovie_MovieId(movieId).stream().map(MovieInProgressDTO::new).collect(Collectors.toList());
}
    public MovieInProgress save(MovieInProgress movieInProgress) {
        return movieInProgressRepository.save(movieInProgress);
    }
}
