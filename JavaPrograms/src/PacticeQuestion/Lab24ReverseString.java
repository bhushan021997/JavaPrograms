package PacticeQuestion;

public class Lab24ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String Name="Bhushan";
		String reverseName="";
		
		//char ch;
		
		for (int i=0; i<Name.length();i++)
		{
			char ch=Name.charAt(i);
			
			reverseName=ch+reverseName;
			
		}
		System.out.println(reverseName);
	}

}
