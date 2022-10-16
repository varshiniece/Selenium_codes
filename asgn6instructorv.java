package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class asgn6instructorv {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\shiva\\chromedriver_win32\\chromedriver.exe"); 
		WebDriver driver = new ChromeDriver(); 
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		//select third checkbox 
		//xpath = //tagname[@att = "value"]/child2/child2/child3 ...
		
		 driver.findElement(By.xpath("//div[@id='checkbox-example']/fieldset/label[3]/input")).click();

	        String label=driver.findElement(By.xpath("//div[@id='checkbox-example']/fieldset/label[3]")).getText();

	        System.out.println(label);
	        
      WebElement dropdown=driver.findElement(By.id("dropdown-class-example"));

	        Select s=new Select(dropdown);

	        s.selectByVisibleText(label);
	        
	 //enter label in textbox
	        driver.findElement(By.xpath("//input[@name='enter-name']")).sendKeys(label);
	//click alert. 
	        driver.findElement(By.cssSelector("input[id='alertbtn']")).click();
	        
	//verify if label is present in the popup msg.          
	        
			String alertmsg = driver.switchTo().alert().getText();
			if(alertmsg.contains(label))
			{
				System.out.println("Alert msg success");
				
			}
					

	        
	        
	        
	        

	}

}
