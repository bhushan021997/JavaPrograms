package ex_23042024ConditionsandLoop;

import java.util.Scanner;

public class Lab075 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a First Number");
		int num1=sc.nextInt();
		
		System.out.println("Enter a First Number");
		int num2=sc.nextInt();
		//int maximumnumber = Math.max(num1, num2);
		
	   // System.out.println("Max muber is -->" + maximumnumber);
	    
	    if (num1>num2)
	    {
	    	System.out.println("maximum Number is -->>" + num1);
	    	
	    }
		
	    else 
	    {
	    	System.out.println("Maximu number is -->>" + num2);
	    }

	}

}
