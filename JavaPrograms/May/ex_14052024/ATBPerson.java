package ex_14052024;

public class ATBPerson {
	 // Variables
	String name; // Instance Variables
    long phone;
    String email;
	String courseName;
	boolean isMarried;
    
    //Default constructor
    // DC
    // Special Method with no return type
    // 1 called, when you create new Object
    // It has same name as the className
   public ATBPerson()
   {
	   System.out.println("Default Constructor");
   }
   
   //Parameterized Constructor
   public ATBPerson(String name, long phone){
       this.name = name;
       this.phone = phone;
   }
   
   //Parameterized Cosntructor
   public ATBPerson(String name, long phone, String email, boolean isMarried, String courseName) {
       this.name = name;
       this.phone = phone;
       this.email = email;
       this.isMarried = isMarried;
       this.courseName = courseName;
       
       
   }
   void printInfo()
   {
	   System.out.println(this.name);
		System.out.println(this.phone);
		System.out.println(this.email);
		System.out.println(this.isMarried);
		System.out.println(this.courseName);
   }
   void printInfo1()
   {
	   System.out.println(this.name);
		System.out.println(this.phone);
		
   }
}





    



