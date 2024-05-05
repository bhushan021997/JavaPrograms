package PacticeQuestion;

import java.util.Scanner;

public class PQ9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc=new Scanner (System.in);
        int year=sc.nextInt();
        
        if ((year%4==0 && year%100 !=0 ) || ( year%400 == 0 ))
        {
        	System.out.printf("This year is a leap year", year);
        }
        else
        {
        	System.out.printf("This year is not a leap year", year);
        }
        
	}

}
