package ex_25042024SwitchCase;

import java.util.Scanner;

public class Lab080 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 // If Else - Condition  ( If, else If , else) - multiple condition
        // switch - multiple condition

        // Which day it is?
        //  1 ->  mon, sunday -> 7 , 4 -> Thurs
        // 1,2,3,4,5,6,7 -> MTWTFSS

        // Create a simple program - user will enter a number, we will tell user which day it is.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number 1-7, I will tell you day it is!");
        int day = scanner.nextInt();
        
        switch (day)
        {
        case 1:
        	System.out.println("Monday");
        	break;
        case 2:
        	System.out.println("Tueseday");
        	break;
        case 3:
        	System.out.println("Wensday");
        	break;
        case 4:
        	System.out.println("Thrusday");
        	break;
        case 5:
        	System.out.println("Friday");
        	break;
        case 6:
        	System.out.println("Saturday");
        	break;
        case 7:
        	System.out.println("Sunday");
        	break;
        	default:
        		System.out.println("No from 1-7 only allowed");
        
        }
        System.out.println(" -- End of the program, I will be executed anyhow!! --");


	}

}
