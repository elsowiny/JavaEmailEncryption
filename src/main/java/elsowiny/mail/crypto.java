package elsowiny.mail;

import java.io.IOException;


import org.jasypt.encryption.pbe.StandardPBEStringEncryptor;
public class crypto {
	

	static String encrypt(String cryptPassWord, String msgToEncrypt) {
			StandardPBEStringEncryptor encryptor = new StandardPBEStringEncryptor();
		    encryptor.setPassword(cryptPassWord);        
		    String encryptedText = encryptor.encrypt(msgToEncrypt);
		    System.out.println("Encrypted message is: " + encryptedText);
		return encryptedText;
	}
}
