package firstday.com;

public class Browser_Launch {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		
	
		Webdriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
	}
	
}
