import java.util.*;

public class TasksHashSet<T> {
    //Write a Java program to append the specified element to the end of a hash set.
    public HashSet<T> append(HashSet<T> set, T t) {
        set.add(t);
        return set;
    }
//    Write a Java program to iterate through all elements in a hash list.

    public void iterateThroughSet(HashSet<T> set) {
        set.forEach(el -> {
            String s = el.toString();
            System.out.println(s);
        });
    }

    // Write a Java program to get the number of elements in a hash set
    public int elementsInSet(HashSet<T> set) {
        return set.size();
    }

    //    Write a Java program to empty a hash set.
    public HashSet<T> emptySet(HashSet<T> set) {
        set.clear();
        return set;
    }

    //    Write a Java program to test a hash set is empty or not.
    public boolean testIfEmpty(HashSet<T> set) {
        return set.isEmpty();
    }

    //    Write a Java program to clone a hash set to another hash set.
    public HashSet<T> clone(HashSet<T> set) {
        return new HashSet<T>(set);
    }

    //    Write a Java program to convert a hash set to an array
    public Object[] toArray(HashSet<T> set) {
        return set.toArray();
    }

    //    Write a Java program to convert a hash set to a tree set.
    public TreeSet<T> setToTreeSet(HashSet<T> set) {
        return new TreeSet<>(set);
    }

    //    Write a Java program to convert a hash set to a List/ArrayList. Go to the editor
    public List<T> setToList(HashSet<T> set) {
        return new ArrayList<>(set);
    }

    //    Write a Java program to compare two hash set
    public boolean compareHashSets(HashSet<T> set1, HashSet<T> set2) {
        return set1.removeAll(set2);
    }

    //    Write a Java program to compare two sets and retain elements which are same on both sets.
    public HashSet<T> compareRetain(HashSet<T> set1, HashSet<T> set2) {
        if (set1.retainAll(set2)) {
            return set1;
        } else
            return new HashSet<>();
    }

    //    Write a Java program to remove all the elements from a hash set.
    public HashSet<T> removeAll(HashSet<T> set) {
        set.removeAll(set);
        return set;
    }


}
