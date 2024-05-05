package ex_25042024SwitchCase;

import java.util.Scanner;

public class Lab092 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner sc= new Scanner(System.in);
      System.out.println("Enter your marks here");
      int marks = sc.nextInt();
      int marks1 = marks/10;
      
      switch (marks1)
      {
      case 9:
    	  System.out.println("Your grade is --> A");
    	  break;
      case 8:
    	  System.out.println("Your grade is --> B");
    	  break;
      case 7:
    	  System.out.println("Your grade is --> C");
    	  break;
      case 6:
    	  System.out.println("Your grade is --> E");
    	  break;
      default :
    	  System.out.println("Your grade is --> F");
    	  break;
    	  
    	  
    	  
      }
      sc.close();
	}

}
