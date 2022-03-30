package Dropdown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dine_Multipledropdown {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", 
		"C:\\Users\\DELL\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://leafground.com/pages/Dropdown.html");
		
		driver.manage().window().maximize();
		
		WebElement multi = driver.findElement(By.xpath("(//select)[6]"));
		multi.click();
		
		Select s = new Select(multi);
		
		boolean multiple = s.isMultiple();
		System.out.println("is Multiple :  " +multiple );
		
		s.selectByIndex(3);
		s.selectByVisibleText("UFT/QTP");
		s.selectByValue("1");
		
		Thread.sleep(2000);
		s.deselectByIndex(1);
		
		Thread.sleep(2000);
		s.deselectByValue("3");
		
		System.out.println();
		
		System.out.println(" *** ALL OPTIONS *** ");
		
		List<WebElement> alloptions = s.getOptions();
		
		for (WebElement all : alloptions) {
			
			String text = all.getText();
			System.out.println(text);
			
		}
		
		System.out.println();
		
		//getAllSelectedOptions
		System.out.println("** ALL SELECTED OPTIONS **");
		List<WebElement> allSelectedOptions = s.getAllSelectedOptions();
		
		for (WebElement allSelected : allSelectedOptions) {
			
			String text = allSelected.getText();
			System.out.println(text);
		}
		
		System.out.println();
		
		//getFirstSelectedOption
		System.out.println("** First Selected Option **");
		WebElement firstSelectedOption = s.getFirstSelectedOption();
		String text = firstSelectedOption.getText();
		System.out.println(text);

			
	}
	
	
}
