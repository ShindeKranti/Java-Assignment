package Assignment7;

import java.util.Scanner;

public class LengthSimple {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String: ");
        String str = sc.nextLine();

        int count = 0;

        for (char c : str.toCharArray()) {
            count++;
        }

        System.out.println("Length: " + count);
    }
}

