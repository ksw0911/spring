package repo;

import model.MovieInProgress;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MovieInProgressRepository extends JpaRepository<MovieInProgress,Long> {
}
