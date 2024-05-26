package ex_18052024.encapsulation;

public class Lab192 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		vwoLogin2 v1=new vwoLogin2("admin123","admin");
		String un=v1.getPassword(true);
		System.out.println(un);
		v1.setPassword("admin1", true);
		String un1=v1.getPassword(true);
		System.out.println(un1);
		String p=v1.getUsername();
		System.out.println(p);
	}

}

class vwoLogin2{
	private String username;
	private String password;
	
	vwoLogin2(String username, String password)
	{
		this.username=username;
		this.password=password;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword(boolean isAuth) {
		if (isAuth){
		return password;
		}
		else {
			return "not Allowed";
		}
	}

	public void setPassword(String password, boolean isAuth) {
		if (isAuth) {
		this.password = password;
		}
		else {
			System.out.println("Not Allowed");
	}
	
	
	
	

	}}
