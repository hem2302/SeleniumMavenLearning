package writingseleniumtestcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCase4 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		/*
		 Verify Customer Login to gcrshop user interface

		 Test case
		 1. Launch browser
		 2. navigate to gcrshop user interface - http://www.gcrit.com/build3/
		 3. Click login link
		 4. Enter email address
		 5. Enter password
		 6. click login button

		 Input/test data
		 1. Email Address = fuji@gmail.com
		 2. password = abcef

		 verification point
		 1. verify the existence of logoff link after login into the application - Log Off

		 Expected output
		 "Log Off" link should be available on page

		 */

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Samsung\\Desktop\\Selenium_Training\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.gcrit.com/build3/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.linkText("login")).click();
		driver.findElement(By.name("email_address")).sendKeys("fuji@gmail.com");
		driver.findElement(By.name("password")).sendKeys("abcef");
		driver.findElement(By.id("tdb5")).click();
		try {
			boolean logoffLinkCheck = driver.findElement(By.linkText("Log Off")).isDisplayed();

			if(logoffLinkCheck == true) {
				System.out.println("login successful - passed");
			}
		}catch(NoSuchElementException exp1)

		{
			System.out.println("login not succesful - failed");
		}

		Thread.sleep(3000);
		driver.quit();
	}

}
