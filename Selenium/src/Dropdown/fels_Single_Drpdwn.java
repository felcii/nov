package Dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class fels_Single_Drpdwn {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();

		WebElement signup = driver.findElement(By.xpath("(//a[@role='button'])[2]"));	
		signup.click();
			
		Thread.sleep(2000);
		
		WebElement fn = driver.findElement(By.xpath("//input[@name = 'firstname']"));
		fn.sendKeys("Feli");
		
		WebElement ln = driver.findElement(By.xpath("//input[contains(@name , 'last')]"));
		ln.sendKeys("Charl");

		WebElement mn = driver.findElement(By.xpath("//input [ contains ( @aria-label, 'Mobile number')]"));
		mn.sendKeys("8939525010");
		
		WebElement pass = driver.findElement(By.xpath("//input [@data-type='password']"));
		pass.sendKeys("abcdeF@12");
		
		WebElement date = driver.findElement(By.id("day"));
		Select d = new Select(date);
		d.selectByValue("18");
		
		WebElement month = driver.findElement(By.id("month"));
		Select m = new Select(month);
		m.selectByIndex(11);
		
		WebElement year = driver.findElement(By.id("year"));
		Select y = new Select(year);
		y.selectByVisibleText("2000");
		
		
		
		
		
		
		
	}

}
