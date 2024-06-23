package PacticeQuestion;

public class TowSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = { 2, 11, 7, 15 };
        int target = 9;

        int[] result = TowSum.TwoSum1(nums, target);

        if (result.length > 0) {
            System.out.println("Indices: [" + result[0] + ", " + result[1] + "]");
        } else {
            System.out.println("No two sum solution found.");
        }
		
}
	
	public static int[] TwoSum1(int[] nums, int target)
	{
	    for (int i = 0; i < nums.length; i++)
	    {
	        for (int j = i + 1; j < nums.length; j++)
	        {
	            if (nums[i] + nums[j] == target)
	            {
	                return new int[] { i, j };
	            }
	        }
	    }
	    return new int[0];
	}
}
