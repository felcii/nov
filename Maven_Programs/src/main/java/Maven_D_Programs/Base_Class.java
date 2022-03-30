package Maven_D_Programs;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;


public class Base_Class {
public static WebDriver driver;
	
	public static WebDriver browser_Configuration(String type) {
	
		try {

			if (type.equalsIgnoreCase("chrome")) {
				System.setProperty("webdriver.chrome.driver", 
						System.getProperty("user.dir")+ "\\Driver\\chromedriver.exe");
				driver	= new ChromeDriver();
			}
			else if (type.equalsIgnoreCase("firefox")) {
				System.setProperty("webdriver.gecko.driver", "value");
				driver = new FirefoxDriver();	
			}
				
		} catch (Exception e) {

			e.printStackTrace();
			}
		
		driver.manage().window().maximize();
		return driver;
				
	 }

	public static void clickonElement(WebElement home_Page) {
		home_Page.click();
	}
	
	public static void inputvalueElement(WebElement element, String data) {
		element.sendKeys(data);		
	}
	
	public static void close() {
		driver.close();
	}
	
	public static void getUrl(String url) {
		driver.get(url);
	}
	
	public static void dropdown(String type, WebElement element, String value) {
		Select s = new Select(element);
		
		if (type.equalsIgnoreCase("byValue")) {
			s.selectByValue(value);	
		}
		
		else if (type.equalsIgnoreCase("byText")) {
			s.selectByVisibleText(value);
		}
		
		else if (type.equalsIgnoreCase("byIndex")) {
			int index = Integer.parseInt(value);
			s.selectByIndex(index);
		}
		
	}
	
	public static void clear(WebElement element) {
		element.clear();
	}
	
	public static void moveto(WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", element);
	}
	
	public static void screenshot(String path) throws IOException {
		TakesScreenshot ts = (TakesScreenshot) driver;
		
		File source = ts.getScreenshotAs(OutputType.FILE);
		File destination = new File(path);
		FileUtils.copyFile(source, destination);
	}
	
	public static void implicitly_wait(int seconds, TimeUnit format) {
		driver.manage().timeouts().implicitlyWait(seconds, format);
	}
	
	public static void action_class(WebElement element) {
		Actions ac = new Actions(driver);
		ac.moveToElement(element).build().perform();
	}
	


}
