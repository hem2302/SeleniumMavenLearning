package pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	//comment
	WebDriver driver;

	@FindBy(name = "txtusername")
	WebElement Username;
	@FindBy(name = "txtpassword")
	WebElement Password;
	@FindBy(xpath = "//input[@id='submit']")
	WebElement loginButton;

	public LoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}


	//send username on login page

	public void SetUserName(String uname) {
		Username.sendKeys(uname);
	}

	//send Password on Login page

	public void SetPassword(String passwrd) {
		Password.sendKeys(passwrd);
	}

	//click login button on the login page

	public void ClickLoginButton() {
		loginButton.click();
	}
}
