package demo;
//This is the assignment question on UDEMY for practice 
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class angpracice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\shiva\\Downloads\\chromedriver_win32\\chromedriver.exe"); 
		WebDriver driver = new ChromeDriver(); 
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		
		driver.findElement(By.cssSelector("input[name='name']")).sendKeys("Varshini CH");
		driver.findElement(By.name("email")).sendKeys("varshini.e@g.com");
		
	//	driver.findElement(By.xpath("contains[@class,'ng-touched']")).sendKeys("Varshini.ece@gmail.com");
		//    driver.findElement(By.cssSelector("input[name='email'][2]")).sendKeys("Varshini.ece@gm.com");
		driver.findElement(By.id("exampleInputPassword1")).sendKeys("hello");
		
		//Checkbox
		driver.findElement(By.id("exampleCheck1")).click();

		//dropbox gender
		WebElement StaticDropDown = driver.findElement(By.id("exampleFormControlSelect1"));
		Select dropdown = new Select(StaticDropDown);
		dropdown.selectByVisibleText("Female");
		//System.out.println(dropdown.getFirstSelectedOption().getText());
		
		//form-check-label - radiobutton 
		driver.findElement(By.cssSelector("label[for='inlineRadio2']")).click();
		
//calender - dob
		driver.findElement(By.name("bday")).sendKeys("22-06-2022");
		
		//submit 
		driver.findElement(By.cssSelector("input[type='submit']")).click();
		System.out.println(driver.findElement(By.cssSelector(".alert-dismissible")).getText()); //u can write .alert or .alert-success also 
		
		
		
		
		
		
		
	
		
		
		
	}
	
}
