package ex_25052024WrapperClassandException;

public class Lab218 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 //Exceptions
		
		try {
      String s1 = null;
      s1.trim();
		} catch (Exception e) {
			System.out.println(e.getMessage());
			System.out.println("The reson for the above you need to proivde atlease some vlaues to the String");;
		}

      
	}

}
