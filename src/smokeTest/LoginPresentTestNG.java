package smokeTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginPresentTestNG {
	
	 WebDriver driver;
	
	@Test
	public void loginElementsPresentTest() {
		
	    boolean loginEmailBox = driver.findElement(By.id("username")).isDisplayed();
	    boolean passwordBox = driver.findElement(By.id("password")).isDisplayed();
	    
	    Assert.assertTrue(loginEmailBox, "Loginbox Present");
	    Assert.assertTrue(passwordBox ," PasswordBox  present");
	    	    
	}
	@BeforeMethod
	public void setUp() {
		System.out.println("Starting test");
		System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver.exe");
	    driver = new ChromeDriver();
	    driver.get("http://whiteboxqa.com/login.php");
		
	}
	@AfterMethod
	public void tearDown() {
		System.out.println("Closing the test");
		driver.close();		
	}

}
