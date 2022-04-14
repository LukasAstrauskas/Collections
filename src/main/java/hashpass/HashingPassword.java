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

    public void countingMethod() {
        System.out.println("Branch packed");
        int numberToIncrease =0;
        SecureRandom random = new SecureRandom();
        while (numberToIncrease<100) {
            System.out.println("Demo branch");
            numberToIncrease = (numberToIncrease+1)*2;
            numberToIncrease+= random.nextInt(20);
        }
        System.out.println(numberToIncrease);
    }

}
