package com.example.kino.model.repo;

import com.example.kino.model.Reservation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ReservationRepository extends JpaRepository<Reservation,Long> {
List <Reservation> findByMovies_MovieId(Long id);
}
