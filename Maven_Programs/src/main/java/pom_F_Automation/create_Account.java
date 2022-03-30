package pom_F_Automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class create_Account {
	
public WebDriver driver;
	
	@FindBy(id="email_create")
	private WebElement create_Account;

	@FindBy(id="SubmitCreate")
	private WebElement submit;

	public create_Account(WebDriver driver2) {
		this.driver = driver2;
		PageFactory.initElements(driver, this);

	}

	public WebElement getCreate_Account() {
		return create_Account;
	}

	public WebElement getSubmit() {
		return submit;
	}

}
