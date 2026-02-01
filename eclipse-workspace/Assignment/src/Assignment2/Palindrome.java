package Assignment2;



import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n,temp;
		int rev = 0;
		System.out.println("Enter the number: ");
		n = sc.nextInt();
		temp = n;
		
		while(n>0) {
			int rem = n % 10;
			rev = rev * 10 + rem;
			n = n/10;
		}
		if(rev == temp)
			System.out.println("Palindrome");
		else
			System.out.println("Not Pallindrome");
		
		
		
	

	}

}