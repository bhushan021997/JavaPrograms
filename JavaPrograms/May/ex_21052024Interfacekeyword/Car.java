package ex_21052024Interfacekeyword;

public class Car implements Brake,Engine{

	@Override
	public void applyBreak() {
		// TODO Auto-generated method stub
		 System.out.println("Applying Brake");
		
	}

	@Override
	public void startEngine() {
		// TODO Auto-generated method stub
		 System.out.println("Starting Engine");
		
	}

	@Override
	public void stopEngine() {
		// TODO Auto-generated method stub
		 System.out.println("Stopping Engine");
		
	}

}
