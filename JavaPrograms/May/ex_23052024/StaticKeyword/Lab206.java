package ex_23052024.StaticKeyword;

import ex_23052024.StaticKeyword.Car.Engine;

public class Lab206 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car c=new Car("Lambo");
		c.drive();
		
		Car.Engine E1=c.new Engine("500");
		E1.start();
		
		

	}

}

class Car {
    String make;

    public Car(String make) {
        this.make = make;
    }

    // Method
    void drive() {
        System.out.println("You can driver Car");
    }

    class Engine {
        // Instance Variables
        String hoursePower;

        public Engine(String hoursePower) {
            this.hoursePower = hoursePower;
        }

        // Method
        void start() {
            System.out.println("Engine is started!! -> " + make);
        }
    }
}
