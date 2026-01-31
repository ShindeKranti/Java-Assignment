package Assinment1;

import java.util.Scanner;

public class LargestNumber {

	public static void main(String[] args) {
		
		System.out.println("Enter a Three Numbers :");
		
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		b = a>b ? a:b;
		b = c>b ? c:b;
		
		System.out.println("Largest number is :" +b);

	}

}
