package ex_02052024Arrays;

public class Lab124 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i[] = {10,20,20,30,40};
	   System.out.println(i[0]);
	// Fixed elements

       int[] ages2 = new int[5];
       // Case 2 - Here by default value of all the elements will be?
       System.out.println(ages2[0]);
       System.out.println(ages2[4]);

       ages2[0] = 11;
       System.out.println(ages2[0]);


       String[] breakfast_items = {"milk","idli","fruits","coffee","tea","poha"};
       System.out.println(breakfast_items.length);

	}

}
