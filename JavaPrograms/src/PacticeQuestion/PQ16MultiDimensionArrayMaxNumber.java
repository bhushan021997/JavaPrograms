package PacticeQuestion;

public class PQ16MultiDimensionArrayMaxNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Write - Java method to find the maximum value in a 2D array.
		
		int array[][]= {
				{1, 2, 3},
				{4, 5, 6},
				{7, 8, 9}};
		
		int maxval=Integer.MIN_VALUE;
		System.out.println(array.length);
		
		for (int i=0; i<array.length; i++)
		{
			for (int j=0; j<array.length;j++)
			{
				//System.out.println(array[i][j]);
				if (array[i][j]>maxval)
				{
				
					maxval=array[i][j];
					
					
					
				}
				
			}
			
		}
		System.out.println(maxval);
		


	
	
	
	
	
	
	
	
	
	
	
	}
}