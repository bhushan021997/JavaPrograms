package ex_11052024ObjectandClasses;

public class Lab164 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Car tesla = new Car();
        tesla.name = "Tesla";
        tesla.model = "Model 3";
        tesla.color="White";
        
        

        System.out.println(tesla.reverse());
        tesla.speedTop();

        Car volvo = new Car();
        volvo.name = "Volvo";
        volvo.model = "XC90";

       volvo.reverse();
       volvo.speedTop();

	}

}
