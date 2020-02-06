# Java-encryption-mail
A simple java application to send encrypted emails from your gmail account

NOTE--READ ALL

The app may fail due to gmail not allowing "less secure app access"
You may need to turn on access to allow less secure apps to utilize gmail
This can be done with the url below

https://www.google.com/settings/security/lesssecureapps


Set your gmail email and password in the main application in app.java
You will then have to set the recipent's email
Next, enter your desired email subject as well as your message you would like to be sent

Then, create a unique password (different from your gmail password) that will be used
to encrypt and decrypt the message.
The applicaion will utilize the crypto.java program to encrypt your message
then return it back and send the email.

Finally, in the decrypt.java file is a main method to which you or your recipent can use
to decrypt your message... simply enter the password used in the encryption and the given
encrypted message
--note that the program WILL fail if the password is incorrect..
(a default password by the name "crypticPassWord" is put by default)