package ex_02052024Arrays;

public class Lab127 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr1 = {1,2,3,4,5};
        int[] arr2 = {1,2,3,4,5};

        System.out.println(arr1);
        System.out.println(arr2);
        System.out.println(arr1==arr2);

        int[] arr3 = arr1;
        System.out.println(arr2==arr3);

        System.out.println(arr1.equals(arr2)); //Objects.Java - ref.


        String s1 = "Pramod";
        String s2 = "Pramod";
        System.out.println(s1.equals(s2)); // Content - Strings.java - content



	}

}
