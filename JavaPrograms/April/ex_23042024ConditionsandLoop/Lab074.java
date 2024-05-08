package ex_23042024ConditionsandLoop;

import java.util.Scanner;

public class Lab074 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Taking an input from the user.
        // Scanner Class -
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Number");
        int num = sc.nextInt();
        if(num%2 == 0){
            System.out.println("Even");
        }else{
            System.out.println("Odd");
        }

        sc.close();


	}

}
