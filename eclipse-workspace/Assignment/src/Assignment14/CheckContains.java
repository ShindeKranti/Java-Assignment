package Assignment14;

import java.util.HashSet;

public class CheckContains {
    public static void main(String[] args) {

        HashSet<String> set = new HashSet<>();
        set.add("Kranti");
        set.add("Advik");

        if (set.contains("Java")) {
            System.out.println("Element found");
        } else {
            System.out.println("Element not found");
        }
    }
}

