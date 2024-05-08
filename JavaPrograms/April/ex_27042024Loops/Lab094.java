package ex_27042024Loops;

import java.util.Scanner;

public class Lab094 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Program is to calculate type of integer positive negative or Zero
		Scanner sc= new Scanner(System.in);
	    System.out.println("Enter a Number Here -->>");
	    int i = sc.nextInt();
	    
	    if (i>0)
	    {
	    	System.out.printf("This number is Positive number -->> %d", i);
	    }
	    else  if (i<0)
	    {
	    	System.out.printf("This number is Nagetive number -->> %d ", i);
	    }
	    else
	    {
	    	System.out.printf("This number is Zero -->> %d", i);
	    }
	    sc.close();

	}
	

}
