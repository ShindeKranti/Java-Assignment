package Assignment15;

import java.util.*;

public class SortHashMapByKey {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();
        map.put(3, "C");
        map.put(1, "A");
        map.put(2, "B");

        TreeMap<Integer, String> sortedMap = new TreeMap<>(map);
        System.out.println("Sorted by keys: " + sortedMap);
    }
}
