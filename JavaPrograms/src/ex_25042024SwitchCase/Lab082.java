package ex_25042024SwitchCase;

import java.util.Scanner;

public class Lab082 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Take a user input as char and Tell the user if it is a vowel
        // aeiou

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a char, I will tell you, If it is a vowel or not!");
        // A -> "A" -> index - A
        char user_input = sc.next().toLowerCase().charAt(0);
        
        System.out.println(user_input);
        
        switch (user_input)
        {
        case 'a':
        	System.out.println("Vowel");
        	break;
        case 'e':
        	System.out.println("Vowel");
        	break;
        case 'i':
        	System.out.println("Vowel");
        	break;
        case 'o':
        	System.out.println("Vowel");
        	break;
        case 'u':
        	System.out.println("Vowel");
        	break;
     default :
        	System.out.println("Consonent");
        	break;
        	
        }

	}

}
