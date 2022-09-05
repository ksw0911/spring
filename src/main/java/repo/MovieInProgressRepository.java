package repo;

import DAO.MovieInProgressDAO;
import DTO.MovieInProgressDTO;
import model.MovieInProgress;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MovieInProgressRepository extends JpaRepository<MovieInProgress,Long> {

List<MovieInProgress> findAllByMovie_MovieId(Long movieId);
}
