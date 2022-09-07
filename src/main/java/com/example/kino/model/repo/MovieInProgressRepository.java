package com.example.kino.model.repo;


import com.example.kino.model.MovieInProgress;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MovieInProgressRepository extends JpaRepository<MovieInProgress,Long> {

List<MovieInProgress> findAllByMovie_MovieId(Long movieId);
}
