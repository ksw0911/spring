package DAO;

import DTO.MovieDTO;
import model.Movie;
import org.springframework.stereotype.Service;
import repo.MovieRepository;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class MovieDAO {
    MovieRepository movieRepository;

    public MovieDAO(MovieRepository movieRepository) {
        this.movieRepository = movieRepository;
    }
    public List<MovieDTO> findall(){
        return movieRepository.findAll().stream().map( movie -> new MovieDTO(movie)).collect(Collectors.toList());
    }
    public Movie save(Movie movie){
        return movieRepository.save(movie);
    }


}
