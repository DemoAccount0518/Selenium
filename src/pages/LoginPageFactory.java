package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPageFactory {
//Define web elements at class level.	
WebDriver driver;
	
@FindBy(id="username")
WebElement usernameBox;

@FindBy(id="password")
WebElement passwordBox;

@FindBy(id="login")
WebElement loginButton;
//Steps
public void setUserName(String userName) {
		usernameBox.sendKeys(userName);
	}
	
	public void setPassword(String password) {
		passwordBox.sendKeys(password);
	}
	
	public void clickSubmit() {
		loginButton.click();
	}
	//Actions
	public void login(String userName, String password) {
		setUserName(userName);
		setPassword(password);
		clickSubmit();
	}
	
	//Constructor initializes the state of the driver.
	public LoginPageFactory(WebDriver driver) {
		this.driver = driver;
		//Initialize webElements.
		PageFactory.initElements(driver, this);
	}

}
