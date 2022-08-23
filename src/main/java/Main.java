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
		    //le password de 4 chiffre à introduire est: 1234 
			Account account = new Account("0054321", client);
		    List<Transaction> transactions = new ArrayList();

		    Monitor monitor = new Monitor();
		    monitor.displayMenu(client, account, transactions);
		   
		    
//		    String hash = "35454B055CC325EA1AF2126E27707052";
//		    String password = "1234";
//		        
//		    MessageDigest md = MessageDigest.getInstance("MD5");
//		    md.update(password.getBytes());
//		    byte[] digest = md.digest();
//		    String myHash = DatatypeConverter.printHexBinary(digest).toUpperCase();
//		    
//		    String password1 = "1234";
//	        
//		    MessageDigest md1 = MessageDigest.getInstance("MD5");
//		    md1.update(password1.getBytes());
//		    byte[] digest1 = md1.digest();
//		    String myHash1 = DatatypeConverter.printHexBinary(digest1).toUpperCase();
//		    
//		    
//		    System.out.println(myHash);
//		    System.out.println(myHash1);
	}

}
