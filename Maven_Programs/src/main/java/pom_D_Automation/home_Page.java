package pom_D_Automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class home_Page {
	
public WebDriver driver;
	
	@FindBy(xpath="//a[@class='login']")
	private WebElement Home_Page;
	
	public home_Page(WebDriver driver2) {
		
		this.driver = driver2;
		PageFactory.initElements(driver, this);
	}

	public WebElement getHome_Page() {
		return Home_Page;
	}

}
