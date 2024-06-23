package ex_25052024WrapperClassandException.Exception;

public class Lab227 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Bankl227 sbi = new Bankl227("USD",100);
        Bankl227 jpmorgan = new Bankl227("USD",10);
        Integer total = sbi.add(jpmorgan);
        System.out.println(total);
	}

}
