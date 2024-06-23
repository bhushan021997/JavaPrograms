package ex_23052024.StaticKeyword;

public class Lab207 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OOC o1=new OOC();
		System.out.println(o1.oa);
		System.out.println(o1.o);
		
		OOC.SNIC snic=new OOC.SNIC();
		snic.show();
		

	}

}

class OOC{
    static int o = 10;
    int oa = 20;

    static class SNIC{
        void show(){
            System.out.println(o);
            //System.out.println(oa);
        }
    }
}
