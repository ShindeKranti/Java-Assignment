package Assignment13;

import java.util.ArrayList;
import java.util.HashSet;

public class RemoveDuplicates {
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();
        list.add("Java");
        list.add("Python");
        list.add("Java");
        list.add("C++");
        list.add("Python");

        System.out.println("Original List: " + list);

        HashSet<String> set = new HashSet<>(list);

        ArrayList<String> uniqueList = new ArrayList<>(set);

        System.out.println("List After Removing Duplicates: " + uniqueList);
    }
}
