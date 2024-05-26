package ex_07052024Functions;

public class Lab155 {

	
		// TODO Auto-generated method stub
		static void giveMoneyBeg() 
		{
	        System.out.println("Blessing!!");
		}
	
	    

	    static int giveMoneyFriend(int i) 
	    {
	        //After  6 months
	        i = i + 8;
	        return i;
	    }
	
	

	    public static void main(String[] args) {
	        // 1 Friend - money
	        // 1 Beg - money

	        System.out.println("Start of the Program");
	        int money = giveMoneyFriend(100);
	        System.out.println(money);


	        giveMoneyBeg();
	        System.out.println("End of the program");

	    

	}
}


