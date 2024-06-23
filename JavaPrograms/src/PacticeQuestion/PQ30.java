package PacticeQuestion;

public class PQ30 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Integer x = new Integer(40),
				y = new Integer(40);
        if (x == y)
           System.out.println("Same");
        else
           System.out.println("Not Same");
        
        Integer X = new Integer(10);
        Integer Y = 10;
      
        // Due to auto-boxing, a new Wrapper object
        // is created which is pointed by Y
        System.out.println(X == Y);



	}

}
