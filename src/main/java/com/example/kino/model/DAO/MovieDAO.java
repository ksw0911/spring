package com.example.kino.model.DAO;

import com.example.kino.model.DTO.MovieDTO;
import com.example.kino.model.Movie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.kino.model.repo.MovieRepository;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class MovieDAO {
    MovieRepository movieRepository;
@Autowired
    public MovieDAO(MovieRepository movieRepository) {
        this.movieRepository = movieRepository;
    }
    public List<MovieDTO> findall(){
        return movieRepository.findAll().stream().map( MovieDTO::new).collect(Collectors.toList());
    }
    public Movie save(Movie movie){

    return movieRepository.save(movie);
    }


}
