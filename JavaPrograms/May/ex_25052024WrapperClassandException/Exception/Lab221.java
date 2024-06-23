package ex_25052024WrapperClassandException.Exception;

public class Lab221 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 0;
        try {
            a = Integer.parseInt(args[0]);
        } catch (ArrayIndexOutOfBoundsException exception) {
            exception.printStackTrace();
        }

        try {
            int b = 10 / a;
        } catch (ArithmeticException exception) {
            exception.printStackTrace();
        }


        try {
            String ip = args[0];
        } catch (ArrayIndexOutOfBoundsException exception) {
            exception.printStackTrace();
        }

	}

}
