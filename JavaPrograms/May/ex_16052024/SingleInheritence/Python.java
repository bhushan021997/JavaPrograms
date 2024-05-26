package ex_16052024.SingleInheritence;

public class Python extends Java {
	String details;
	Python()
	{
		System.out.println("Paython DC");
	}
	
	Python(String details)
	{
		this.details=details;
	}
	
	void printInfo() {
        System.out.println("Detail is -> " + this.details);
        

    }


}
