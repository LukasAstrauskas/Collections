import java.util.HashMap;

public class Main {

    public static void main(String[] args) {
	// write your code here

        HashMap<Integer, String> map = new HashMap<>();
        TasksHashMap<Integer, String> tasks = new TasksHashMap<>();
        String john = tasks.addKeyValueToHashMap(1, "John", map);
        System.out.println(john);
    }
}
