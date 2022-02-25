package ExpressMovies.dto;

import ExpressMovies.model.Director;

public class DirectorDTO {

    private int directorId;
    private String firstName;
    private String lastName;
    private String address;
    private int contactNumber;
    private String emailAddress;

    public DirectorDTO(int directorId, String firstName, String lastName, String address, int contactNumber, String emailAddress) {
        this.directorId = directorId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.contactNumber = contactNumber;
        this.emailAddress = emailAddress;
    }

    public DirectorDTO() {
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

    public static Director prepareDirectorEntity(DirectorDTO directorDTO){

        Director director = new Director();
        director.setDirectorId(directorDTO.getDirectorId());
        director.setFirstName(directorDTO.getFirstName());
        director.setLastName(directorDTO.lastName);
        director.setAddress(directorDTO.address);
        director.setContactNumber(directorDTO.getContactNumber());
        director.setEmailAddress(directorDTO.getEmailAddress());

        return director;
    }
}
