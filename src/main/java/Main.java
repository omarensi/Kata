import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.DatatypeConverter;

import entities.Account;
import entities.Client;
import entities.Transaction;
import view.Monitor;

public class Main {

	public static void main(String[] args) throws NoSuchAlgorithmException {
			
			Client client = new Client("12345678", "102030", "Eden", "Dupont", "edin.dupont@gmail.com", "81DC9BDB52D04DC20036DBD8313ED055");
		    //le password de 4 chiffre � introduire est: 1234 
			Account account = new Account("0054321", client);
		    List<Transaction> transactions = new ArrayList();

		    Monitor monitor = new Monitor();
		    monitor.displayMenu(client, account, transactions);

	}

}
