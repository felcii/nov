package Wait_Concepts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class fels_Wait_Concepts {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\DELL\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.instagram.com/");
		driver.manage().window().maximize();
		
		//implicit
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		WebElement mail = driver.findElement(By.xpath("//input[@name = 'username']"));
		mail.sendKeys("abc@ymail.co");
		
		WebElement pass = driver.findElement(By.xpath("//input[@name = 'password']"));
		
		//explicit
		
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOf(pass));
		
		pass.sendKeys("keys");
		
		WebElement login = driver.findElement(By.xpath("(//div[@dir = 'auto'])[9]"));
		login.click();
		
	}

}
