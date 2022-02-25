package ExpressMovies.service;

import ExpressMovies.dto.DirectorDTO;
import ExpressMovies.model.Director;
import ExpressMovies.repository.DirectorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DirectorServiceImpl implements DirectorService{
    @Autowired
    DirectorRepository repository;
    @Override
    public void insertDirector(DirectorDTO directorDTO) {
        repository.saveAndFlush(DirectorDTO.prepareDirectorEntity(directorDTO));
    }

    @Override
    public void updateDirectorDetails(String firstName, String lastName, String address, int contactNumber) {
        Director director = repository.findByFirstNameAndLastName(firstName,lastName);

        if(director != null){
            director.setAddress(address);
            director.setContactNumber(contactNumber);
            repository.save(director);
        }else{
            System.out.println("Invalid Director Details");
        }

    }


}
