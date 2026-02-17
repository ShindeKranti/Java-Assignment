package Assignment15;

import java.util.*;

public class MergeHashMaps {
    public static void main(String[] args) {
        HashMap<Integer, String> map1 = new HashMap<>();
        map1.put(1, "A");
        map1.put(2, "B");

        HashMap<Integer, String> map2 = new HashMap<>();
        map2.put(3, "C");
        map2.put(2, "D"); 

        map2.forEach((k, v) -> map1.merge(k, v, (v1, v2) -> v2)); 

        System.out.println("Merged HashMap: " + map1);
    }
}

