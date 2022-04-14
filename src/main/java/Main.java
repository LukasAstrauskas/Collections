import hashpass.HashingPassword;

import java.security.SecureRandom;
import java.util.HashMap;

public class Main {

    public static void main(String[] args) {
        // write your code here

//        Doing no commit, straight pushing.

//        HashMap<Integer, String> map = new HashMap<>();
//        TasksHashMap<Integer, String> tasks = new TasksHashMap<>();
//        String john = tasks.addKeyValueToHashMap(1, "John", map);
//        System.out.println(john);

        SecureRandom random = new SecureRandom();
        byte[] salt = new byte[16];
        random.nextBytes(salt);

        HashingPassword hashing = new HashingPassword();
        String pass = hashing.hashPassword(salt,"pass");

        String pass1 = hashing.hashPassword(salt,"pass");
        System.out.println(pass.equals(pass1));
    }
}
