package DDT;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class LoginDDT {
	WebDriver driver;

	@Test(dataProvider = "getData")
	public void loginTest(String name, String email, String password) {
		driver.findElement(By.id("username")).sendKeys(email);
		driver.findElement(By.id("password")).sendKeys(password);
	}

	@DataProvider
	public String[][] getData() {
		return utilities.Excel.get("C:\\Bhuvana\\UserLogin.xls");
	}

	@BeforeMethod
	public void setUp() {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
	    driver = new ChromeDriver();
		driver.get("http://whiteboxqa.com/login.php");
	}

	@AfterMethod
	public void tearDown() {
		System.out.println("Closing the test");
		//driver.quit();
	}

}
