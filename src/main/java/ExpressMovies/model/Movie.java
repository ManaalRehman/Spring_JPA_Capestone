package ExpressMovies.model;

import ExpressMovies.dto.MovieDTO;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
public class Movie {
    @Id
    private int movieId;
    private String movieName;
    private LocalDate releaseDate;
    private LocalDateTime runTime;

    @ManyToOne
    @JoinTable(name="MovieDirector")
    Director director;

    public Movie() {}

    public Movie(int movieId, String movieName, LocalDate releaseDate, LocalDateTime runTime) {
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

    public MovieDTO prepareMovieDTO(int movieId, String movieName,
                                    LocalDate releaseDate, LocalDateTime runTime){
        MovieDTO movieDTO = new MovieDTO();
        movieDTO.setMovieId(movieId);
        movieDTO.setMovieName(movieName);
        movieDTO.setReleaseDate(releaseDate);
        movieDTO.setRunTime(runTime);

        return movieDTO;
    }

    @Override
    public String toString(){
        return "MovieId: " + movieId +
                " Movie Name: " + movieName +
                " Release Date: " + releaseDate +
                " Run Time: " + runTime;
    }
}
