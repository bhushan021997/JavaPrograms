package ex_25052024WrapperClassandException;

public class Lab211 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x=10;
		//String s=x;
		//String s1=(String)x;
		String s1=String.valueOf(x);
		System.out.println(s1);
		
		Character c='a';
		
		char c1=c;  //Wrapper to Primitive - unboxing - Automatically
		System.out.println(c1);
		
		Boolean b = true;
        Long l = 34l;
        Double d1 = 90.0;
        Float f1 = 90.89f;
        
        // Wrapper class is used to convert primitive data types into objects.
        Integer intobj=Integer.valueOf(10);
        System.out.println(intobj);
        
        // AutoBoxing ( Primitve -> Wrapper ( Automatically)
        Integer a1=100;
        System.out.println(a1);
        
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);
        System.out.println(Integer.compare(20, 20));
        
        System.out.println(Integer.max(4,5));
        System.out.println(Integer.min(1,34));

        //Integer a11 = new Integer(10); JDK 9 it is removed
        Integer a12 = Integer.valueOf(1000);
        System.out.println(a12);

		

	}

}
