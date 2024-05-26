package PacticeQuestion;

public class Lab26PrintDiagonalEle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] array = {
	            {1, 2, 3},
	            {4, 5, 6},
	            {7, 8, 9}
	        };
	        
	        System.out.println("Diagonal elements of the array:");
	        for (int i = 0; i < array.length; i++) {
	            for (int j = 0; j < array[i].length; j++) {
	                if (i == j) {
	                    System.out.print(array[i][j] + " ");
	                }
	            }
	        }

	}

}
