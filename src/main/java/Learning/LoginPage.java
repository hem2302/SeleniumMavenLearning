package Learning;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

	 WebDriver driver;
	
	By userName = By.name("username");
	By password = By.name("password");
	By loginbutton = By.id("button");
	
	public LoginPage(WebDriver driver) {
		this.driver = driver;
		
	}
	
	public void TypeUsername(String Uname) {
		driver.findElement(userName).sendKeys(Uname);
	}
	
	public void CaptureUsername() {
		driver.findElement(userName).getAttribute("value");
		
	}

	public void ClearUsername() {
		driver.findElement(userName).clear();
		
	}
	
	public void typePassword(String pword) {
		driver.findElement(password).sendKeys(pword);
		
	}
	
	public void ClickLoginButton() {
		driver.findElement(loginbutton).click();
		
	}
}