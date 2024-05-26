package PacticeQuestion;

public class Lab22PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    // 1. Natural Number > 1
		//2. Number which has only two factor 1 and itself
		
		int num=100;
		
		int count=0;
		
		if (num>1)
		{
			for (int i=1; i<num;i++)
			{
				if(num%i==0)
				
					count++;
		}
			if (count==2)
			{
				System.out.println("This is a Prime Number");
			}
			else
			{
				System.out.println("Not Prime Number");
			}
			
			
		}
		else 
		{
			System.out.println("This is not a Prime Number");
		}
	
          
	}
	
	
}
