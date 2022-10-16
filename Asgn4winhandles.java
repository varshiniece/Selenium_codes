package demo;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Asgn4winhandles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\shiva\\Downloads\\chromedriver_win32\\chromedriver.exe"); 
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/");
		//click on multiple windows. 
	    driver.findElement(By.linkText("Multiple Windows")).click();
	    
	    driver.findElement(By.linkText("Click Here")).click();
	    
	    Set<String> windows = driver.getWindowHandles(); //getwindowhandles will give all ids of widows used in automation.
		Iterator<String> it = windows.iterator();
		String parentId = it.next();
		String childId1 = it.next();
	
		driver.switchTo().window(childId1);
		System.out.println(driver.findElement(By.cssSelector(".example")).getText());
		driver.switchTo().window(parentId);
		String[] text = driver.findElement(By.cssSelector(".example")).getText().split("\n");
		System.out.println(text[0]);
		


		
	}

}
