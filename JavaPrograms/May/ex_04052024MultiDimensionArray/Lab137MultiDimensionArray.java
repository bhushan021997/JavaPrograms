package ex_04052024MultiDimensionArray;

public class Lab137MultiDimensionArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] array_1d = {450, 50, 321};

        // 2D - arrays
        // Matrix - Row and Columns

        // rows -> Horizontal
        // Column - Vertical


        int[][] array_2d_2 = new int[3][3];
        // |0,0,0|
        // |0,0,0|
        // |0,0,0|
        array_2d_2[0][0] = 34;
        // |34,0,0|
        // |0,0,0|
        // |0,0,0|
        array_2d_2[0][1] = 12;
        // |34,12,0|
        // |0,0,0|
        // |0,0,0|


        int[][] array_2d = {
                {34, 12, 11},
                {34, 12, 34},
                {11, 23, 98}
        };

        for (int i = 0; i < array_2d.length; i++) { // Row
            for (int j = 0; j < array_2d[i].length; j++) { // Column
                System.out.println(array_2d[i][j]);
            }
        }
        // i = 0, j ->  0,1,2
        // i = 1 , j -> 0, 1,2
        // i = 2 , j -> 0, 1,2

		
		int age[][]=new int[3][3];
		
		age[0][0]= 30;
		age[0][1]=34;
		age[0][2]=35;
		age[1][0]= 40;
		age[1][1]=44;
		age[1][2]=45;
		age[2][0]= 50;
		age[2][1]=54;
		age[2][2]=55;
		
		for (int i=0; i<age.length; i++)
		{
			for(int j=0; j<age.length; j++)
			{
				System.out.println(age[i][j]);
			}
		}
}
}
