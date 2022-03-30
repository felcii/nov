package pom_F_Automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class address_Pg {
	
public WebDriver driver;
	
	@FindBy(id="company")
	private WebElement company;

	@FindBy(id="address1")
	private WebElement address1;
	
	@FindBy(id="address2")
	private WebElement address2;
	
	@FindBy(id="city")
	private WebElement city;

	@FindBy(xpath="(//option[@value = '16'])[2]")
	private WebElement address;

	@FindBy(id="postcode")
	private WebElement postcode;

	@FindBy(id="phone_mobile")
	private WebElement phone_mobile;

	@FindBy(id="alias")
	private WebElement alias;

	@FindBy(id="submitAccount")
	private WebElement submitAccount;

	public address_Pg(WebDriver driver2) {
		this.driver = driver2;
		PageFactory.initElements(driver, this);
	}

	public WebElement getCompany() {
		return company;
	}

	public WebElement getAddress1() {
		return address1;
	}

	public WebElement getAddress2() {
		return address2;
	}

	public WebElement getCity() {
		return city;
	}

	public WebElement getAddress() {
		return address;
	}

	public WebElement getPostcode() {
		return postcode;
	}

	public WebElement getPhone_mobile() {
		return phone_mobile;
	}

	public WebElement getAlias() {
		return alias;
	}

	public WebElement getSubmitAccount() {
		return submitAccount;
	}
	

}
