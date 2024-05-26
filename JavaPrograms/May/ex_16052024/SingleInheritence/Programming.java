package ex_16052024.SingleInheritence;

public class Programming {
	int version;
	String author;
	
	Programming()
	{
		System.out.println("Programming DC2");
	}
	
	Programming(int version, String author)
	{
		this.version=version;
		this.author=author;
	}
	
	void printinfo()
	{
		System.out.println("Programming Language Version is-->> "+this.version+"Author is -->> "+this.author);
	}
	void bhk3(){
        System.out.println("3BHK");
    }

}
