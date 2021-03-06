package D_Page_Object_Manager;

import org.openqa.selenium.WebDriver;

import pom_D_Automation.communication_Address;
import pom_D_Automation.create_Account;
import pom_D_Automation.customer_Details;
import pom_D_Automation.home_Page;

public class page_Object_Manager_Auto {

	
	public WebDriver driver;
	
	private home_Page hp;
	
	private create_Account ca;
	
	private customer_Details cd;
	
	private communication_Address ad;
	
	public page_Object_Manager_Auto(WebDriver driver2) {
		this.driver = driver2;
	}

	public home_Page gethp() {
		if (hp==null) {
			hp = new home_Page(driver);
		}
		return hp;
	}

	public create_Account getCa() {
		if (ca==null) {
			ca = new create_Account(driver);
		}
		return ca;
	}

	public customer_Details getCd() {
		if (cd==null) {
			cd = new customer_Details(driver);
		}
		
		return cd;
	}

	public communication_Address getAd() {
		if (ad==null) {
			ad = new communication_Address(driver);
		}
		return ad;
	}


	
}
