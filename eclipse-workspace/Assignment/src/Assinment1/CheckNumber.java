package Assinment1;

import java.util.Scanner;

public class CheckNumber {
	public static void main(String args[]) {
		
		System.out.println("Enter a number : ");
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		if(n > 0)
			System.out.println("Number is Positive");
		else if(n < 0)
			System.out.println("Number is negative");
		else
			System.out.println("Zero");
	}
}
