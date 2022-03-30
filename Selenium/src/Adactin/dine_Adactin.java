package Adactin;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dine_Adactin {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\DELL\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://adactinhotelapp.com/");
		driver.manage().window().maximize();
		
		//login
		WebElement UN = driver.findElement(By.id("username"));
		UN.sendKeys("DineRam");
		
		WebElement PW = driver.findElement(By.id("password"));
		PW.sendKeys("dinEshRam");
		
		WebElement login = driver.findElement(By.id("login"));
		login.click();
		
		//search hotel
		WebElement location = driver.findElement(By.id("location"));
		Select l = new Select(location);
		l.selectByValue("Los Angeles");
		
		WebElement hotels = driver.findElement(By.id("hotels"));
		Select h = new Select(hotels);
		h.selectByVisibleText("Hotel Hervey");
		
		WebElement roomTyp = driver.findElement(By.id("room_type"));
		Select r = new Select(roomTyp);
		r.selectByValue("Super Deluxe");
		
		WebElement nos = driver.findElement(By.id("room_nos"));
		Select n = new Select(nos);
		n.selectByIndex(1);
		
		WebElement checkIn = driver.findElement(By.id("datepick_in"));
		checkIn.clear();
		Thread.sleep(2000);
		checkIn.sendKeys("12/05/2022");
		
		WebElement checkOut = driver.findElement(By.id("datepick_out"));
		checkOut.clear();
		Thread.sleep(2000);
		checkOut.sendKeys("15/05/2022");
		
		WebElement adult = driver.findElement(By.id("adult_room"));
		Select a = new Select(adult);
		a.selectByIndex(2);
		
		WebElement child = driver.findElement(By.id("child_room"));
		Select c = new Select(child);
		c.selectByIndex(0);
		
		driver.findElement(By.id("Submit")).click();
		
		//choose one hotel
		driver.findElement(By.id("radiobutton_0")).click();
		
		driver.findElement(By.id("continue")).click();
		
		//Book hotel
		driver.findElement(By.id("first_name")).sendKeys("Dinesh");
		
		driver.findElement(By.id("last_name")).sendKeys("Ram");
		
		driver.findElement(By.id("address")).sendKeys("5, Bethel house, New York");
		
		driver.findElement(By.id("cc_num")).sendKeys("1234567890123456");
		
		driver.findElement(By.xpath("//option [text()= 'American Express' ]")).click();
		
		driver.findElement(By.xpath("//option [@value = '10' ]")).click();
		
		driver.findElement(By.xpath("//option [@value = '2022' ]")).click();
		
		driver.findElement(By.id("cc_cvv")).sendKeys("555");
		
		driver.findElement(By.id("book_now")).click();
		
		Thread.sleep(5000);
		
		driver.findElement(By.id("logout")).click();
		
	}



}
