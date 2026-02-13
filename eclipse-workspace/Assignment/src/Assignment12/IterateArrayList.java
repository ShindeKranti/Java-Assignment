package Assignment12;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class IterateArrayList {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        System.out.println("Enter elements:");
        for(int i = 0; i < n; i++) {
            list.add(sc.nextInt());
        }

        Iterator<Integer> it = list.iterator();

        System.out.println("Elements are:");
        while(it.hasNext()) {
            System.out.println(it.next());
        }
    }
}

