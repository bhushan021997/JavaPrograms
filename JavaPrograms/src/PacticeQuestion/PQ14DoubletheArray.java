package PacticeQuestion;

public class PQ14DoubletheArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Create a Program to double an array and store it also. {1,2,3} -> {2,4,6}
		
		int marks[]= {10,20,30};
		int marks2[]=marks;
		int marks1[]=new int[3];
	    for (int i=0; i<marks.length;i++)
	    {
	    	marks1[i]=marks[i]*2;
	    	//System.out.println(marks[i]*2);
	    }
	    
	    System.out.println("Printing the Arrays");
	    for (int i=0; i<marks1.length;i++)
	    {
	    	System.out.println(marks1[i]);
	    }
	    
	    System.out.println(marks==marks2);


	}

}
