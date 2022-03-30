package ThirdClass.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Fels_FindElements {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.id("email")).sendKeys("bidhcuec@tmail.com");
		
		driver.findElement(By.id("pass")).sendKeys("abdckurcurb");
		
		driver.findElement(By.name("login")).click();
		
		
	}

}
