package Takesscreenshot;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class fels_Takes_ss {
	public static void main(String[] args) throws IOException {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\DELL\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
	
		driver.get("https://www.thesouledstore.com/");
		driver.manage().window().maximize();
		
		TakesScreenshot ts = (TakesScreenshot) driver;

		File source = ts.getScreenshotAs(OutputType.FILE);
	
		File desti = new File("C:\\Users\\DELL\\eclipse-workspace\\Selenium\\Screenshot\\souled.png");
		
		FileUtils.copyFile(source, desti);
		
		
	
	}

}
