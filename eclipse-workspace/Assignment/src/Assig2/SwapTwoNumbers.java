package Assig2;

import java.util.Scanner;
public class SwapTwoNumbers{
	public static void main(String[] args){
		int a,b;
		Scanner sc = new Scanner(System.in);		
		System.out.println("Enter a First number :");
		a = sc.nextInt();

		System.out.println("Enetr a Second number :");
		b = sc.nextInt();
		a=a+b;
		b=a-b;
		a=a-b;
		a=a*b;
		b=a/b;
		a=a/b;
	
		System.out.println("Interchanging the value :");
		System.out.println("a:"+a);
		System.out.println("b:"+b);
	}
}

