package ex_20042024AllAboutStrings;

public class Lab064 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String password  = "Pramod@123";
        String pass_u = password.toLowerCase();
        // pass_u == password?
        // pass_u.equals(password) -> No
        // pass_u.equalsIgnoreCase(password) -> Yes
        System.out.println(pass_u == password);
        System.out.println(pass_u.equals(password));
        System.out.println(pass_u.equalsIgnoreCase(password));


        System.out.println(password.substring(0,3));
        System.out.println(password.indexOf("a"));


	}

}
