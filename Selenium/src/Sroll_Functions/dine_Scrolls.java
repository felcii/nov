package Sroll_Functions;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class dine_Scrolls {
	public static void main(String[] args) throws InterruptedException {
		
			System.setProperty("webdriver.chrome.driver", 
					"C:\\Users\\DELL\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
			
			WebDriver driver = new ChromeDriver();
			
			driver.get("https://www.amazon.co.in/");
			driver.manage().window().maximize();
			
			JavascriptExecutor js = (JavascriptExecutor) driver;
			
			WebElement France = driver.findElement(By.xpath("//a[text() = 'France']"));
			
			js.executeScript("arguments[0].scrollIntoView()", France);
			
			Thread.sleep(2000);
			
			//Scroll-UP
			js.executeScript("window.scrollBy(0,-4000);");
			
			Thread.sleep(2000);

			//Scroll-DOWN
			js.executeScript("window.scrollBy(0,1000);");

	}

}
