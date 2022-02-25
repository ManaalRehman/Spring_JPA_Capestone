package ExpressMovies.repository;

import ExpressMovies.model.MovieDirector;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MovieDirectorRepository extends JpaRepository<MovieDirector, Integer> {

}
