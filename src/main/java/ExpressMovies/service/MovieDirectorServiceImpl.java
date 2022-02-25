package ExpressMovies.service;

import ExpressMovies.dto.MovieDirectorDTO;
import ExpressMovies.repository.MovieDirectorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MovieDirectorServiceImpl implements MovieDirectorService{
    @Autowired
    MovieDirectorRepository movieDirectorRepository;


    @Override
    public void insertMovieDirector(MovieDirectorDTO movieDirectorDTO) {
        movieDirectorRepository.saveAndFlush(MovieDirectorDTO.prepareMovieDirectorEntity(movieDirectorDTO));
    }
}
