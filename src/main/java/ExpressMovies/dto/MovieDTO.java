package ExpressMovies.dto;

import ExpressMovies.model.Movie;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class MovieDTO {

    private int movieId;
    private String movieName;
    private LocalDate releaseDate;
    private LocalDateTime runTime;


    public MovieDTO() {}

    public MovieDTO(int movieId, String movieName, LocalDate releaseDate, LocalDateTime runTime) {
        this.movieId = movieId;
        this.movieName = movieName;
        this.releaseDate = releaseDate;
        this.runTime = runTime;
    }

    public int getMovieId() {
        return movieId;
    }

    public void setMovieId(int movieId) {
        this.movieId = movieId;
    }

    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public LocalDate getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(LocalDate releaseDate) {
        this.releaseDate = releaseDate;
    }

    public LocalDateTime getRunTime() {
        return runTime;
    }

    public void setRunTime(LocalDateTime runTime) {
        this.runTime = runTime;
    }

    public static Movie prepareMovieEntity(MovieDTO movieDTO){
        Movie movie = new Movie();
        movie.setMovieId(movieDTO.getMovieId());
        movie.setMovieName(movieDTO.getMovieName());
        movie.setReleaseDate(movieDTO.getReleaseDate());
        movie.setRunTime(movieDTO.getRunTime());

        return movie;
    }

}
