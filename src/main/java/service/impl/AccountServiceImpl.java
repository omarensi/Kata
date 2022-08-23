package service.impl;

import static java.util.Objects.isNull;

import java.time.LocalDateTime;

import entities.Account;
import exceptions.KataException;
import service.AccountService;

public class AccountServiceImpl implements AccountService {

  @Override
  public Account depositAmount(Account account, Double amount) {
    checkAmountValidity(amount);
    double newBalance = account.getBalance() + amount;
    account.setBalance(newBalance);
    account.setLastOperationDate(LocalDateTime.now());
    return account;
  }
  
  @Override
  public Account withdrawalAmount(Account account, Double amount) {
    checkAmountValidity(amount);
    if(account.getBalance() < amount) {
      throw new KataException(400, "the amount must be less than your current balance",
          "your amount exceeds your current balance");
    }
    double newBalance = account.getBalance() - amount;
    account.setBalance(newBalance);
    account.setLastOperationDate(LocalDateTime.now());
    return account;
  }

  
  private void checkAmountValidity(Double amount) {
    if (isNull(amount) || amount < 0) {
      throw new KataException(400, "amount must be positive",
          "Please add a positive value");
    }
  }
}
