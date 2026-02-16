package Assignment14;

import java.util.HashSet;

public class IterateHashSet {
    public static void main(String[] args) {

        HashSet<String> set = new HashSet<>();
        set.add("Kranti");
        set.add("Aditi");
        set.add("Advik");

        for (String x : set) {
            System.out.println(x);
        }
    }
}
