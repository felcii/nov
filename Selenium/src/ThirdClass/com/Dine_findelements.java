package ThirdClass.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dine_findelements {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		driver.manage().window().maximize();
		
	    driver.findElement(By.id("email")).sendKeys("9884243663");
	    
	    driver.findElement(By.id("pass")).sendKeys("abcdef");
	    
	    driver.findElement(By.name("login")).click();
	
		
		
	}
	
}
