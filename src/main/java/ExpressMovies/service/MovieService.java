package ExpressMovies.service;

import ExpressMovies.dto.MovieDTO;
import ExpressMovies.model.Movie;

import java.time.LocalDate;

public interface MovieService {
    public void insertMovie(MovieDTO movieDTO);
    public void displayAllMovies();
    public void removeMovie(String movieTitle);
    public void findByMovieName(String movieName);
    public void updateMovieReleaseDate(String movie, LocalDate releaseDate);
}
