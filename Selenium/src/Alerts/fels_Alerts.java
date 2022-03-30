package Alerts;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class fels_Alerts {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\DELL\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://leafground.com/");
		
		driver.manage().window().maximize();
		
		WebElement alert = driver.findElement(By.xpath("//img[@alt = 'Alert']"));
		alert.click();
		
		WebElement simple = driver.findElement(By.xpath("//button[text() = 'Alert Box']"));
		simple.click();
		
		Alert simpleAlert = driver.switchTo().alert();
		simpleAlert.accept();
		
		Thread.sleep(2000);
		
		WebElement confirm = driver.findElement(By.xpath("//button[text() = 'Confirm Box']"));
		confirm.click();
		
		Alert confirmAlert = driver.switchTo().alert();
		confirmAlert.dismiss();
		
		Thread.sleep(2000);
		
		WebElement prompt = driver.findElement(By.xpath("//button[text() = 'Prompt Box']"));
		prompt.click();
		
		Alert promptAlert = driver.switchTo().alert();
		promptAlert.sendKeys("TestLeaf");
		
		String text = promptAlert.getText();
		System.out.println(text);
		promptAlert.accept();

		
	}
}
