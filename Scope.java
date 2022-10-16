package demo;

import java.util.List;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scope {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\shiva\\chromedriver_win32\\chromedriver.exe"); 
		WebDriver driver = new ChromeDriver(); 
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		
		//to count no. of links on the page. links have tag (a)which means anchor in html. 
		System.out.println(driver.findElements(By.tagName("a")).size());
		
		//no. of links in the footer section
		//so driver scope has to be reduced to only footer 
		WebElement footerdriver = driver.findElement(By.id("gf-BIG"));
		System.out.println(footerdriver.findElements(By.tagName("a")).size());
		
		//links count of first column of footer.
		
		WebElement columndriver= footerdriver.findElement(By.xpath("//table/tbody/tr/td[1]/ul"));
		
		System.out.println(columndriver.findElements(By.tagName("a")).size());
		
		//to open each link in coloumn footer. 
		
		
		
		
		
		//to grab title of each link)
		
		
		
		
	}

}
