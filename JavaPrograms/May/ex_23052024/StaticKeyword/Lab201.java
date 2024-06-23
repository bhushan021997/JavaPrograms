package ex_23052024.StaticKeyword;

public class Lab201 {

	public static void main(String[] args) {
		// Static
	    // Data member
	    // Function
	    // Class

		// TODO Auto-generated method stub
//		ATB b=new ATB("9669984343");
//		b.printInfomration();
//		System.out.println("Student Cousrse Name is -->>" +" "+ATB.CourseName);
//		
		
		

	}

}


class ATB{
	
	static String CourseName="ATB";
	String phoneNumber;
	
	{
		System.out.println("IIB - instance initialization block. Loaded when Object is created");
	}
	static {
		System.out.println("Static Block");
	}
	
	ATB(String phoneNumber)
	{
		this.phoneNumber=phoneNumber;
	}
	
	void printInfomration() {
		System.out.println("Display the student Phone Number -->>"+"  "+this.phoneNumber);
	}
}