package demo;

import java.util.Arrays;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class greenkrt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\shiva\\Downloads\\chromedriver_win32\\chromedriver.exe"); 
		WebDriver driver = new ChromeDriver(); 
		driver.get("https://rahulshettyacademy.com/seleniumPractise/");
		
		//Arrays take less memory. 
		String[] itemsNeeded = {"Cucumber", "Brocolli", "Onion","Tomato", "Raspberry"};
		
		
		List<WebElement> products = driver.findElements(By.cssSelector("h4.product-name"));
		//System.out.println(products.get(2));
		for(int i=0;i<products.size();i++)
		{
			//format and get only veggie name .. 
		String[] name = products.get(i).getText().split("-");
		String formattedString = name[0].trim();
				
		
		//Convert array to arraylist for easy search. 
		List itemsNeededList = Arrays.asList(itemsNeeded);
		int j=0;
		
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

