package selenium.object.elements.learning;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingLinks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//types of links
		// ---- UI Point of view--------
		//Text link (Ex: Gmail link in google home page)
		//Image Link (Ex: Selenium IDE link in seleniumhq.org)

		// ------ Functional point of view --------
		//Internal links - It will redirect to another location on the same page
		//External links - It will redirect to another page

		// Actions - click, check is enabled, is displayed, return element name

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Samsung\\Desktop\\Selenium_Training\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//driver.get("https://accounts.google.com/signin/v2/identifier?continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&service=mail&sacu=1&rip=1&flowName=GlifWebSignIn&flowEntry=ServiceLogin");

		driver.get("https://www.google.com");
		driver.manage().window().maximize();

		//Create WebElement for Gmail header link

		WebElement gmailLink = driver.findElement(By.linkText("Gmail"));

		//Check for link displayed status
		boolean checkDisplayed = gmailLink.isDisplayed();
		System.out.println("Displayed Status -- "+checkDisplayed);

		//Check for link enabled status
		boolean checkEnabled = gmailLink.isEnabled();
		System.out.println("Enabled Status -- "+checkEnabled);

		//Get header link text
		String linkName = gmailLink.getText();
		System.out.println(linkName);

		//Click the gmail header link
		gmailLink.click();

	}

}
