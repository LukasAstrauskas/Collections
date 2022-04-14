package hashpass;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;

public class HashingPassword {


    public String hashPassword(byte[] salt, String passwordToHash) {
        MessageDigest md = null;
        try {
            md = MessageDigest.getInstance("SHA-512");
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
        md.update(salt);
        byte[] passwordHashed = md.digest(passwordToHash.getBytes());
        String passwordHashedString = "";
        for (byte b : passwordHashed) {
            String format = String.format("%02x", b);
            passwordHashedString = passwordHashedString + format;
        }
        System.out.println("Password, not hashed: " + passwordToHash);
        System.out.println("Hashed password: " + passwordHashedString);
        return passwordHashedString;
    }

    public String emptyMethod() {
        boolean isTrue = true;
        int numberToIncrease =0;
        while (numberToIncrease<10) {
            System.out.println("ON Main branch");
            isTrue = !isTrue;
            numberToIncrease++;
        }
          return  String.valueOf(isTrue);
    }

}
