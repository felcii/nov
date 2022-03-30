package Alerts;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class dines_Alerts {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver",
		"C:\\Users\\DELL\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://leafground.com/pages/Alert.html");
		
		driver.manage().window().maximize();
		
		WebElement button = driver.findElement(By.xpath("//button[text() = 'Alert Box']"));
		
		button.click();
		
		Alert simpleAlert = driver.switchTo().alert();
		simpleAlert.accept();
		
		Thread.sleep(3000);
		
		WebElement button1 = driver.findElement(By.xpath("//button[text() = 'Confirm Box']"));
		button1.click();
		
		Alert ca = driver.switchTo().alert();
		ca.dismiss();
		
		Thread.sleep(3000);
		
		WebElement button2 = driver.findElement(By.xpath("//button[text() = 'Prompt Box']"));
		button2.click();
		
		Alert pb = driver.switchTo().alert();
		pb.sendKeys("abcd");
		
		String text = pb.getText();
		System.out.println(text);
		pb.accept();
			
	}
}
