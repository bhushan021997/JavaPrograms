package ex_14052024;

public class BankAccount {
	String bankName;
	int accountNumber;
	String bankCode;
	int balance;
	
	BankAccount()
	{
		bankName="SBI";
		accountNumber=12345678;
		bankCode="123Bank";
	}
	 BankAccount(String bankName,int balance, String bankCode, int accountNumber) {
	        this.bankName = bankName;
	        this.balance = balance;
	        this.bankCode = bankCode;
	        this.accountNumber=accountNumber;
	    }

	    BankAccount(String bankName, String bankCode) {
	        this.bankName = bankName;
	        this.bankCode = bankCode;
	    }
	
	 void printDetails() {
	        System.out.println("Bank Name -> " + bankName);
	        System.out.println("Bank Code -> " + bankCode);
	        System.out.println("Bal ->" + accountNumber);
	    }
	 void printDetails1() {
	        System.out.println("Bank Name -> " +this.bankName);
	        System.out.println("Bank Code -> " + this.bankCode);
	        System.out.println("Bal ->" + this.balance);
	        System.out.println("Bal ->" + this.accountNumber);
	    }
	 void printDetails2() {
	        System.out.println("Bank Name -> " +this.bankName);
	        System.out.println("Bank Code -> " + this.bankCode);
	        
	    }
	
}
