package ex_25052024WrapperClassandException;

public class Lab212 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ATB a=new ATB();
		a.setName("Amol");
		System.out.println(a.getName());
		System.out.println(a.getRollNo());
		System.out.println(a.getPhoneNumber());
		
		ATB a1=new ATB(1234, "Mahesh", 8358842231l);
		System.out.println(a1.getName());
		System.out.println(a1.getRollNo());
		System.out.println(a1.getPhoneNumber());

	}

}

class ATB{
	
	private Integer rollNo;
	private String name;
    private Long phoneNumber;
    
	public ATB(Integer rollNo, String name, Long phoneNumber) {
		super();
		this.rollNo = rollNo;
		this.name = name;
		this.phoneNumber = phoneNumber;
	}
	
    public ATB() {
		// TODO Auto-generated constructor stub
	}

	public Integer getRollNo() {
		return rollNo;
	}

	public void setRollNo(Integer rollNo) {
		this.rollNo = rollNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Long getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(Long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	
	
}
