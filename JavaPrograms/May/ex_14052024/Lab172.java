package ex_14052024;

public class Lab172 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankAccount bankDetails=new BankAccount();
		bankDetails.printDetails();
		
		System.out.println("Printing HDFC Bank Details");
		BankAccount bankDetails1=new BankAccount("HDFC",123456,"HDFC1",30000);
		bankDetails1.printDetails1();
		
		System.out.println("Printing ICICI Bank Details");
		BankAccount bankDetails2=new BankAccount("ICICI","ICICI1");
		bankDetails2.printDetails2();

	}

}
