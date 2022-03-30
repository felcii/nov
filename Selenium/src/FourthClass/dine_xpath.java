package FourthClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class dine_xpath {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
        driver.get("https://www.thesouledstore.com/register?redirect=%2Forders");
		
        driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//u[text()= 'Create Account']")).click();
		
		String t = driver.findElement(By.xpath("//div[contains(text(),'Register with The Souled Store')]")).getText();
		
		System.out.println(" The text is : " +t);
		
		WebElement fn = driver.findElement(By.xpath("//input[@placeholder = 'First Name *']"));
		fn.sendKeys("dinesh");
		
		WebElement ln = driver.findElement(By.xpath("//input[@placeholder = 'Last Name']"));
        ln.sendKeys("ram");
		
		WebElement ei = driver.findElement(By.xpath("//input[@placeholder = 'Email ID *']"));
		ei.sendKeys("dine@gmail.com");
		
		WebElement cp = driver.findElement(By.xpath("//input[contains(@placeholder , 'Choose New Password *')]"));
		cp.sendKeys("123456");
		
		WebElement pass = driver.findElement(By.xpath("//input[contains(@placeholder , 'Confirm Password *')]"));
		pass.sendKeys("123456");
		
		WebElement m = driver.findElement(By.xpath("//input[@placeholder = 'Mobile Number(For order status update) *']"));
		m.sendKeys("1234567890");
		
		driver.findElement(By.xpath("(//button[@type = 'submit'])[1]")).click();
		
	}
	
}
