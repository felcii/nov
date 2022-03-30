package Takesscreenshot;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class dine_SS {
 
	public static void main(String[] args) throws IOException {
		
		System.setProperty("webdriver.chrome.driver", 
			"C:\\Users\\DELL\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.flipkart.com/");
		
		driver.manage().window().maximize();
		
		TakesScreenshot ts = (TakesScreenshot) driver;
		
		File src = ts.getScreenshotAs(OutputType.FILE);
		
		File dest = new File("C:\\Users\\DELL\\eclipse-workspace\\Selenium\\Screenshot\\dine.flipkart.png");
		
		FileUtils.copyFile(src, dest);
		
		
		
		
		
		
		
		
		
		
		
	}
	
}
