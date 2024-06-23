package ex_25052024WrapperClassandException.Exception;

public class Bankl227 {
	private String Currency;
	private Integer amount;
	
	public  Bankl227(String Currency, Integer Amount) {
		this.Currency=Currency;
		this.amount=amount;
	
	}
	
	public String getCurrency() {
		return Currency;
	}
	
	public void setCurrency() {
		this.Currency=Currency;
	}
	
	public Integer add(Bankl227 bankName) throws Exception {
        if (!bankName.Currency.equalsIgnoreCase("INR")) {
            throw new Exception("Currency Doesn't Match");
        }
        Integer sum = this.amount + bankName.amount;
        return sum;
    }

//    public Integer add1(Bankl227 bankName1) {
//        try {
//            if (!bankName1.Currency.equalsIgnoreCase("INR")) {
//                throw new Exception("Currency Doesn't Match");
//            }
//        } catch (Exception e) {
//            throw new RuntimeException(e);
//        }
//        Integer sum = this.amount + bankName1.amount;
//        return sum;
//    }

}
