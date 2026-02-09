package Assignment7;

import java.util.Scanner;

public class CompareStrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first String: ");
        String str1 = sc.nextLine();

        System.out.print("Enter second String: ");
        String str2 = sc.nextLine();

        boolean isEqual = true;

        if (str1.length() != str2.length()) {
            isEqual = false;
        } else {
            for (int i = 0; i < str1.length(); i++) {
                if (str1.charAt(i) != str2.charAt(i)) {
                    isEqual = false;
                    break;
                }
            }
        }

        if (isEqual)
            System.out.println("Strings are equal");
        else
            System.out.println("Strings are not equal");
    }
}
