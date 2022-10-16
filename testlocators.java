package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class testlocators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\shiva\\chromedriver_win32\\chromedriver.exe"); 
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.valuedopinions.co.in/");
		
		
	//	JavascriptExecutor js =(JavascriptExecutor)driver;
	//	js.executeScript("window.scrollBy(0,1500)");
		
		driver.findElement(By.linkText("Log in")).click();
		
		driver.findElement(By.id("username")).sendKeys("varshini.ece@gmail.com");
		driver.findElement(By.cssSelector("Input[name=password]")).sendKeys("Jewelrain@88");
		
		driver.findElement(By.className("button-full")).click();
					
				
		
		
		
		
	}

}
