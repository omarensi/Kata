package service;

import entities.Account;

public interface AccountService {

  Account depositAmount(Account account, Double amount);

  Account withdrawalAmount(Account account, Double amount);
}
