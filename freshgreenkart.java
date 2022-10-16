package demo;
//optimised code for greenkart. and then proceeding with cart 

import java.util.Arrays;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class freshgreenkart {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\shiva\\Downloads\\chromedriver_win32\\chromedriver.exe"); 
		WebDriver driver = new ChromeDriver(); 
		driver.get("https://rahulshettyacademy.com/seleniumPractise/");
		
		//Thread.sleep(3000);
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS); //implicit wait for 5 seconds applied globally
		
		//WebDriverWait w =new WebDriverWait(driver,5);
		
			//Arrays take less memory. 
		String[] itemsNeeded = {"Cucumber", "Brocolli", "Onion","Tomato", "Raspberry"};
		
		addItems(driver, itemsNeeded);
		driver.findElement(By.cssSelector("img[alt='Cart']")).click();
		
		//click on checkout 
		driver.findElement(By.xpath("//button[contains(text(), 'PROCEED TO CHECKOUT')]")).click();
	//	w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("input.promoCode")));
		
		
		//implimentation of inplicit wait. 
		driver.findElement(By.cssSelector("input[class='promoCode']")).sendKeys("rahulshettyacademy");
		driver.findElement(By.cssSelector("button.promoBtn")).click(); //tagname.class
		//exp wait 
		
	//	w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("span.promoInfo")));
		
		System.out.println(driver.findElement(By.cssSelector("span.promoInfo")).getText());
		//With implicit wait code is readable and applied once and works globally.has its scope of effect on whole code. (optimised).
		//performance is effected.
		//-----------------------------------------//
		//explicit wait can be achieved by two means.. 1)web driver wait and 2) fluent wait. 
		//this wait has effect on only one step for which it is defined. 
		//webdriver wait monitors DOM/browser continuously. 
		//fluent wait checks at regular intervals.. polling takes place at given time interval  
		
		//w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("span.promoInfo")));

		//System.out.println(driver.findElement(By.cssSelector("span.promoInfo")).getText());


		
		
		
		
		
		
				
		
		
		
		
		
		
		
		

	}
	
	public static void addItems(WebDriver driver, String[] itemsNeeded)
	{
	int j=0;
	List<WebElement> products = driver.findElements(By.cssSelector("h4.product-name"));
	//System.out.println(products.get(2));
	for(int i=0;i<products.size();i++)
	{
		//format and get only veggie name .. 
	String[] name = products.get(i).getText().split("-");
	String formattedString = name[0].trim();
			
	
	//Convert array to arraylist for easy search. 
	List itemsNeededList = Arrays.asList(itemsNeeded);
		
	if(itemsNeededList.contains(formattedString))
	{
	//driver.findElements(By.xpath("//button[text()='ADD TO CART']")).get(i).click(); -->this is dynamic xpath the add to cart is changing during execution based on the items added. so choose another xpath. 
		driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();
		
		j++;
		if(j==itemsNeeded.length) { break; }
		
	}
		
	}

}
}

