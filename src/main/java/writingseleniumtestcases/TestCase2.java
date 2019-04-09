package writingseleniumtestcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCase2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*verify gmail link existence in google homepage
		Steps:
		1. launch browser
		2. navigate to google homepage - "https://www.google.com"

		verification point
		verify the existence of gmail link

		input or test data
		NA

			Expected result
			Gmail link should be available in the homepage
		 */


		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Samsung\\Desktop\\Selenium_Training\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		try {
			boolean linkPresent = driver.findElement(By.linkText("Gmail")).isDisplayed();

			//verification point
			if(linkPresent == true) {
				System.out.println("Gmail Link present on the google home page - Passed");
			}
		}

		catch(NoSuchElementException exp1){
			System.out.println("Gmail link not present on the google home page");
		}


		driver.quit();
	}

}
