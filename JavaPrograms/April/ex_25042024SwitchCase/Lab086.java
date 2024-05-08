package ex_25042024SwitchCase;

public class Lab086 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// JDK > 13
        int itemcode = 010;
        switch (itemcode){
            case 001,002,003 :
                System.out.println("It is Electronic Gadget!");
                break;
            case 004,005,007:
                System.out.println("It is Mechanical Gadget!");
                break;
            default:
                System.out.println("None");
        }

	}

}
