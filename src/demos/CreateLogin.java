package demos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateLogin {

	public static void main(String[] args) {
		// 1.Create WebDriver.
		System.setProperty("webdriver.gecko.driver", "C:\\Selenium\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		//2.Open Browser to register page
		driver.get("http://whiteboxqa.com/login.php");
		driver.findElement(By.id("register")).click();
		driver.findElement(By.name("username")).sendKeys("mary@testemail.com");
		driver.findElement(By.name("password")).sendKeys("mpass");
		driver.findElement(By.name("fullname")).sendKeys("Mary Kay");
		driver.findElement(By.name("phone")).sendKeys("1234567890");
		driver.findElement(By.name("address")).sendKeys("12, Second street");
		driver.findElement(By.name("city")).sendKeys("Dublin");
		driver.findElement(By.name("zip")).sendKeys("94586");
		
		new Select(driver.findElement(By.name("country"))).selectByVisibleText("India");
		// Fill out the form

	}

}
