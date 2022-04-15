package hashpass;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.Random;

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
// fsf
    public void dumpMeth(){
        System.out.println("Nothing");
    }

    public double countingMethod() {
        System.out.println("Branch packed");
        double numberToIncrease =100;
        Random random = new Random();
        while (numberToIncrease>10) {
//            jssd wdak
            System.out.println("Packed branch");
            numberToIncrease = (numberToIncrease+2)/2;
            numberToIncrease+= random.nextInt(20);
        }
       return numberToIncrease;
    }

}
