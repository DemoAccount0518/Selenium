package TestRealTime;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import pages.LoginPageFactory;

public class LoginFactory {
	String userName = "";
	String password = "";
	//1.Initialize the driver.
	public void LoginTestPageFactory() {
	System.setProperty("webdriver.gecko.driver", "C:\\Selenium\\geckodriver.exe");
	WebDriver driver = new FirefoxDriver();
	driver.get("http://whiteboxqa.com/login.php");
	
	//2.Enter Login details
	LoginPageFactory loginPage = new LoginPageFactory(driver);
	loginPage.login(userName, password);
	}
}
