package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class etoe {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\shiva\\Downloads\\chromedriver_win32\\chromedriver.exe"); 
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		
	////a[@value='MAA'] -->xpath for bangalore. 
			driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
			driver.findElement(By.xpath("//a[@value='BLR']")).click();
			Thread.sleep(2000);
			//driver.findElement(By.xpath("//a[@value='MAA'])[2]")).click();
			
			driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='MAA']")).click();

	//		driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight.ui-state-active")).click();
				
			if(driver.findElement(By.id("Div1")).getAttribute("style").contains("0.5"))
			{
				System.out.println("its enabled");
				Assert.assertTrue(true);
			}
			else
			{
				Assert.assertTrue(false);
				
			}
			driver.findElement(By.cssSelector("input[name*= 'chk_friendsandfamily']")).click();
			
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
			WebElement staticdropdown = driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
			
			Select dropdown = new Select(staticdropdown);
			//select by index, visible text, Value  
			dropdown.selectByIndex(2);
			
			
			//search button
			driver.findElement(By.cssSelector("input[value='search']")).click();
			
			
			
			
			
	}

}
