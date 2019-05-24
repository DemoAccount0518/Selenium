package stepImplementations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class BDDLoginTest {
	WebDriver driver;
	@Given("^user is on the login page$")
	public void user_is_on_the_loginpage() {
		System.out.println("User is on the login page");
		
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://whiteboxqa.com/login.php");
	}
	@When("^user enters correct username and correct password$")
	public void user_enter_correct_username_and_correct_password() {
		System.out.println("User enters username and password");
		driver.findElement(By.name("uname")).sendKeys("username@gmail.com");
		driver.findElement(By.name("pwd")).sendKeys("password");
		driver.findElement(By.name("submit")).click();
	}
	@Then("^user gets confirmation$")
	public void user_gets_confirmation() {
		System.out.println("User gets confirmation.");
		String pageTitle = driver.getTitle();
		System.out.println("Page Title :"+pageTitle);
		driver.quit();
	}

}
