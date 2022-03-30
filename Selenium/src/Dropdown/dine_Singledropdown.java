package Dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dine_Singledropdown {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", 
		"C:\\Users\\DELL\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		driver.manage().window().maximize();

		WebElement signup = driver.findElement(By.xpath("(//a[@role='button'])[2]"));	
		signup.click();
			
		Thread.sleep(5000);
		
		WebElement fn = driver.findElement(By.xpath("//input[@name = 'firstname']"));
		fn.sendKeys("Dinesh");
		
		WebElement ln = driver.findElement(By.xpath("//input[@name = 'lastname']"));
		ln.sendKeys("ram");

		WebElement mn = driver.findElement(By.xpath("//input[@aria-label = 'Mobile number or email address']"));
		mn.sendKeys("123456789");
		
		WebElement pass = driver.findElement(By.xpath("//input [@data-type='password']"));
		pass.sendKeys("dine@gmail.com");
		
		WebElement date = driver.findElement(By.id("day"));
		Select d = new Select(date);
		d.selectByValue("16");
		
		WebElement month = driver.findElement(By.id("month"));
		Select m = new Select(month);
		m.selectByValue("1");
		
		WebElement year = driver.findElement(By.id("year"));
		Select y = new Select(year);
		y.selectByVisibleText("1996");
		

		
		
		
		
		
		
		
	}
	
}
