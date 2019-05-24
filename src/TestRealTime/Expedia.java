package TestRealTime;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Expedia {
	WebDriver driver;
	String city = "New York, New York";
	String checkIn = "05/04/2019";
	String checkOut ="05/14/2019";
	String numofGuests = "2";
	String starRating = "star4";
	@Test
	public void hotelReservation() {
		//	1.Search
			driver.findElement(By.id("tab-hotel-tab-hp")).click();
			driver.findElement(By.id("hotel-destination-hp-hotel")).sendKeys(city);
			driver.findElement(By.id("hotel-checkin-hp-hotel")).sendKeys(checkIn);
			driver.findElement(By.id("hotel-checkout-hp-hotel")).sendKeys(checkOut);
			driver.findElement(By.id("hotel-checkout-hp-hotel")).clear();
			driver.findElement(By.xpath("//*[@id=\"traveler-selector-hp-hotel\"]/div/ul/li/button")).click();
			driver.findElement(By.xpath("//*[@id=\"gcw-hotel-form-hp-hotel\"]/div[10]/label/button")).submit();
			//Printing the name of the city.
				String city = driver.findElement(By.xpath("//*[@id=\"searchWizard\"]/div[2]/div[1]/div/div[2]/div[1]/button")).getText();
						//"//*[@id=\"hotelResultTitle\"]"
				////*[@id="searchWizard"]/div[2]/div[1]/div/div[2]/div[1]/button
				System.out.println("City : "+ city);
			
		//  2.Modify the search criteria.
			driver.findElement(By.cssSelector("input[name='star'][id='" +starRating +"']")).click();
		//	3.Analyze the results and make our selection
		
			driver.findElement(By.xpath("//*[@id=\"searchWizard\"]/div[2]/div[1]/div/div[2]/div[1]/button")).click();
			//("//*[@id=\"resultsContainer\"]/section/article[3]/div[2]/div/a")
		// Switch the window to the pop up
			
			ArrayList<String> windows = new ArrayList<String>( driver.getWindowHandles());
			driver.switchTo().window(windows.get(1));
			
			//*[@id=\"hotel-name\]"
			String hotelName = driver.findElement(By.xpath("//*[@id=\"hotel-name\"]/div[2]/div/a")).getText();
			System.out.println("Hotel Name: "+hotelName);
		//	4.Book Reservation.
			driver.findElement(By.xpath("//*[@id=\"rooms-and-rates\"]/div/article/table/tbody[1]/tr/td[3]/div/div[1]/button")).click();
			driver.getWindowHandles();
			driver.switchTo().window(windows.get(0));
			driver.findElement(By.xpath("//*[@id=\"pay-later-button\"]")).click();
			String hotelPrice = driver.findElement(By.cssSelector("span[class='amount-value']")).getText();
			System.out.println("Price : "+hotelPrice);
		
		//	5.Fill out contact and billing information.
		
		//	6.Confirmation.
			String pageTitle = driver.getTitle();
			Assert.assertTrue(pageTitle.contains("Payment"));
	}
	@BeforeMethod
	public void setUp() {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(7,TimeUnit.SECONDS);
		driver.get("https://www.expedia.com/");
		
	}
	
	@AfterMethod
	public void tearDown() {
		//driver.quit();
		
	}
	

}
