package demo;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Asgn3loginPractise {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\shiva\\Downloads\\chromedriver_win32\\chromedriver.exe"); 
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/loginpagePractise/");
		
		driver.findElement(By.id("username")).sendKeys("rahulshettyacademy");
		driver.findElement(By.name("password")).sendKeys("learning");
		//user-radiobutton
		driver.findElement(By.cssSelector("label.customradio:nth-child(2)")).click();
		
		//Thread.sleep(4000);
		//explicit wait 
		WebDriverWait w =new WebDriverWait(driver,Duration.ofMillis(15));
	//	WebDriverWait w = new WebDriverWait(driver, 15);
	//	wait.until(ExpectedConditions.presenceOfElementLocated(ElementLocator));

		w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div.modal-body")));
		
		driver.findElement(By.cssSelector("button[id=okayBtn]")).click();
		
		
		WebElement staticdd = driver.findElement(By.cssSelector("select[class=form-control]"));
		Select dropdown = new Select (staticdd);
		dropdown.selectByVisibleText("Consultant");
				
		driver.findElement(By.cssSelector("input[id='terms']")).click();
		driver.findElement(By.id("signInBtn")).click();
		Thread.sleep(4000);
		
	// w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("//a(text()=' Checkout ( 0 )')")));
	//	 w.until(ExpectedConditions.visibilityOfElementLocated(By.partialLinkText("Checkout")));
	//	w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("//a(text()='Checkout')")));
  //  w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("a[class*='btn-primary']")));
    
  w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[contains(@class,'btn-primary')]")));
  
 
		//add all the items to cart .. 
		List <WebElement> products = driver.findElements(By.cssSelector(".card-footer .btn-info"));
			
	    System.out.println(products.size());
	    for(int i=0;i<products.size();i++)
		{
	    	products.get(i).click();
	    	i++;
	    }
	    
	    driver.findElement(By.partialLinkText("Checkout")).click();
	    



	    
	    

		
		
		
		

		
		}

}
