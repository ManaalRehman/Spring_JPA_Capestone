package ExpressMovies.service;

import ExpressMovies.dto.MovieDirectorDTO;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MovieDirectorService {

    public void insertMovieDirector(MovieDirectorDTO movieDirectorDTO);

}
