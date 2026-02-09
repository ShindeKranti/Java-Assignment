package Assignment7;

import java.util.Scanner;

public class StringToCharArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String: ");
        String str = sc.nextLine();

        char[] ch = str.toCharArray();

        System.out.println("Characters are:");
        for (int i = 0; i < ch.length; i++) {
            System.out.println(ch[i]);
        }
    }
}
