package ex_07052024Functions;

import java.util.Scanner;

public class Lab154 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter A First Number Here");
		int number1=sc.nextInt();
		
		System.out.println("Enter A Second Number Here");
		int number2=sc.nextInt();
		
		int sum1 = sum1(number1,number2);
		System.out.println(sum1);
		
		
		int sub1 = sub1(number1,number2);
		System.out.println(sub1);
		
		
		int mul1 = mul1(number1,number2);
		System.out.println(mul1);
		
		
		int div1 = div1(number1,number2);
		System.out.println(div1);
		
		
		
		

	}

	static int sum1(int number1, int number2) {
		// TODO Auto-generated method stub
		return number1+number2;
	}

	 static int sub1(int number1, int number2) {
		// TODO Auto-generated method stub
		return number1-number2;
	}

	static int mul1(int number1, int number2) {
		// TODO Auto-generated method stub
		return number1*number2;
	}

	 static int div1(int number1, int number2) {
		// TODO Auto-generated method stub
		return number1/number2;
	}

}
