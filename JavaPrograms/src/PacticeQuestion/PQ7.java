package PacticeQuestion;

import java.util.Scanner;

public class PQ7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc = new Scanner(System.in);
	        System.out.println("Enter a word and we will let you know if it is a vowel or not:");
	        char char1 = sc.nextLine().charAt(0);

	        if (char1 == 'a' || char1 == 'e' || char1 == 'i' || char1 == 'o' || char1 == 'u' || char1 == 'A' || char1 == 'E' || char1 == 'I' || char1 == 'O' || char1 == 'U') {
	            System.out.printf("%c is a vowel.\n", char1);
	        } else 
	        {
	            System.out.printf("%c is a consonant.\n", char1);
	        }
	
	}

}
