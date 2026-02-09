package Assignment6;


import java.util.Scanner;

public class FindSubstring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter main string:");
        String str = sc.nextLine();

        System.out.println("Enter substring to search:");
        String sub = sc.nextLine();

        boolean found = false;

        for (int i = 0; i <= str.length() - sub.length(); i++) {
            int j;
            for (j = 0; j < sub.length(); j++) {
                if (str.charAt(i + j) != sub.charAt(j)) {
                    break;
                }
            }
            if (j == sub.length()) {
                found = true;
                break;
            }
        }

        if (found) {
            System.out.println("Substring found");
        } else {
            System.out.println("Substring not found");
        }

        sc.close();
    }
}
