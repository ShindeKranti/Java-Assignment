package Assignment13;

import java.util.ArrayList;

public class ArrayListToArray {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);

        Integer[] arr = list.toArray(new Integer[0]);

        for (int num : arr) {
            System.out.println(num);
        }
    }
}
