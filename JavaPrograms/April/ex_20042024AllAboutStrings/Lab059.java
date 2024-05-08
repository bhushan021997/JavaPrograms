package ex_20042024AllAboutStrings;

public class Lab059 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 String name = "The Testing Academy"; // SCP
	        String name1 = new String ("The Testing Academy"); // SCP
	        String name2 = new String("The Testing Academy"); // Heap area (OA)

	        System.out.println(name == name1); // Check the Ref ?
	        System.out.println(name.equals(name1)); // Check the Values


	        System.out.println(name == name2);
	        System.out.println(name.equals(name2));


	}

}
