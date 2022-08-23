package security;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

import javax.xml.bind.DatatypeConverter;

import exceptions.KataException;

public final class MD5Verification {
	
	public static void verifyPasswordAndHash(String password, String hash) throws NoSuchAlgorithmException {
		
		MessageDigest md = MessageDigest.getInstance("MD5");
	    md.update(password.getBytes());
	    byte[] digest = md.digest();
	    String myHash = DatatypeConverter.printHexBinary(digest).toUpperCase();
	    if (!myHash.equals(hash)) {
	    	throw new KataException(401,"Code de 4 chiffres incorrect", "unauthorized");
	    }
	}

}
