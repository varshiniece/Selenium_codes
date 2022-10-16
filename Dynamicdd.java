package demo;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.testng.Assert;

public class Dynamicdd {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\shiva\\Downloads\\chromedriver_win32\\chromedriver.exe"); 
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		
		
		//check if a ckeckbox is clicked or not and clicking a checkbox
			
		System.out.println(driver.findElement(By.cssSelector("input[name*= 'chk_friendsandfamily']")).isSelected());
		driver.findElement(By.cssSelector("input[name*= 'chk_friendsandfamily']")).click();
		System.out.println(driver.findElement(By.cssSelector("input[name*= 'chk_friendsandfamily']")).isSelected());
		
			
		////a[@value='MAA'] -->xpath for bangalore. 
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		driver.findElement(By.xpath("//a[@value='BLR']")).click();
		Thread.sleep(2000);
		//driver.findElement(By.xpath("//a[@value='MAA'])[2]")).click();
		driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='MAA']")).click();

	//	driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight.ui-state-active")).click();
		
			
	}

}
