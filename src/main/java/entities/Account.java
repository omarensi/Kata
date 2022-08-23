package entities;

import java.time.LocalDateTime;

public class Account {

  private String id;
  private double balance = 80;
  private LocalDateTime creationDate;
  private LocalDateTime lastOperationDate;
  private Client client;

  public Account() {
  }

  public Account(String id, Client client) {
    this.id = id;
    this.client = client;
  }

  public Account(String id, double balance, Client client) {
    this.id = id;
    this.creationDate = LocalDateTime.now();
    this.client = client;
    this.balance = balance;
  }

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public double getBalance() {
    return balance;
  }

  public void setBalance(double balance) {
    this.balance = balance;
  }

  public LocalDateTime getCreationDate() {
    return creationDate;
  }

  public void setCreationDate(LocalDateTime creationDate) {
    this.creationDate = creationDate;
  }

  public LocalDateTime getLastOperationDate() {
    return lastOperationDate;
  }

  public void setLastOperationDate(LocalDateTime lastOperationDate) {
    this.lastOperationDate = lastOperationDate;
  }

  public Client getClient() {
    return client;
  }

  public void setClient(Client client) {
    this.client = client;
  }
}
