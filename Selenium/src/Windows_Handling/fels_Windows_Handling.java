package Windows_Handling;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class fels_Windows_Handling {
	public static void main(String[] args) throws AWTException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\DELL\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.myntra.com/");
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
		WebElement women = driver.findElement(By.xpath("//a[text() = 'Women']"));
		Actions ac = new Actions(driver);
		ac.contextClick(women).build().perform();
		
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		
		Thread.sleep(2000);

		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		
		Thread.sleep(2000);
		
		WebElement home = driver.findElement(By.xpath("//a[text() = 'Home & Living']"));
		ac.contextClick(home).build().perform();
		
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		
		Thread.sleep(2000);

		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);

		Thread.sleep(2000);
		
		//getWindowHandles
		Set<String> windowHandles = driver.getWindowHandles();
		
		for (String strn : windowHandles) {
			
			String title = driver.switchTo().window(strn).getTitle();
			System.out.println(title);
						
		}
		
		String mytitle = "Home and Living - Buy Interior Decoration Products and Accessories Online in India";
		
		for (String strn : windowHandles) {
			
			if (driver.switchTo().window(strn).getTitle().equals(mytitle)) {

				break;
			}
			
		}

	}

}
