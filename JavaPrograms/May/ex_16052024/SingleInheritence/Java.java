package ex_16052024.SingleInheritence;

public class Java extends Programming{
	
	// Single Inherintance -. is A
    // Java is a programming Lang.
    // Python is a programming Lang.

    String newFeature;
    int version;
    String author;
    
    Java()
    {
    	System.out.println("Java DC1");
    }
    
    Java(String newFeature)
    {
    	this.newFeature=newFeature;
    }
    
    void printInfo() {
        System.out.println("Feature is -> " + this.newFeature);
        

    }



	

}
