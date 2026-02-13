package Assignment12;

import java.util.ArrayList;
import java.util.Scanner;



public class MergeArrayList {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();

        System.out.print("Enter number of elements for List 1: ");
        int n1 = sc.nextInt();

        System.out.println("Enter elements for List 1:");
        for(int i = 0; i < n1; i++) {
            list1.add(sc.nextInt());
        }

        System.out.print("Enter number of elements for List 2: ");
        int n2 = sc.nextInt();

        System.out.println("Enter elements for List 2:");
        for(int i = 0; i < n2; i++) {
            list2.add(sc.nextInt());
        }

        list1.addAll(list2);

        System.out.println("Merged List: " + list1);
    }
}
