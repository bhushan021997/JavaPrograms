package ex_16052024.SingleInheritence;

public class ExplainCode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GrandFather G=new Son();
	    G.home();
	    
	    Father f=new Father();
	    f.home();
	    
	    Son s=new Son();
	    s.home();
	    

	}

}
class Son extends Father{
    void home(){
        System.out.println("3BHK");
    }
}


class Father extends GrandFather{
	
    void home(){
        System.out.println("2BHK");
    }
}


class GrandFather{
    void home(){
        System.out.println("1BHK");
    }
}
