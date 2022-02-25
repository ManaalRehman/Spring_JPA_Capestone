package ExpressMovies.model;


import ExpressMovies.dto.DirectorDTO;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table
public class Director {

    @Id
    @Column(name = "directorId")
    private int directorId;
    private String firstName;
    private String lastName;
    private String address;
    private int contactNumber;
    private String emailAddress;

    @OneToMany(mappedBy="director")
    Set<Movie> movies;

    public Director(int directorId, String firstName, String lastName, String address, int contactNumber, String emailAddress) {
        this.directorId = directorId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.contactNumber = contactNumber;
        this.emailAddress = emailAddress;
    }

    public Director() {
    }

    public int getDirectorId() {
        return directorId;
    }

    public void setDirectorId(int directorId) {
        this.directorId = directorId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(int contactNumber) {
        this.contactNumber = contactNumber;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }


    public static DirectorDTO prepareDirectorDTOEntity(int directorId, String firstName, String lastName,
                                                 String address, int contactNumber, String emailAddress){

        DirectorDTO directorDTO = new DirectorDTO();
        directorDTO.setDirectorId(directorId);
        directorDTO.setFirstName(firstName);
        directorDTO.setLastName(lastName);
        directorDTO.setAddress(address);
        directorDTO.setContactNumber(contactNumber);
        directorDTO.setEmailAddress(emailAddress);

        return directorDTO;
    }

    @Override
    public String toString(){
        return "Id: " + directorId + " Director Name: " + firstName + " " + lastName;
    }


}
