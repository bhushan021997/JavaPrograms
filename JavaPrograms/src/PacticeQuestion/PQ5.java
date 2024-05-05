package PacticeQuestion;

import java.util.Scanner;

public class PQ5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        //Program to Check if a Number is Positive, Negative, or Zero.
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number to Check --->>");
		int num1 = sc.nextInt();
		
		if (num1>0)
		{
			System.out.printf("This is a Positive number -->> %d", num1);
		}
		else if (num1<0)
		{
			System.out.printf("This is a Negative number -->> %d", num1);
		}
		else
		{
			System.out.printf("This is a Zero -->> %d", num1);
		}
	}

}
