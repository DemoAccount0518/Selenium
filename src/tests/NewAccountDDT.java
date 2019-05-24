package tests;

import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

@RunWith(value = Parameterized.class)
public class NewAccountDDT {
	String userName;
	String password;
	String fullName;
	String phone;
	String address;
	String city;
	String zipcode;
	String country; int index;
	WebDriver driver;
	@Test
	public void newAccountTest() {
		System.out.println("New Record : " + userName + " " + password + " " + fullName+" "+country);
		

		// Define webElement
		WebElement userNameElement = driver.findElement(By.name("username"));
		WebElement passwordElement = driver.findElement(By.name("password"));
		WebElement fullNameElement = driver.findElement(By.name("fullname"));
		WebElement phoneElement = driver.findElement(By.name("phone"));
		WebElement addressElement = driver.findElement(By.name("address"));
		WebElement cityElement = driver.findElement(By.name("city"));
		WebElement zipElement = driver.findElement(By.name("zip"));
		WebElement countryElement = driver.findElement(By.name("country"));
		// Fill out the form
		userNameElement.sendKeys(userName);
		passwordElement.sendKeys(password);
		fullNameElement.sendKeys(fullName);
		phoneElement.sendKeys(phone);
		addressElement.sendKeys(address);
		cityElement.sendKeys(city);
		zipElement.sendKeys(zipcode);
		//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		//new Select(countryElement).selectByIndex(index);
		new Select(countryElement).selectByValue(country);//.selectByVisibleText(country);
		
		
	}
	@Parameters
	public static List<String[]> getData() {
		return utilities.CSV.get("C:\\Bhuvana\\User.csv");
	}
	@Before
	public void setUp() {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://whiteboxqa.com/register.php");
	}
	@After
	public void tearDown() {
		//driver.quit();
	}
	

	// Constructor that passes data to the test method
	public NewAccountDDT(String userName, String password, String fullName, String phone, String address, String city,
			String zipcode, String country) {
		this.userName = userName;
		this.password = password;
		this.fullName = fullName;
		this.phone = phone;
		this.address = address;
		this.city = city;
		this.zipcode = zipcode;
		this.country = country;

	}
}
