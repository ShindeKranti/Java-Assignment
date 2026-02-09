package Assignment6;

import java.util.Scanner;

public class CharFrequency {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a string:");
        String str = sc.nextLine();

        str = str.toLowerCase();   
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);


            if (ch == ' ') {
                continue;
            }

            int count = 1;

            for (int j = i + 1; j < str.length(); j++) {
                if (ch == str.charAt(j)) {
                    count++;
                }
            }

         
            boolean alreadyPrinted = false;
            for (int k = 0; k < i; k++) {
                if (str.charAt(k) == ch) {
                    alreadyPrinted = true;
                    break;
                }
            }

            if (!alreadyPrinted) {
                System.out.println(ch + " : " + count);
            }
        }

        sc.close();
    }
}
