package TestRealTime;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


import pages.DashboardPage;
import pages.LoginPage;

public class Login {
	@Test
	public void loginTestPOM() {
		//1.Initialize the driver.
		
		//driver = utilities.DriverFactory.newDriver(Firefox);
		
		System.setProperty("webdriver.gecko.driver", "C:\\Selenium\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://whiteboxqa.com/login.php");
	
		//2.Enter Login information.(Login Page), POM put in separate page
		LoginPage loginpage = new LoginPage(driver);
		loginpage.setUserName("user@gmail.com");
		loginpage.setPassword("password");
		loginpage.clickSubmit();
		
		//3.Get Confirmation. (Dashboard page)
		DashboardPage dashboardPage = new DashboardPage(driver);
		String conf = dashboardPage.conf_Msg();
		System.out.println("Confirmation" +conf);
		Assert.assertTrue(conf.contains("Login"));
		
		//4.Close the driver.
		driver.quit();
	}	

}
