package ExpressMovies.service;

import ExpressMovies.dto.DirectorDTO;
import ExpressMovies.model.Director;

public interface DirectorService {
    public void insertDirector(DirectorDTO directorDTO);
    public void updateDirectorDetails(String firstName, String lastName, String address, int contactNumber);

}
