package Assignment6;
import java.util.Scanner;

public class FirstNonRepeated {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a string:");
        String str = sc.nextLine();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            int count = 0;


            for (int j = 0; j < str.length(); j++) {
                if (ch == str.charAt(j)) {
                    count++;
                }
            }


            if (count == 1) {
                System.out.println("First non-repeated character: " + ch);
                return;
            }
        }

        System.out.println("No non-repeated character found");
        sc.close();
    }
}
