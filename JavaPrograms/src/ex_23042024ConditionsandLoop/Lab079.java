package ex_23042024ConditionsandLoop;

import java.util.Scanner;

public class Lab079 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//✅ Triangle Classifier:
        //
        //   Write a program that classifies a triangle based on its side lengths.
        //   Given three input values representing the lengths of the sides, determine

        //   if the triangle is equilateral (all sides are equal),
        //   isosceles (exactly two sides are equal), or
        //   scalene (no sides are equal).
        //   Use an if-else statement to classify the triangle.

        // side1, side2, side3 ->
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the Side1, Side2 and Side3 here, We will tell you about the Triangle it is");
		int side1 = sc.nextInt();
		int side2 = sc.nextInt();
		int side3= sc.nextInt();
		
		if ((side1 == side2) && (side1 == side3) && (side2==side3))
		{
			System.out.println("This is the Equivalent Triangle");
		}
		else if ((side1 == side2) || (side1 == side3) || (side2==side3))
		{
			System.out.println("This is the isoceles Triangle");
		}
		else
		{
			System.out.println("This is the scelence Triangle");
		}


	}

}
