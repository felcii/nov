package pom_D_Automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class create_Account {

	public WebDriver driver;

	@FindBy(id="email_create")
	private WebElement mail;
	
	@FindBy(id="SubmitCreate")
	private WebElement submit;

	public create_Account(WebDriver driver2) {
		this.driver = driver2;
		PageFactory.initElements(driver, this);
	}

	public WebElement getMail() {
		return mail;
	}

	public WebElement getSubmit() {
		return submit;
	}
	
	

}
