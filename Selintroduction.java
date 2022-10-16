package demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selintroduction  {

	public static void main(String[] args) {
		
		//invoking browsers .. to run in chrmome browsers, selenium have released a class
		//called chromeDriver 
		//this class will have all the methods to automate in chrome browser. so first 
		//create an object of the class to access the methods. 
		//follow syntax to create the object// 
		//webDriver is inerface : webDriver methods+personal chromedriver class methods
		//selenium invokes chromeDriver.exe 
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\shiva\\Downloads\\chromedriver_win32\\chromedriver.exe"); 
		WebDriver driver = new ChromeDriver(); 
		driver.get("https://loveforlearningin.wordpress.com");
		
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		driver.close();
		
		

	}

}
