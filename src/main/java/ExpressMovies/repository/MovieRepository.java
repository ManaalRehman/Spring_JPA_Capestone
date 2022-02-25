package ExpressMovies.repository;

import ExpressMovies.model.Movie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository("movieRepository")
@Transactional
public interface MovieRepository extends JpaRepository<Movie, Integer> {

    public void deleteBymovieName(String movieName);
    public Movie findBymovieName(String movieName);
}
