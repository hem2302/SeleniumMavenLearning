package selenium.object.elements.learning;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingEditBox {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Samsung\\Desktop\\Selenium_Training\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://gcrit.com/build3/admin/login.php");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		
		//creating Weblement for the objects/elements
		WebElement userName = driver.findElement(By.name("username"));
		WebElement passWord = driver.findElement(By.name("password"));
		
		//check for is enabled status
		boolean userNameEnabledStatus = userName.isEnabled();
		System.out.println("Enabled Status -- "+userNameEnabledStatus);
		
		//check for is disabled status
		boolean userNameDisplayedStatus = passWord.isDisplayed();
		System.out.println("Disabled Status -- "+userNameDisplayedStatus);
		
		//Send values to the username editbox field
		userName.sendKeys("Hemakumar");
		
		//send values to the password editbox field
		passWord.sendKeys("password");
		
		// get attributes for the username and password textboxes
		String userNameAttribute = userName.getAttribute("value");
		String passwordNameAttribute = passWord.getAttribute("type");
		System.out.println("username attribute -- "+userNameAttribute);
		System.out.println("password attribute -- "+passwordNameAttribute);
		
		//clear the entered values
		
		userName.clear();
		passWord.clear();
		
		Thread.sleep(3000);
		driver.quit();
	}

}
