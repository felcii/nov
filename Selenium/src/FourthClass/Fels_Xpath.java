package FourthClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Fels_Xpath {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		
		driver.get("https://www.tumblr.com/register");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@name = 'email']")).sendKeys("felcia34@ymail.com");
		
		driver.findElement(By.xpath("//input[contains(@name, 'password')]")).sendKeys("abc12@F");
		
		driver.findElement(By.xpath("//input[contains(@name, 'blogName')] ")).sendKeys("felci");
				
		driver.findElement(By.xpath("//span[@class = 'EvhBA'] ")).click();
		
		WebElement f = driver.findElement(By.xpath("//div[contains(text(), 'sign up')]")); 
		String text = f.getText();
		
		System.out.println(text);
		
		
	}
}
