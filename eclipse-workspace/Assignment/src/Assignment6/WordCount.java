package Assignment6;


import java.util.Scanner;

public class WordCount {

	
	    public static void main(String[] args)
	    {
	    	
	        Scanner sc = new Scanner(System.in);

	    	 System.out.println("Enter a sentence:");
	         String sentence = sc.nextLine();

	        int count = 1;
	        for (int i = 0; i < sentence.length(); i++) {
	            if (sentence.charAt(i) == ' ') {
	                count++;
	            }
	        }

	        System.out.println("Number of words: " + count);
	    }
	}