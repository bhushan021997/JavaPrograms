package ex_18052024.ploymorphism.methodoverriding;

public class Lab190 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		 Dog d = new Dog();
//       d.bark();

//       Hound h = new Hound();
//       h.bark();
//
       Dog d1  = new Hound(); // Dynamic Dispatch, -> Runtime Polymorphism
       d1.bark();

   }

   void main(String a){}
   void main(int  a){}
   void main(byte  a){}


	

}
