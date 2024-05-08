package PacticeQuestion;

import java.util.Scanner;

public class PQ12AirthmaticOperation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Take a input from user, input1, input2 as int and ask the user what you want to do, 
		//enter char +,*,/ ,%, - , you will share the result by using the switch.
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter A Input 1");
		int input1=sc.nextInt();
		
		System.out.println("Enter A Input 1");
		int input2=sc.nextInt();
		
		System.out.println("Enter a Operation What you want to perform");
		
	     char ch=sc.next().charAt(0);
	     int result;
	     
	     switch(ch)
	     {
	     case '+':
	    	result=input1+input2;
	    	 System.out.println(result);
	    	 break;
	     case '-':
	    	 result=input1-input2;
	    	 System.out.println(result);
	    	 break;
	     case '*':
	    	 result=input1*input2;
	    	 System.out.println(result);
	    	 break;
	     case '/':
	    	 result=input1/input2;
	    	 System.out.println(result);
	    	 break;
	     case '%':
	    	 result=input1%input2;
	    	 System.out.println(result);
	    	 break;
	    	 
	     default :
	    	 System.out.println("Not Able to Identify the operation");
	     
	
	     
	    	 
	     }
	     
	    	sc.close(); 
	     
		
		
		



	}

}
