package ex_18052024.encapsulation;

public class ICICI {
	private String name;
	private int bal;
	
	ICICI (String name, int bal)
	{
		this.name=name;
		this.bal=bal;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getBal() {
		return bal;
	}

	public void setBal(int bal) {
		if(bal>0) {
			this.bal=bal;
		}
		else
		{
			System.out.println("Not allowed!!");
		}
	}

	
	

}
