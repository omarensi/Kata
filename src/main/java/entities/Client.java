package entities;

import java.time.LocalDateTime;



public class Client {

  private String id;
  private String functionalId;
  private String firstName;
  private String lastName;
  private String email;
  private String hashedPassword;
  public Client() {
  }

  public Client(String id, String functionalId, String firstName, String lastName, String email, String hashedPassword) {
    this.id = id;
    this.functionalId = functionalId;
    this.firstName = firstName;
    this.lastName = lastName;
    this.email = email;
    this.hashedPassword = hashedPassword;
  }

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public String getFunctionalId() { return functionalId; }

  public void setFunctionalId(String functionalId) {
    this.functionalId = functionalId;
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

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public String getHashedPassword() {
	return hashedPassword;
  }

  public void setHashedPassword(String hashedPassword) {
	this.hashedPassword = hashedPassword;
  }
  
  

}
