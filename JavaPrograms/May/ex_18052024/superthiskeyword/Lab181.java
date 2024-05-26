package ex_18052024.superthiskeyword;

public class Lab181 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//This is an example of where we have used super keyword with the data type or instance variable
		
	
		
		Car c=new Car();
		c.display();

	

	
	}
}
class Car extends Vehicle{
    private int maxSpeed =  180;
    void display(){
        System.out.println("Max speed of Vehicle can be -> " + super.maxSpeed);
        System.out.println("Max speed of car can be -> " + this.maxSpeed);
    }



}

class Vehicle{
    int maxSpeed = 100; // Instance variable

    void message(){
        System.out.println("This is Vehicle Class");
    }
}

