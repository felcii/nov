package pom_D_Automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class customer_Details {

	
	public WebDriver driver;
	
	@FindBy(id="id_gender1")
	private WebElement gender;
	
	@FindBy(id="customer_firstname")
	private WebElement first_name;

	@FindBy(id="customer_lastname")
	private WebElement last_name;
	
	@FindBy(id="passwd")
	private WebElement Password;

	@FindBy(xpath="//option[@value = '16']")
	private WebElement date;

	@FindBy(xpath="(//option[@value = '1'])[2]")
	private WebElement month;

	@FindBy(xpath="//option[@value = '1996']")
	private WebElement year;

	
	public customer_Details(WebDriver driver2) {
		this.driver = driver2;
		PageFactory.initElements(driver, this);
	}


	public WebElement getGender() {
		return gender;
	}


	public WebElement getFirst_name() {
		return first_name;
	}


	public WebElement getLast_name() {
		return last_name;
	}

	public WebElement getPassword() {
		return Password;
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
