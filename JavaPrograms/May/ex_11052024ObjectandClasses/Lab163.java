package ex_11052024ObjectandClasses;

public class Lab163 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog german=new Dog();
		german.breed="German Shapherd";
		german.ear="Two ears";
		german.legs=2;
		
		System.out.println("Dog breed is -->>"+german.breed+"Dog is having --->>"+german.ear+"dog is having"+german.legs);
		
		german.bark();
		german.eat();
		german.bark();

	}

}
