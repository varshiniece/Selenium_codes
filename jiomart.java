package demo;
//To add items in cart on jiomart website. 

import java.util.Arrays;


import java.util.List;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class jiomart {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\shiva\\Downloads\\chromedriver_win32\\chromedriver.exe"); 
		WebDriver driver = new ChromeDriver(); 
		driver.get("https://www.jiomart.com/c/groceries/fruits-vegetables/219");
		
		String[] itemsToAdd = {"Watermelon" ,"Lemon", "Potato", "Tomato"};
		
		
		//List<WebElement> items = driver.findElements(By.cssSelector("span.clsgetname"));
          List<WebElement> items = driver.findElements(By.xpath("//span[@class='clsgetname']"));

       //  System.out.println(items.size());
		for(int i=0;i<items.size();i++)
		{
			//format and get only veggie name .. 
		String[] name = items.get(i).getText().split(" ");
		
		String formattedString = name[0];
		
		//convert array to arraylist
		List itemsToAddList = Arrays.asList(itemsToAdd);
		
int j=0;
		
		if(itemsToAddList.contains(formattedString))
		{
			driver.findElements(By.xpath("//button[@title='ADD TO CART']")).get(i).click();
			
			j++;
			if(j==itemsToAdd.length) { break; }
			
		}
         
         


	}

}
}

