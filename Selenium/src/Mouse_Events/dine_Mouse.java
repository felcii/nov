package Mouse_Events;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class dine_Mouse {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\DELL\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demoqa.com/buttons");
		
		driver.manage().window().maximize();
		
		//clickbutton
		WebElement clickbutton = driver.findElement(By.xpath("//button[text() = 'Click Me']"));
	
		Actions ac = new Actions(driver);
		ac.click(clickbutton).build().perform();
		
		//rightclick
		WebElement rightclick = driver.findElement(By.id("rightClickBtn"));
		ac.click(rightclick).build().perform();
		
		//doubleClick
		WebElement doubleclick = driver.findElement(By.id("doubleClickBtn"));
		ac.click(doubleclick).build().perform();
				
		Thread.sleep(2000);
		
		driver.navigate().to("https://meesho.com/");
		//move to element
		WebElement move = driver.findElement(By.xpath("//img[@alt = 'mensWear']"));
		ac.moveToElement(move).build().perform();
		
		Thread.sleep(2000);

		driver.navigate().to("http://leafground.com/pages/drop.html");
		//draganddrop
		WebElement drag = driver.findElement(By.id("draggable"));
		WebElement drop = driver.findElement(By.id("droppable"));
		ac.dragAndDrop(drag, drop).build().perform();
		
		
		
	}
}
