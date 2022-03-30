package Runner_D_Class;

import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import D_Page_Object_Manager.page_Object_Manager_Auto;
import Maven_D_Programs.Base_Class;

public class dine_Automation extends Base_Class{
	
	public static WebDriver driver =  browser_Configuration("chrome");

	public static page_Object_Manager_Auto pom = new page_Object_Manager_Auto(driver);
	
    
		public static void main(String[] args) throws IOException, InterruptedException {
			
			getUrl("http://automationpractice.com/index.php");
			
			implicitly_wait(10, TimeUnit.SECONDS);
			
			clickonElement(pom.gethp().getHome_Page());
			
			inputvalueElement(pom.getCa().getMail(), "ar.dinegautam@gmail.com");
			clickonElement(pom.getCa().getSubmit());
			
			implicitly_wait(10, TimeUnit.SECONDS);
			
			clickonElement(pom.getCd().getGender());
			
			inputvalueElement(pom.getCd().getFirst_name(), "DINESH");
			
			inputvalueElement(pom.getCd().getLast_name(), "RAM");
			
			inputvalueElement(pom.getCd().getPassword(), "123456");
			
			clickonElement(pom.getCd().getDate());
			clickonElement(pom.getCd().getMonth());
			clickonElement(pom.getCd().getYear());
			
			inputvalueElement(pom.getAd().getCompany(), "Mind Tree");
			
			inputvalueElement(pom.getAd().getAddress1(), "8, VGP Avenue");
			
			inputvalueElement(pom.getAd().getAddress2(), "Foxtron");
			
			inputvalueElement(pom.getAd().getCity(), "Fairbanks");
			
			inputvalueElement(pom.getAd().getPostcode(), "99703");
			
			inputvalueElement(pom.getAd().getPhone_mobile(), "9884243663");
		
			inputvalueElement(pom.getAd().getAlias(), "My Address");

			//clickonElement(pom.getAd().getSubmitAccount());
			
			
		}

	}



