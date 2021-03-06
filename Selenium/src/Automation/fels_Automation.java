package Automation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class fels_Automation {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\DELL\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("http://automationpractice.com/index.php");
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		//signin
		WebElement login = driver.findElement(By.xpath("//a[@class = 'login']"));
		login.click();
		
		//create account
		WebElement CreateMail = driver.findElement(By.id("email_create"));
		CreateMail.sendKeys("charlotte0@gmail.com");
		driver.findElement(By.id("SubmitCreate")).click();		
		
		//authentication page
		driver.findElement(By.id("id_gender2")).click();
		driver.findElement(By.id("customer_firstname")).sendKeys("Felcia");
		driver.findElement(By.id("customer_lastname")).sendKeys("Charlotte");
		WebElement password = driver.findElement(By.id("passwd"));
		password.sendKeys("12345");
		driver.findElement(By.xpath("//option[@value = '18']")).click();
		driver.findElement(By.xpath("(//option[@value = '10'])[2]")).click();
		driver.findElement(By.xpath("//option[@value = '1995']")).click();
		
		//address
		driver.findElement(By.id("company")).sendKeys("SETO Solutions");
		driver.findElement(By.id("address1")).sendKeys("5, Anipar Mantle");
		driver.findElement(By.id("address2")).sendKeys("Foxtron");
		driver.findElement(By.id("city")).sendKeys("Hutchinson");
		driver.findElement(By.xpath("(//option[@value = '16'])[2]")).click();
		driver.findElement(By.id("postcode")).sendKeys("67505");
		driver.findElement(By.id("phone_mobile")).sendKeys("1234567890");
		driver.findElement(By.id("alias")).sendKeys("My address");
		driver.findElement(By.id("submitAccount")).click();
		
		
	}

}
