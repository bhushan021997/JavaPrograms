package ex_07052024Functions;

public class Lab151 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int r1=sumofTwo(10, 11);
		System.out.println(r1);
		
		int r2=sumofTwo(10, 12);
		System.out.println(r2);
		
		String r3=sumOfTwo("Pramod", 13);
		System.out.println(r3);

	}

	static int sumofTwo(int a, int b) {
		// TODO Auto-generated method stub
		return a+b;
	}
	
	static String sumOfTwo(String a, int b) {
        return a + b;
    }

}
