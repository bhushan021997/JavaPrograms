package ex_21052024Abstraction;

abstract class Car {
	Car(){
		
	}
	
	void gearbox() {
		System.out.println("Gearbox is working");
	}
	
	abstract void drive();
}