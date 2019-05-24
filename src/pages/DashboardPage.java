package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DashboardPage {
	WebDriver driver;
	public void changePassword() {
		driver.findElement(By.linkText(" Click Here To Change Password")).click();
	}
	public String conf_Msg() {
		return driver.findElement(By.xpath("/html/body/div[1]/div/div/header/h1")).getText();
	}
	public DashboardPage(WebDriver driver) {
		this.driver = driver;
	}

}
