package Assignment14;

import java.util.HashSet;
import java.util.ArrayList;

public class ConvertSetToList {
    public static void main(String[] args) {

        HashSet<String> set = new HashSet<>();
        set.add("Kranti");
        set.add("Aditi");
        set.add("Advik");

        ArrayList<String> list = new ArrayList<>(set);

        System.out.println("ArrayList: " + list);
    }
}

