package ex_18042024AllAboutOperators;

public class Lab037 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int a = 12;
       boolean b= !(a>10 || a<5);
       System.out.println(b);
       
       boolean b1=!(true || false);
      // System.out.println(b1);
       b1=!(true);
       System.out.println(b1);
	}

}
