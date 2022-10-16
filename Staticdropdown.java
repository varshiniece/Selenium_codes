package demo;

import org.openqa.selenium.By;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import com.sun.jdi.Value;

public class Staticdropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\shiva\\Downloads\\chromedriver_win32\\chromedriver.exe"); 
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		//select dropdown with select tag. 
		WebElement staticdropdown = driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
		
		Select dropdown = new Select(staticdropdown);
		//select by index, visible text, Value  
		dropdown.selectByIndex(2);
		System.out.println(dropdown.getFirstSelectedOption().getText());
		
		dropdown.selectByVisibleText("INR");
		System.out.println(dropdown.getFirstSelectedOption().getText());
//passengers dropdown
		driver.findElement(By.id("divpaxinfo")).click();
		Thread.sleep(2000);
		
		int i=1;
		while(i<5) //we can use for loop also
		{
			driver.findElement(By.id("hrefIncAdt")).click();
			i++;
		}
			
		driver.findElement(By.id("btnclosepaxoption")).click();//clicks on done 
		Assert.assertEquals(driver.findElement(By.id("divpaxinfo")).getText(), "5 Adults");
		
		System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
		
		
	}
	
	
		
	}


