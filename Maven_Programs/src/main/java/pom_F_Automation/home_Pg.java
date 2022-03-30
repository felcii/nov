package pom_F_Automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class home_Pg {

public WebDriver driver;
	
	@FindBy(xpath="//a[@class='login']")
	private WebElement home_Page;
	
	public home_Pg(WebDriver driver2) {
		
		this.driver = driver2;
		PageFactory.initElements(driver, this);
	}

	public WebElement getHome_Page() {
		return home_Page;
	}

}
