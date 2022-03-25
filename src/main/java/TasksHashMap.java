import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class TasksHashMap<K, V> {

//1. Write a Java program to associate the specified value with the specified key in a HashMap.

    public String addKeyValueToHashMap(K key, V value, HashMap<K, V> map) {
        V put = map.put(key, value);
        String string = put == null ? "New val" : put.toString();
        return string;
    }

    //2. Write a Java program to count the number of key-value (size) mappings in a map.
    public int countSize(HashMap<K, V> map) {
        return map.size();
    }

    //3. Write a Java program to copy all the mappings from the specified map to another map.
    public HashMap<K, V> copyAll(HashMap<K, V> copyTo, HashMap<K, V> copyFrom) {
        copyTo.putAll(copyFrom);
        return copyTo;
    }

    //4. Write a Java program to remove all the mappings from a map.
    public HashMap<K, V> removeAll(HashMap<K, V> map) {
        map.clear();
        return map;
    }

    //5. Write a Java program to check whether a map contains key-value mappings (empty) or not.
    public boolean isEmpty(HashMap<K, V> map) {
        return map.isEmpty();
    }

    //6. Write a Java program to get a shallow copy of a HashMap instance.
    public Object shallowCopy(HashMap<K, V> map) {
        return map.clone();
    }

    //7. Write a Java program to test if a map contains a mapping for the specified key.
    public boolean containsKey(K key, HashMap<K, V> map) {
        return map.containsKey(key);
    }

    //8. Write a Java program to test if a map contains a mapping for the specified value.
    public boolean containsValue(V value, HashMap<K, V> map) {
        return map.containsValue(value);
    }

    //9. Write a Java program to create a set view of the mappings contained in a map.
    public Set<String> returnSetViewOfMaps(HashMap<K, V> map) {
        Set<String> set = new HashSet<>();
        map.forEach((key, value) -> {
            set.add(key.toString() + " " + value.toString());
        });
        return set;
    }

    //10. Write a Java program to get the value of a specified key in a map.
    public V getValue(HashMap<K, V> map, K key) {
        return map.get(key);
    }

    //11. Write a Java program to get a set view of the keys contained in this map.
    public Set<String> returnSetViewOfKeys(HashMap<K, V> map) {
        Set<String> set = new HashSet<>();
        map.forEach((key, value) -> set.add(key.toString()));
        return set;
    }

    //12. Write a Java program to get a collection view of the values contained in this map.
    public Set<String> returnSetViewOfValues(HashMap<K, V> map) {
        Set<String> set = new HashSet<>();
        map.forEach((key, value) -> set.add(value.toString()));
        return set;
    }

}