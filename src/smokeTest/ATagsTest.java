package smokeTest;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ATagsTest {
	 private static final boolean False = false;
	private static final boolean True = true;
	WebDriver driver;
		
		@Test
		public void loginElementsPresentTest() {
			
		   System.out.println("Running the test");
		   boolean loginElementPresent = False;		     
		   
		   //Test the presence of Atags
		   List <WebElement> aElements = driver.findElements(By.tagName("a"));
		   int numberofAelements = aElements.size();
		   System.out.println("There are " +numberofAelements +" present in the webpage");
		   for(WebElement aElement : aElements) {
			   System.out.println(aElement.getText());
			   if(aElement.getText().equals("Login")) {
				   loginElementPresent = True;
				   break;
			   }
		   }
		   Assert.assertTrue(loginElementPresent);
		    	    
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
