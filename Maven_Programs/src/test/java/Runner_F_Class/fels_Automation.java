package Runner_F_Class;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import F_Page_Obj_Man.pom_Auto;
import Maven_F_Programs.Base_Class;


public class fels_Automation extends Base_Class{
	
	public static WebDriver driver =  browser_Configuration("chrome");

	public static pom_Auto pom = new pom_Auto(driver);

	public static void main(String[] args) {
		
		getUrl("http://automationpractice.com/index.php");
		
		implicitly_wait(10, TimeUnit.SECONDS);
		
		//signin
		clickonElement(pom.getHp().getHome_Page());
		
		//create account
		inputvalueElement(pom.getCa().getCreate_Account(), "charlotte0@gmail.com");
		clickonElement(pom.getCa().getSubmit());
		
		//authentication page
		driver.findElement(By.id("id_gender2")).click();
		driver.findElement(By.id("customer_firstname")).sendKeys("Felcia");
		driver.findElement(By.id("customer_lastname")).sendKeys("Charlotte");
		WebElement password = driver.findElement(By.id("passwd"));
		password.sendKeys("12345");
		driver.findElement(By.xpath("//option[@value = '18']")).click();
		driver.findElement(By.xpath("(//option[@value = '10'])[2]")).click();
		driver.findElement(By.xpath("//option[@value = '1995']")).click();
		
		//address
		driver.findElement(By.id("company")).sendKeys("SETO Solutions");
		driver.findElement(By.id("address1")).sendKeys("5, Anipar Mantle");
		driver.findElement(By.id("address2")).sendKeys("Foxtron");
		driver.findElement(By.id("city")).sendKeys("Hutchinson");
		driver.findElement(By.xpath("(//option[@value = '16'])[2]")).click();
		driver.findElement(By.id("postcode")).sendKeys("67505");
		driver.findElement(By.id("phone_mobile")).sendKeys("1234567890");
		driver.findElement(By.id("alias")).sendKeys("My address");
		driver.findElement(By.id("submitAccount")).click();
		
		
	}

}
