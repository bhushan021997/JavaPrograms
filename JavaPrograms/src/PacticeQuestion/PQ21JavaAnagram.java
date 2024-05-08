package PacticeQuestion;

import java.util.Arrays;

public class PQ21JavaAnagram {

	public static void main(String[] args) {
		String str1 = "listen";
        String str2 = "silent";
        
        char[] charArray1 = str1.toCharArray();
        char[] charArray2 = str2.toCharArray();
		
        Arrays.sort(charArray1);
        System.out.println(charArray1);
        Arrays.sort(charArray2);
        System.out.println(charArray2);
        
       if (Arrays.equals(charArray1, charArray2))
       {
    	   System.out.println(true);
       }
       else
       {
    	   System.out.println(false);
       }
	}

}
