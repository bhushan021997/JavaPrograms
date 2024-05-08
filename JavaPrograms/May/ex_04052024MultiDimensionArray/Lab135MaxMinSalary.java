package ex_04052024MultiDimensionArray;

public class Lab135MaxMinSalary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Arrays
        // Collection of similar Data Type.

        // Find the Max in the Arrays
        int[] salaries = {30, 50, 60, 90, 10, 100, 999, -1, -2};
        // How do we find the Max Sal in the array?
        // Loop -> Logic -> max = 0, for i - 0 to length
        // salaries[i] > max -> max ... 0 to l - max
        int min_salary=Integer.MIN_VALUE;
        
        for (int i=1; i<salaries.length;i++)
        {
        	if(salaries[i]>min_salary)
        	{
        		min_salary=salaries[i];
        	}
        
        }
        System.out.println(min_salary);

	}

}
