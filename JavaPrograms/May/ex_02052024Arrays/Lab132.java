package ex_02052024Arrays;

import java.util.Scanner;

public class Lab132 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		float f[] = new float[5];
		
		System.out.println("Enter First Subject Marks Here-->>");
		f[0] = sc.nextFloat();
		System.out.println(f[0]);
		
		System.out.println("Enter Second Subject Marks Here-->>");
		f[1] = sc.nextFloat();
		System.out.println(f[1]);
		
		System.out.println("Enter Third Subject Marks Here-->>");
		f[2] = sc.nextFloat();
		System.out.println(f[2]);
		
		System.out.println("Enter Fourth Subject Marks Here-->>");
		f[3] = sc.nextFloat();
		System.out.println(f[3]);
		
		System.out.println("Enter Fifth Subject Marks Here-->>");
		f[4] = sc.nextFloat();
		System.out.println(f[4]);
		
	     for (int i=0; i<f.length; i++)
	     {
	    	 if (f[i]<30)
	    	 {
	    		 System.out.println("Failed in the the subject"+f[i]);
	    	 }
	    	 System.out.println(f[i]);
	    	 
	     }
	     sc.close();
	     
	     int j = 0;
	        while (j< f.length){
	            System.out.println(f[j]);
	            j++;
	        }
		

	}

}
