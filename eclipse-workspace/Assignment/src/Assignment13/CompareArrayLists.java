package Assignment13;

import java.util.ArrayList;

public class CompareArrayLists {
    public static void main(String[] args) {

        ArrayList<String> list1 = new ArrayList<>();
        list1.add("Kranti");
        list1.add("Aditi");
        list1.add("Advik");

        ArrayList<String> list2 = new ArrayList<>();
        list2.add("Kranti");
        list2.add("Aditi");
        list2.add("Advik");

        if (list1.equals(list2)) {
            System.out.println("Both ArrayLists are equal");
        } else {
            System.out.println("ArrayLists are not equal");
        }
    }
}
