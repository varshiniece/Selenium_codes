package demo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class asgn7webtab {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\shiva\\chromedriver_win32\\chromedriver.exe"); 
		WebDriver driver = new ChromeDriver(); 
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		
		JavascriptExecutor js =(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,650)");
		
		WebElement table = driver.findElement(By.id("product"));
	//System.out.println(table.findElements(By.tagName("tr")).size()); //no of rows in a table  This will also work. 
		
	//	System.out.println(table.findElements(By.tagName("th")).size()); //column
		
		int rows = driver.findElements(By.cssSelector(".table-display tr")).size();

		System.out.println("No of rows-"+" "+ rows);

		int columns = driver.findElements(By.cssSelector(".table-display th")).size();

		System.out.println("No of columns-"+" "+ columns);

		List <WebElement> secondrow = table.findElements(By.tagName("tr")).get(2).findElements(By.tagName("td"));
		
		System.out.println(secondrow.get(0).getText());
		System.out.println(secondrow.get(1).getText());
		System.out.println(secondrow.get(2).getText());
		
		
		

	}

}
