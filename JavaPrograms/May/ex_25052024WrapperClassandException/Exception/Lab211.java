package ex_25052024WrapperClassandException.Exception;

public class Lab211 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
            String sh = args[0]; // 1 //5,15 -> String 5 -> java.lang.ArrayIndexOutOfBoundsException
            int x = Integer.parseInt(sh); // 2 ->  java.lang.NumberFormatException prmaod-> int?
            int a = 10 / x; // 3 - java.lang.ArithmeticException

            System.out.println(x);
            System.out.println(a);
        }catch (Exception e){
            System.out.println(e.getMessage());
            System.out.println("Can you please enter Input?");
        }

        //JVM will be Initialized
        //Creates and Starts the main Thread.
        //main Thread will do the following tasks
        //1)Collects the Command Line Arguments
        //2)Creates the String array with CLA
        //3)Calls main method by passing String array as Parameter:
        // Lab211.main(5)
        //Now Control will be transfered from main Thread to main method
        //Control will come back to main thread in two ways.
        //A)When problem comes in main -> JVM
        // Creates the Object of Identified Exception class.
        //Exception a=new Exception()

	}

}
