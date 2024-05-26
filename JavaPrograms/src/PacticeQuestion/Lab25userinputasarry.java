package PacticeQuestion;

import java.util.Scanner;

public class Lab25userinputasarry {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner (System.in);
		int ig[]=new int[3];
		
		ig[0]=sc.nextInt();
		ig[1]=sc.nextInt();
		ig[2]=sc.nextInt();
		
		for (int i=0; i<ig.length;i++)
		{
			System.out.println(ig[i]);
		}
		
		
		

	}

}
