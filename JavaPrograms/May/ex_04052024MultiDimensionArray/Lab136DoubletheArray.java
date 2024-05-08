package ex_04052024MultiDimensionArray;

public class Lab136DoubletheArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int age[]= {10,20,30};
		
		int age1[]=new int[3];
		
		
		for (int i=0; i<age.length; i++)
		{
			age1[i]=age[i]*2;
			System.out.println(age1[i]);
		}
		System.out.println(age1);
	}
	
}
