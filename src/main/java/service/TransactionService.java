package service;

import java.util.List;

import entities.Account;
import entities.Transaction;


public interface TransactionService {

  Transaction depositTransaction(Account account, Double amount);

  Transaction withdrawalTransaction(Account account, Double amount);

}
