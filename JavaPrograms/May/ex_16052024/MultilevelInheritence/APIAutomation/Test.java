package ex_16052024.MultilevelInheritence.APIAutomation;

public class Test extends BaseTes{
	void accessExcelAndSQL(){
        openExcelFile();
        openSQLConnection();
        System.out.println(API_VERSION);
        System.out.println(VERSION);
    }

    void openJSON(){
        System.out.println("Test");
    }

}
