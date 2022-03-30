package Mouse_Events;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class fels_Mouse {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\DELL\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demoqa.com/buttons");
		
		driver.manage().window().maximize();
		
		//click
		
		WebElement click = driver.findElement(By.xpath("//button[text() = 'Click Me']"));
		
		Actions ac = new Actions(driver);
		ac.click(click).build().perform();
		
		//rytClick
		WebElement rytClick = driver.findElement(By.id("rightClickBtn"));
		ac.click(rytClick).build().perform();
		
		//doublClick
		WebElement doublClick = driver.findElement(By.id("doubleClickBtn"));
		ac.click(doublClick).build().perform();
		
		Thread.sleep(2000);
		
		driver.navigate().to("https://www.thesouledstore.com/");
		//moveToElement
		WebElement move = driver.findElement(By.id("vests"));
		ac.moveToElement(move).build().perform();
		
		Thread.sleep(2000);

		
		driver.navigate().to("http://leafground.com/pages/drop.html");
		//drag&drop
		WebElement drag = driver.findElement(By.id("draggable"));
		WebElement drop = driver.findElement(By.id("droppable"));
		ac.dragAndDrop(drag, drop).build().perform();
		
		
	}

}
