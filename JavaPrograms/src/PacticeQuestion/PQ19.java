package PacticeQuestion;

import java.util.Arrays;

public class PQ19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String Name="Bhushan";
		
		String NameReverse=""; 
		char ch;
		
		for (int i=0; i<Name.length();i++)
		{
			ch=Name.charAt(i); //Extracting Each Character
			NameReverse=ch+NameReverse; // Adding each character to the defined string 
		}
		
		System.out.println(NameReverse);
		

	}

}
