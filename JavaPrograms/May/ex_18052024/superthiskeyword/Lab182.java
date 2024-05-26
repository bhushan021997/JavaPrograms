package ex_18052024.superthiskeyword;

public class Lab182 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		student s1=new student();
		s1.display();
		

	}

}




class student extends person
{
	void message()
	{
		System.out.println("I am a student");
	}
	
	void display()
	{
		this.message();
		//super.message();
	}
}








class person{
	void message()
	{
		System.out.println("I am a person");
	}
}
