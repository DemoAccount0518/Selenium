package demos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login {

	public static void main(String[] args) {
		//1.Define the webDriver
		
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//2. Open web browser and navigate to  page
		driver.get("http://whiteboxqa.com/login.php");
		
		//Find elements: Locate the element , Determine the action, Pass any parameters
		//3.Enter email address
		
		driver.findElement(By.name("uname")).sendKeys("");
		
		//4.Enter Password
		
		driver.findElement(By.name("pwd")).sendKeys("");
		
		//5.Click Login
		
		driver.findElement(By.name("submit")).click();
		
		//6.Get Confirmation
		
		//String message = driver.findElement(By.linkText("logout"));
		System.out.println("Confirmation" );
		
		String pageTitle = driver.getTitle();
		System.out.println("Page Title :"+pageTitle);
		/*if (pageTitle == "QA/QE/SDET Training.") {
			System.out.println("Page Title Passed");
		}*/
		
		//7. Close the browser
		
		driver.close();
		driver.quit();
			
			
	
	
			

	}

}
