package ex_25042024SwitchCase;

import java.util.Scanner;

public class Lab081 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Web Automation
        // I will ask user which browser you want me to run the code.
        // chrome -> start chrome, firefox -> firefox, edge -> execution edge
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the browser name!!, where you want to execute the program!");

        String browserName = sc.nextLine();
        browserName = browserName.toLowerCase();

        switch(browserName){
            case "chrome":
                System.out.println("Starting the chrome browser");
                // Further code to start the Chrome
                // Webdriver driver = new Chrome(); // Selenium Code
                break;
            case "firefox":
                System.out.println("Starting the firefox browser");
                // Further code to start the Firefox
                // Webdriver driver = new Firfox(); // Selenium Code
                break;
            case "edge":
                System.out.println("Execute the Edge Code");
                break;
            default:
                System.out.println("I have not idea which browser is this");
                break;
        }

	}

}
