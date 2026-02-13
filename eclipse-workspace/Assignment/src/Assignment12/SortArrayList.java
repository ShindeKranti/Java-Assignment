package Assignment12;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class SortArrayList {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        System.out.println("Enter elements:");
        for(int i = 0; i < n; i++) {
            list.add(sc.nextInt());
        }

        System.out.println("Before Sorting: " + list);

        Collections.sort(list);

        System.out.println("After Sorting: " + list);
    }
}

