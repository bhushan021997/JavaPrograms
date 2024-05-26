package ex_18052024.encapsulation;

public class Lab193 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ICICI i=new ICICI("Bhushan", 10000);
		//System.out.println(i.getBal());
		System.out.println(i.getName());
		i.setBal(-100);
		System.out.println(i.getBal());
		

	}

}
