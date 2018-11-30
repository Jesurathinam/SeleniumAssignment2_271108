package com.ibm.javaassignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.util.concurrent.TimeUnit;


public class LaunchChrome {
	public static void main(String[] args){
		System.out.println("This program will launch Chrome browser and access Magento Site");
		System.setProperty("webdriver.chrome.driver", "./chromedriver.exe");
		WebDriver chrdriver=new ChromeDriver();
		WebDriverWait wait=new WebDriverWait(chrdriver, 60); //Explicit Wait
		chrdriver.manage().window().maximize();
		chrdriver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		chrdriver.get("http://magento.com");
		String url=chrdriver.getCurrentUrl();
		System.out.println("Application URL: "+url);
		String title=chrdriver.getTitle();
		System.out.println("Initial Page Title: "+title);
		
		//To find the Login icon and then to click the icon
		WebElement CusLogEle=chrdriver.findElement(By.xpath("//span[text()='Account']/ancestor::a"));
		CusLogEle.click();
		System.out.println("Login icon clicked");
		//To find the Register button and then to click the button
		WebElement RegEle=chrdriver.findElement(By.xpath("//button[@type='button']"));
		RegEle.click();
		System.out.println("Register button clicked");
		//To find the Firstname field and to enter the value
		WebElement firstnameEle=chrdriver.findElement(By.xpath("//input[@id='firstname']"));
		firstnameEle.sendKeys("Jesu");
		System.out.println("First Name entered");
		//To find the Lasttname field and to enter the value
		WebElement lastnameEle=chrdriver.findElement(By.xpath("//input[@id='lastname']"));
		lastnameEle.sendKeys("Albert1");
		System.out.println("Last Name entered");
		//To find the Email Address field and to enter the value
		WebElement emailEle=chrdriver.findElement(By.xpath("//input[@id='email_address']"));
		emailEle.sendKeys("jesualbert1@gmail.com");
		System.out.println("Email Address entered");
		//To find the Password field and to enter the value
		WebElement passEle=chrdriver.findElement(By.xpath("//input[@id='password']"));
		passEle.sendKeys("test$123");
		System.out.println("Password entered");
		//To find the Confirm Password field and to enter the value
		WebElement confpassEle=chrdriver.findElement(By.xpath("//input[@id='confirmation']"));
		confpassEle.sendKeys("test$123");
		System.out.println("Password re-entered");
		//To find the Terms&Conditions checkbox field and to check
		WebElement termconEle=chrdriver.findElement(By.xpath("//input[@id='agree_terms']"));
		termconEle.click();
		System.out.println("Terms & Conditions check box checked");
		System.out.println("End of the program");
		
		
	}

}
