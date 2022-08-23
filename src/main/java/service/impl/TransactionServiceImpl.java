package service.impl;



import java.util.Comparator;
import java.util.List;
import java.util.Objects;
import entities.Account;
import entities.Transaction;
import enums.TransactionType;
import service.TransactionService;

public class TransactionServiceImpl implements TransactionService {

  @Override	 
  public Transaction depositTransaction(Account account, Double amount) {
    return new Transaction(amount, TransactionType.DEBIT.getValue(), account, account.getBalance());
  }

  @Override
  public Transaction withdrawalTransaction(Account account, Double amount) {
    return new Transaction(amount, TransactionType.CREDIT.getValue(), account, account.getBalance());
  }

}
