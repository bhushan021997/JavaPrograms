package ex_18052024.superthiskeyword;

public class Lab185 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub\
//		Dog d1 = new Dog();
//		d1.display();

        Dog d2 = new Dog("Lab");
        d2.display();
//
//
        Dog d3 = new Dog("Golden Retriever","DOG TT");
        d3.display();
        // Constructor chaining ->  Child DC -> Parent's DC

	}

}

	class Dog extends Animal{
	    String breed;
	    int a;
	    Dog(){
	        super();
	        System.out.println("Dog DC");
	    }

	    Dog(String breed) {
	        this.breed = breed;
	    }

	    Dog(String breed, String type) {
	        this.breed=breed;
	        this.type = type;
	        System.out.println("PC with Two Arg.");
	    }

	    Dog(String breed, String type, int a) {
	        this("Breed Set by Dog Only","Golder R");
	        this.a = a;
	        System.out.println("PC with Three Arg.");
	    }

	    void display() {
	        System.out.println("Type: " + type + ", Breed: " + breed);
	    }
	}




class Animal{
	String type;
	
	Animal()
	{
		System.out.println("This is DC");
	}
	
	Animal(String type)
	{
		this.type=type;
		System.out.println("This is a PC");
		
	}
}
