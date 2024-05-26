package ex_14052024;

public class Person {
	String name;
    int age;

    // Parameterized constructor
    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    Person(Person person){
        this.name = person.name;
        this.age = person.age;
    }


	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Person person1 = new Person("John", 30);
        Person person2 = new Person(person1);
        Person person3 = new Person(person1);
        Person person4 = new Person(person1);
        System.out.println(person3.name + " is " + person3.age + " years old");


	}

}
