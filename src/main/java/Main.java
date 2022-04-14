import hashpass.HashingPassword;

import java.security.SecureRandom;

public class Main {

    public static void main(String[] args) {

        SecureRandom random = new SecureRandom();
        byte[] salt = new byte[16];
        random.nextBytes(salt);

        HashingPassword hashing = new HashingPassword();
        String pass = hashing.hashPassword(salt,"pass");

        String pass1 = hashing.hashPassword(salt,"pass");
        System.out.println(pass.equals(pass1));
    }
}
