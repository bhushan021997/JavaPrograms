package ex_04052024MultiDimensionArray;

public class Lab139 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		int age[][]= {
				{10,20,30},
				{50,60,37}
		};
		int row=age.length;
		System.out.println(row);
		
		for (int i=0; i<row;i++)
		{
			for (int j=0; j<age[i].length; j++)
			{
				System.out.println(age[i][j]);
			}
		}
	}

}
	
