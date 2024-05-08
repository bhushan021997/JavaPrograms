package PacticeQuestion;

public class PQ15MaxSalary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Find the max salary in the input arrays {30,50,60,90,10, 100,999}
		// How do we find the Max Sal in the array?
        // Loop -> Logic -> max = 0, for i - 0 to length
        // salaries[i] > max -> max ... 0 to l - max

		int salaries[]= {30,50,60,90,10, 100,999};
		int min_salary=Integer.MIN_VALUE;
		
		for (int i=0; i<salaries.length; i++)
		{
			
			if(salaries[i]>min_salary)
			{
				min_salary=salaries[i];
				
			}
			//System.out.println(min_salary);
			
		}
		System.out.println(min_salary);
		
		


	}

}
