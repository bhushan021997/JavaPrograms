package ex_16052024.MultilevelInheritence.APIAutomation;

public class Lab177 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test t1 = new Test();
      t1.openExcelFile();
      t1.openSQLConnection();
      int a = t1.API_VERSION;

      CommoToALL c = new Test();
      c.openExcelFile();
      c.openJSON();

	}

}
