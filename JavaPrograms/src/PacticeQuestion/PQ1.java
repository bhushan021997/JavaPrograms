package PacticeQuestion;

public class PQ1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Max between 3 Numbers with ? operators.
		int num1= 200;
		int num2= 560;
		int num3= 30;
		//  int maxNum = (num1 > num2) ? ((num1 > num3) ? num1 : num3) : ((num2 > num3) ? num2 : num3);

		int max= (num1>num2)?((num1>num3)? num1 : num3): ((num2>num3)? num2:num3);
		
		
		System.out.println(max);

	}

}
