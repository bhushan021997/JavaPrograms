package ex_21052024Abstraction.RealExample;

abstract class BaseClass {
	
	// Web Automation
    // Heri Inheritance - BaseClass -> Child 1,
    // BaseClass -> Child 2
	
	 abstract String openBrowser();
	 abstract String closeBrowser();
	 
	 void printLog(){
	        System.out.println("Logs");
	    }
 
}
