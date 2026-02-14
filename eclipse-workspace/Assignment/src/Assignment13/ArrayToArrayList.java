package Assignment13;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayToArrayList {
    public static void main(String[] args) {

        Integer[] arr = {100, 200, 300};

        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(arr));

        System.out.println("ArrayList: " + list);
    }
}
