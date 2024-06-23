package ex_21052024Abstraction.CarEx;

abstract class Car extends Engine {

	@Override
	void partGearBox() {
		// TODO Auto-generated method stub
		System.out.println("Assembling the Gear Box");
		
	}

	@Override
	void startEngine() {
		// TODO Auto-generated method stub
		System.out.println("Starting the Engine");
		
	}

	@Override
	void stopEngine() {
		// TODO Auto-generated method stub
		System.out.println("Stoping the Engine");
		
	}

	@Override
	void openCar() {
		// TODO Auto-generated method stub
		System.out.println("Opening the Car");
	}
	
	abstract void brakeMech();

}
