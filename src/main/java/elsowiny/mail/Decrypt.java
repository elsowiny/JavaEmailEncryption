package elsowiny.mail;

import org.jasypt.encryption.pbe.StandardPBEStringEncryptor;

public class Decrypt {

	public static void main(String[] args) {
		
		//decrypt("encryptedMessage","password");
		

	}
	 static String decrypt(String encryptedText, String cryptPassWord) {
			StandardPBEStringEncryptor decryptor = new StandardPBEStringEncryptor();
			decryptor.setPassword(cryptPassWord);  
			String decryptedText = decryptor.decrypt(encryptedText);
			System.out.println("Decrypted message is: " + decryptedText);
			return decryptedText;
		}

}
