package F_Page_Obj_Man;

import org.openqa.selenium.WebDriver;
import pom_F_Automation.address_Pg;
import pom_F_Automation.authentication_Pg;
import pom_F_Automation.create_Account;
import pom_F_Automation.home_Pg;

public class pom_Auto {

public WebDriver driver;
	
	private home_Pg hp;

	private create_Account ca;
	
	private authentication_Pg authen;
	
	private address_Pg adres;
	
	
	public pom_Auto(WebDriver driver2) {
		this.driver = driver2;
	}


	public home_Pg getHp() {
		if (hp==null) {
			hp = new home_Pg(driver);
		}
		return hp;
	}


	public create_Account getCa() {
		if (ca==null) {
			ca = new create_Account(driver);
		}
		return ca;
	}


	public authentication_Pg getAuthen() {
		if (authen==null) {
			authen = new authentication_Pg(driver);
		}
		return authen;
	}


	public address_Pg getAdres() {
		if (adres==null) {
			adres = new address_Pg(driver);
		}
		return adres;
	}

	
}
