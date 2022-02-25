package ExpressMovies.model;

import ExpressMovies.dto.MovieDirectorDTO;

import javax.persistence.*;

@Entity
public class MovieDirector {

    @Id
    private int movie_id;
    private int director_Id;

    public MovieDirector() {}

    public MovieDirector(int directorId, int movieid) {
        this.director_Id = directorId;
        this.movie_id = movieid;
    }


    public int getId() {
        return movie_id;
    }

    public void setId(int id) {
        this.movie_id = id;
    }


    public int getDirectorId() {
        return this.director_Id;
    }

    public void setDirectorId(int directorId) {
        this.director_Id = directorId;
    }

    public int getMovieid() {
        return movie_id;
    }

    public void setMovieid(int movieid) {
        this.movie_id = movieid;
    }

    public MovieDirectorDTO prepareMovieDirectorEntity(Director director, Movie movie){

        MovieDirectorDTO md = new MovieDirectorDTO();
        md.setDirectorId(director.getDirectorId());
        md.setMovieid(movie.getMovieId());

        return md;
    }


}
