package Firstdayclass.com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Fels_WebElement_Methods {
public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.instagram.com/accounts/login/");
		
		driver.manage().window().maximize();
		
		Thread.sleep(3000);
		
		driver.navigate().to("https://twitter.com/i/flow/login?input_flow_data=%7B%22requested_variant%22%3A%22eyJsYW5nIjoiZW4ifQ%3D%3D%22%7D");
		
		Thread.sleep(3000);
		
		driver.navigate().back();
		
		Thread.sleep(3000);
		
		driver.navigate().forward();
		
		String T = driver.getTitle();
	
		System.out.println("Title is : " +T);
		
		String CU = driver.getCurrentUrl();
		
		System.out.println("Current URL is : " +CU);
		
		Thread.sleep(3000);
		
		driver.navigate().refresh();
	
		Thread.sleep(5000);
	
		driver.close();
		
		Thread.sleep(5000);
		
		driver.quit();

}
}
