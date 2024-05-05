package PacticeQuestion;

import java.util.Scanner;

public class PQ6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Program to Find the Largest Among Three Numbers:
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a First Number"); 
        int number1=sc.nextInt();
        
        System.out.println("Enter a Second Number"); 
        int number2=sc.nextInt();
        
        System.out.println("Enter a Third Number"); 
        int number3=sc.nextInt();
        
        if (number1>number2 && number1>number3)
        {
        	System.out.printf("Maximum number is %d", number1);
        }
        else if (number2>number1 && number2>number3)
        {
        	System.out.printf("Maximum number is %d", number2);
        }
        else
        {
        	System.out.printf("Maximum number is %d", number3);
        }
        sc.close();
	}

}
