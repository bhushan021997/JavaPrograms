package ex_04052024MultiDimensionArray;

public class Lab143 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "Pramod"; //SCP
        String s2 = new String("Pramod"); // OA

        // String  - Immutable -> Once created can't be changed.


        StringBuffer stringBuffer = new StringBuffer("Pramod");
        stringBuffer.append("Dutta");
        stringBuffer.reverse();
        System.out.println(stringBuffer);
        // PramodDutta

        StringBuilder stringBuilder = new StringBuilder("Pramod");
        stringBuilder.append("Dutta");


        String password = "pass@123";
        password = "123";

        // Mutable - that can be changed!!
        StringBuilder password2 = new StringBuilder("Pramod");
        password2.append(" Dutta");
        System.out.println(password2);

	}

}
