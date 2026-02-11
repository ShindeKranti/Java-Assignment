package Assignment10;

import java.util.Scanner;

public class RightRotate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size: ");
        int n = sc.nextInt();

        int arr[] = new int[n];

        System.out.println("Enter elements:");
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter positions to rotate right: ");
        int d = sc.nextInt();

        for(int i = 0; i < d; i++) {
            int last = arr[n-1];
            for(int j = n-1; j > 0; j--) {
                arr[j] = arr[j-1];
            }
            arr[0] = last;
        }

        System.out.println("After Right Rotation:");
        for(int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
