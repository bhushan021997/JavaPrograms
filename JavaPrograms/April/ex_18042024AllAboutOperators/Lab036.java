package ex_18042024AllAboutOperators;

public class Lab036 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//  And  && // only true && true returns true
        // T || T -> T
        // T || F -> F
        // F || T -> F
        // F || F -> F

        System.out.println(true && true); //True
        System.out.println(true && false); //False
        System.out.println(false && true); // False
        System.out.println(false && false); //False

	}

}
