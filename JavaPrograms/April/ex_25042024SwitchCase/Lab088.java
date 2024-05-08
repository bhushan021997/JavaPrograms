package ex_25042024SwitchCase;

public class Lab088 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       char code = 'A' ;
       
      int value = switch (code)
       {
       case 'A':
           yield 65;
       case 'B':
           yield 66;
       default:
           System.out.println("Not able to find");
          throw  new IllegalStateException("Error");
       };
    		   
    		   
	}

}
