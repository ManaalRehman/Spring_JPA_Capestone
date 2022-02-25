package ExpressMovies.service;

import ExpressMovies.dto.MovieDTO;
import ExpressMovies.model.Movie;
import ExpressMovies.repository.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@Service("movieService")
public class MovieServiceImpl implements MovieService{

    @Autowired
    MovieRepository repository;

    @Override
    public void insertMovie(MovieDTO movieDTO) {
        repository.saveAndFlush(MovieDTO.prepareMovieEntity(movieDTO));
    }

    @Override
    public void displayAllMovies() {
        List<Movie> movieList = repository.findAll();

        for (Movie movie:movieList) {

            System.out.println(movie);

        }
    }

    @Override
    public void removeMovie(String movieName) {
        repository.deleteBymovieName(movieName);
    }

    @Override
    public void findByMovieName(String movieName) {

        Movie movie = repository.findBymovieName(movieName);

        if(movie == null){
            System.out.println("Invalid Movie Name");
        }else{
            System.out.println(movie);
        }

    }

    @Override
    public void updateMovieReleaseDate(String movie, LocalDate releaseDate) {

        Movie movieToUpdate = repository.findBymovieName(movie);

        if (movieToUpdate != null){
            movieToUpdate.setReleaseDate(releaseDate);
            repository.save(movieToUpdate);
        }else{
            System.out.println("Invalid Movie Details");
        }

        

    }
}
