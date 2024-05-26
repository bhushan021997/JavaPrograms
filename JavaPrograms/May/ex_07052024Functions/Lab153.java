package ex_07052024Functions;

public class Lab153 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 // Non Return with no parameter
        saySomethingPlease();
        // Non return with parameter
        sayHelloToYou("pramod");

        // Return with no parameter
        sumOfTwoGood(3, 4);
        // Return with parameter
        int result = sumOfTwoBad(5, 4);
        System.out.println(result);

	}

	static int sumOfTwoBad(int i, int j) {
		// TODO Auto-generated method stub
		return i+j;
	}

	static void sumOfTwoGood(int i, int j) {
		// TODO Auto-generated method stub
		System.out.println(i+j);
		
	}

	static void sayHelloToYou(String string) {
		// TODO Auto-generated method stub
		System.out.println(string);
		
	}

	static void saySomethingPlease() {
		// TODO Auto-generated method stub
		System.out.println("Hello");
		
		
	}

}
