package Frames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class fels_Frames {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\DELL\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://demo.automationtesting.in/Frames.html");
		driver.manage().window().maximize();
		
		driver.switchTo().frame("singleframe");
		
		//singl
		WebElement singleTxtbx = driver.findElement(By.xpath("//input[@type = 'text']"));
		singleTxtbx.sendKeys("Smart");
		
		Thread.sleep(2000);
		
		driver.switchTo().defaultContent();
		
		//multi
		WebElement iframebutton = driver.findElement(By.xpath("(//a[@class = 'analystic'])[2]"));
		iframebutton.click();
		
		//to outer
		WebElement outterframe = driver.findElement(By.xpath("//iframe[@src = 'MultipleFrames.html']"));
		driver.switchTo().frame(outterframe);
		
		//to innr
		WebElement innerframe = driver.findElement(By.xpath("//iframe[@src = 'SingleFrame.html']"));
		driver.switchTo().frame(innerframe);
		
		WebElement multiTxtbx = driver.findElement(By.xpath("//input[@type = 'text']"));
		multiTxtbx.sendKeys("People");
		
		Thread.sleep(2000);
		
		driver.switchTo().parentFrame();
		
		driver.switchTo().defaultContent();
		
	}
}
