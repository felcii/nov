package pom_F_Automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class authentication_Pg {
	
	public WebDriver driver;
	@FindBy(id="id_gender2")
	private WebElement gender;
	
	@FindBy(id="customer_firstname")
	private WebElement first_name;

	@FindBy(id="customer_lastname")
	private WebElement last_name;

	@FindBy(xpath="//option[@value = '18']")
	private WebElement date;

	@FindBy(xpath="(//option[@value = '10'])[2]")
	private WebElement month;

	@FindBy(xpath="//option[@value = '1995']")
	private WebElement year;

	public authentication_Pg(WebDriver driver2) {
		this.driver = driver2;
		PageFactory.initElements(driver, this);
	}

	public WebElement getAuthentication_Pg() {
		return gender;
	}

	public WebElement getFirst_name() {
		return first_name;
	}

	public WebElement getLast_name() {
		return last_name;
	}

	public WebElement getDate() {
		return date;
	}

	public WebElement getMonth() {
		return month;
	}

	public WebElement getYear() {
		return year;
	}


}
