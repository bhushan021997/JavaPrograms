package PacticeQuestion;

public class PQ17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int array[][]= {
				{1, 2, 3},
				{4, 5, 6},
				{7, 8, 9}};
		
		int minval=11;
		System.out.println(array.length);
		
		for (int i=0; i<array.length; i++)
		{
			for (int j=0; j<array.length;j++)
			{
				//System.out.println(array[i][j]);
				if (array[i][j]==minval)
				{
				
					System.out.println("true");
					
					
				}
				else if (array[i][j]!=minval)
				{
					System.out.println("false");
				}
				
			}
			
		}
		


	
	
	
	
	
	
	}

}
