package Firstdayclass.com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class dine_Webmethods {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");

		WebDriver Driver = new ChromeDriver();
		
		Driver.get("https://www.instagram.com/accounts/login/");
		
		Driver.manage().window().maximize();
		
		Driver.navigate().to("https://www.flipkart.com/"); 
		
		Driver.navigate().back();
		
		Driver.navigate().forward();
		
		String T = Driver.getTitle();
		
		System.out.println("Title is : " +T);
		
		String cu = Driver.getCurrentUrl();
		
		System.out.println("Current Url is : " +cu);
		
		Driver.navigate().refresh();
		
		Driver.close();
		
		Driver.quit();
		
		
	}

}
