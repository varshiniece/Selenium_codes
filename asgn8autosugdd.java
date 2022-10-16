package demo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class asgn8autosugdd {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\shiva\\chromedriver_win32\\chromedriver.exe"); 
		WebDriver driver = new ChromeDriver(); 
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		driver.findElement(By.id("autocomplete")).sendKeys("uni");
		Thread.sleep(300);
		//driver.findElement(By.id("autocomplete")).sendKeys(Keys.DOWN);
		//driver.findElement(By.id("autocomplete")).sendKeys(Keys.DOWN);
		//driver.findElement(By.id("autocomplete")).sendKeys(Keys.DOWN);
		//driver.findElement(By.id("autocomplete")).sendKeys(Keys.DOWN);

		  // System.out.println(driver.findElement(By.id("autocomplete")).getAttribute("value")); 

		List<WebElement> options = driver.findElements(By.cssSelector("li[class = 'ui-menu-item'] div"));
		for(WebElement option : options)
		{ 
			if(option.getText().equalsIgnoreCase("United Arab Emirates"))
			{
				option.click();
				break;
				
			}
		}
		
			
		
	}

}
