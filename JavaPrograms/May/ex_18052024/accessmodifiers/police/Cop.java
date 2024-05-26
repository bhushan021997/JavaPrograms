package ex_18052024.accessmodifiers.police;

public class Cop {
	 public int gun; // public access by anyone
	    private String idCard; // Private - only available to the cop

	    public Cop(int gun){
	        this.gun = gun; // PC
	    }
	    
	    private void display()
	    {
	    	System.out.println("This is Prive method");
	    }
	    
	    protected void display1()
	    {
	    	System.out.println("This is Protected method");
	    }
	    
	     void display2()
	    {
	    	System.out.println("This is Default method");
	    }
	     
	    public void display3()
		    {
		    	System.out.println("This is public method");
		    }
	     
	     
	    
	    

	    
	    public void canIShoot(){
	        System.out.println("Of-course, Shoot!");
	    }
	    
	    
}

