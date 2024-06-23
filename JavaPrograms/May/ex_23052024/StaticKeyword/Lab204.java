package ex_23052024.StaticKeyword;

public class Lab204 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A a = new A();
        A b = new A();
        //System.out.println(A.age);// non-static variable age cannot be referenced from a static context
        System.out.println(A.common);
        System.out.println(a.common);
        System.out.println(b.common);
        A.m1();
        a.m1();
        b.m1();


        //A.m2();
        a.m2();
        b.m2();

       // A c= null; // new A(); //Static block will be loaded when calss is loaded but in this case A is referring to the null value
        A.m1();
        //c.m2(); //Instance can't access.


	}

}

class A {
    int age = 10;
    static String common = "ABC";
    static {
        System.out.println("SIB-A");
    }
    {
        System.out.println("IIB");
    }

    static void m1(){
        System.out.println("m1");
    }
    void m2(){
        System.out.println("m2");
    }
}