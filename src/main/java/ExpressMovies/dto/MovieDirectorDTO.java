package ExpressMovies.dto;

import ExpressMovies.model.MovieDirector;

public class MovieDirectorDTO {

    private int directorId;
    private int movieid;

    public MovieDirectorDTO() {}

    public MovieDirectorDTO(int directorId, int movieid) {
        this.directorId = directorId;
        this.movieid = movieid;
    }

    public int getDirectorId() {
        return this.directorId;
    }

    public void setDirectorId(int directorId) {
        this.directorId = directorId;
    }

    public int getMovieid() {
        return movieid;
    }

    public void setMovieid(int movieid) {
        this.movieid = movieid;
    }

    public static MovieDirector prepareMovieDirectorEntity(MovieDirectorDTO movieDirectorDTO){

        MovieDirector md = new MovieDirector();
        md.setDirectorId(movieDirectorDTO.getDirectorId());
        md.setMovieid(movieDirectorDTO.getMovieid());

        return md;
    }
}
