package ex_18052024.ploymorphism.methodoverloading;

public class Lab189 {
	public static void main(String[] args) {
		Lab189 a=new Lab189();
//		a.gift("Pramod");
//		a.gift(0);
//		a.gift(0);
//		a.gift(0);
		a.gift(10, "Pramod");
		
	}
	
	//Method Overloading
	void gift(String a)
	{
		System.out.println("Name is-->>"+a);
	}
	
	void gift(int x)
	{
		System.out.println("Int Number is-->>"+x);
	}
	
	void gift(float x)
	{
		System.out.println("Float Number is-->>"+x);
	}
	
	void gift(double x)
	{
		System.out.println("double Number is-->>"+x);
	}
	
	int gift(int y,String a)
	{
		System.out.println("Int Number is-->>" +y+ "your name is-->>"+a);
		
		return y;
	}
	
	

}
