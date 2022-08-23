package view;

import static java.lang.System.out;

import java.security.NoSuchAlgorithmException;
import java.time.format.DateTimeFormatter;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

import entities.Account;
import entities.Client;
import entities.Transaction;
import exceptions.KataException;
import security.MD5Verification;
import service.AccountService;
import service.TransactionService;
import service.impl.AccountServiceImpl;
import service.impl.TransactionServiceImpl;

public class Monitor {

  public static final char CheckBalance = 'A';
  public static final char Deposit = 'B';
  public static final char Withdraw = 'C';
  public static final char Exit = 'D';

  public void displayMenu(Client client, Account account, List<Transaction> transactions) throws NoSuchAlgorithmException {
    AccountService accountService = new AccountServiceImpl();
    TransactionService transactionService = new TransactionServiceImpl();
    char option;
    String passWord = "";

    Scanner scanner = new Scanner(System.in);
    
    out.println("****************Saisir votre code de quatre chiffres******************");
    int i = 0;
    
    while (i<3) {
    	passWord = scanner.next();
        try {
        	MD5Verification.verifyPasswordAndHash(passWord, client.getHashedPassword());
        	break;
        } catch (Exception e) {
    		// TODO: handle exception
        	// log.error(e.toString());
        	out.println(e.getMessage());
        	i++;
    	}
    }
    if (i>=3) {
    	out.println("XXXXXXXXXXXXXXXXXXXXX carte bloquée vous avez dépassé 3 essais XXXXXXXXXXXXXXXXXXX");
    	scanner.close();
    } else {
    	
        out.println("********************");
        out.println("Bienvenu à la société générale " + client.getFirstName() + " " + client.getLastName());
        out.println("********************");

        out.println("A. Observer votre solde");
        out.println("B. Déposer de l'argent");
        out.println("C. Retirer de l'argent");
        out.println("E. Exit");

        do {

          out.println("********************");
          out.println("Choisir une option:");
          option = scanner.next().toUpperCase().charAt(0);
          try {
            switch (option) {
              case CheckBalance:
                out.println("********************");
                out.println("Votre solde est de " + String.format("%.2f", account.getBalance()) + "euro");
                break;
              case Deposit:
                out.println("********************");
                out.println("saisir le montant à déposer:");
                double amountToDeposit = scanner.nextInt();
                accountService.depositAmount(account, amountToDeposit);
                transactions.add(transactionService.depositTransaction(account, amountToDeposit));
                break;
              case Withdraw:
                out.println("********************");
                out.println("saisir le montant à retirer:");
                double amountToWithdraw = scanner.nextInt();
                accountService.withdrawalAmount(account, amountToWithdraw);
                transactions.add(transactionService.withdrawalTransaction(account, amountToWithdraw));
                break;
              case Exit:
                out.println("********************");
                out.println("Au revoir !");
                break;

              default:
                out.println("Veuillez choisir une option parmi ceux dans l'écran");
                break;
            }
          } catch (KataException kataException) {
            out.println(kataException.getMessage());
          } catch (InputMismatchException inputMismatchException) {
            out.println("saisir un montant valide");
          }
        } while (option != Exit);

        scanner.close();
    }
    
    

    
  }

}
