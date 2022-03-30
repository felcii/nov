package Sroll_Functions;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class fels_Scroll {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\DELL\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.thesouledstore.com/");
		driver.manage().window().maximize();
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		WebElement SP = driver.findElement(By.xpath("//div[text() = 'Shipping Partners:']"));
		
		js.executeScript("arguments[0].scrollIntoView()", SP);
		
		Thread.sleep(2000);
		
		//UP
		js.executeScript("window.scrollBy(0,-4500);");
		
		Thread.sleep(2000);

		//DOWN
		js.executeScript("window.scrollBy(0,1500);");
		
	}

}
