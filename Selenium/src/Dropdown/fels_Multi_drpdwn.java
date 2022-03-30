package Dropdown;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class fels_Multi_drpdwn {

public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", 
		"C:\\Users\\DELL\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://leafground.com/pages/Dropdown.html");
		
		driver.manage().window().maximize();

		WebElement multipl = driver.findElement(By.xpath("(//select)[6]"));
		
		Select s = new Select(multipl);
		boolean mul = s.isMultiple();
		System.out.println("Is it Multiple : "+mul);
		
		s.selectByValue("3");
		Thread.sleep(2000);		
		
		s.selectByIndex(2);
		Thread.sleep(2000);
		
		s.selectByVisibleText("Selenium");
		Thread.sleep(2000);
		
		s.deselectByValue("1");
		//Thread.sleep(2000);
		
		s.deselectByVisibleText("Appium");
		//Thread.sleep(2000);

		s.deselectByIndex(3);
		Thread.sleep(2000);

		s.selectByVisibleText("Loadrunner");
		
		
		System.out.println();
		
		//getOptions
		System.out.println("** ALL OPTIONS **");
		List<WebElement> allOptions = s.getOptions();
		
		for (WebElement all : allOptions) {
			
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
		
		//s.deselectAll();
}
}
