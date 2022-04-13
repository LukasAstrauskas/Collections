import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;

public class HashingPassword {


    public String hashPassword(byte[] salt, String passwordToHash) {

        String saltStr = "";
//        for (int i = 0; i < salt.length; i++) {
//            System.out.println(salt[i]);
//            saltStr = saltStr + salt[i];
//        }
//        System.out.println(saltStr);
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


}
