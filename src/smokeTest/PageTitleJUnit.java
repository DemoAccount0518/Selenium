package smokeTest;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PageTitleJUnit {
	String webURL = "http://whiteboxqa.com/login.php" ;
	WebDriver driver;
	
	@Test
	public void pageTitleTest() {
		
		
		System.out.println("Running the test");
		
		
		String actualTitle = driver.getTitle();
		String expectedTitle = "QA/QE/SDET Training.";
		Assert.assertEquals(expectedTitle, actualTitle);
		//Assert.fail("We intentionally failed the test");
	}
	
	@Before
	public void setUp() {
		System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver.exe");
	    driver = new ChromeDriver();
		driver.get(webURL); 
		
		System.out.println("Setting up the test");
		
	}
	
	@After
	public void tearDown() {
		System.out.println("Closing the test");
	}

}
