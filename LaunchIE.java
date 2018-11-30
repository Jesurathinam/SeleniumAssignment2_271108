package com.ibm.javaassignments;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class LaunchIE {
	public static void main(String[] args){
		System.out.println("This program will launch IE using set property.");
		System.setProperty("webdriver.ie.driver","./IEDriverServer.exe");
		WebDriver IEdriver=new InternetExplorerDriver();
		System.out.println("End of the program");		
	}

}
