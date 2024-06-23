package ex_23052024.StaticKeyword;

public class Lab205NestedClass {
	public static void main(String[] args) {
		OC o=new OC();
		System.out.println(o.a);
		
	
		
	}

}

//Nested Class

class OC {
 int a = 10;

 class IC {
     void m2() {
         System.out.println("Hi, IC" + a);
     }
 }
}
