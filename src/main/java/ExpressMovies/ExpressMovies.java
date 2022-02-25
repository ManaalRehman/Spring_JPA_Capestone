package ExpressMovies;

import ExpressMovies.dto.DirectorDTO;
import ExpressMovies.dto.MovieDTO;
import ExpressMovies.dto.MovieDirectorDTO;
import ExpressMovies.repository.MovieRepository;
import ExpressMovies.service.DirectorService;
import ExpressMovies.service.MovieDirectorService;
import ExpressMovies.service.MovieService;
import com.InfyTel.domain.Customer;
import com.InfyTel.dto.CustomerDTO;
import com.InfyTel.service.CustomerService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.support.AbstractApplicationContext;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

@SpringBootApplication
public class ExpressMovies implements CommandLineRunner {
    @Autowired
    AbstractApplicationContext context;

    static Logger logger = Logger.getLogger(ExpressMovies.class);

    @Autowired
    private MovieService movieService;
    @Autowired
    private DirectorService directorService;

   @Autowired
   private MovieDirectorService movieDirectorService;

    public static void main(String[] args) {
        SpringApplication.run(ExpressMovies.class, args);
    }
    @Override
    public void run(String... args) throws Exception {


        movieService.insertMovie(new MovieDTO(1, "MHN", LocalDate.now(), LocalDateTime.now()));
        movieService.insertMovie(new MovieDTO(2, "KKKG", LocalDate.now(), LocalDateTime.now()));
        movieService.insertMovie(new MovieDTO(3, "BB", LocalDate.now(), LocalDateTime.now()));
        movieService.insertMovie(new MovieDTO(4, "MNIK", LocalDate.now(), LocalDateTime.now()));
        movieService.insertMovie(new MovieDTO(5, "KHNH", LocalDate.now(), LocalDateTime.now()));
        directorService.insertDirector(new DirectorDTO(1, "Karan", "Johar", "Hosur Road Mumbai", 987643544,"kj@bollywood.in" ));
        directorService.insertDirector(new DirectorDTO(2, "Fareeha", "Khan", "BTown Road Delhi", 987654324,"fk@bollywood.in" ));
        directorService.insertDirector(new DirectorDTO(3, "Sonia", "Kapoor", "HLing Road Jaipur", 667899866,"sk@bollywood.in" ));

        movieService.displayAllMovies();

        MovieDirectorDTO md1 = new MovieDirectorDTO(1, 1);
        movieService.updateMovieReleaseDate("BBB", LocalDate.now().plusDays(3));
        System.out.println("--------------------");
        movieService.displayAllMovies();
        directorService.updateDirectorDetails("Karan", "Johar", "8", 123);
       /* movieDirectorService.insertMovieDirector(md1);
        /*
        MovieDirectorDTO md2 = new MovieDirectorDTO(movieDTO2.getMovieId(), directorDTO1.getDirectorId());
        MovieDirectorDTO md3 = new MovieDirectorDTO(movieDTO3.getMovieId(), directorDTO2.getDirectorId());
        MovieDirectorDTO md4 = new MovieDirectorDTO(movieDTO4.getMovieId(), directorDTO2.getDirectorId());
        MovieDirectorDTO md5 = new MovieDirectorDTO(movieDTO5.getMovieId(), directorDTO3.getDirectorId());
        MovieDirectorDTO md6 = new MovieDirectorDTO(movieDTO6.getMovieId(), directorDTO3.getDirectorId());


        movieDirectorService.insertMovieDirector(md2);
        movieDirectorService.insertMovieDirector(md3);
        movieDirectorService.insertMovieDirector(md4);
        movieDirectorService.insertMovieDirector(md5);
        movieDirectorService.insertMovieDirector(md6);

        */



    }

}

