package PacticeQuestion;

import java.util.Scanner;

public class PQ10PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter a number here ");
		int num1 = sc.nextInt();
		
		if (num1/1 == 1 && num1/num1==num1)
		{
			System.out.printf("This number is Prime Number -->> %d", num1);
		}
		else
		{
			System.out.printf("This number is not Prime Number -->> %d", num1);
		}

	}

}
