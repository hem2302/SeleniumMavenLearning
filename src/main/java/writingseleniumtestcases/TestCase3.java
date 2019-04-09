package writingseleniumtestcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TestCase3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
			Email field verification in web applications
			1. verify the existence of the email with email service provider
			2. Email confirmation
			3. verify email format

		 */
		/*Verify customer registration in gcrshop userinterface
			1. launch browser
			2. navigate to gcrit.com/build3/
			3. click Create an account link on the gcrshop homepage
			4. Enter all mandatory fields(Gender, Firstname, last name, date of birth, Email address)
			5. click continue button

			Verification point
			Capture the confirmation message after the submission of registration and compare with expected

			Expected result
			"your account has been created"

		 */
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Samsung\\Desktop\\Selenium_Training\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.gcrit.com/build3/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.findElement(By.linkText("create an account")).click();
		driver.findElement(By.xpath("(//input[@name='gender'])[1]")).click();
		driver.findElement(By.name("firstname")).sendKeys("abcde");
		driver.findElement(By.name("lastname")).sendKeys("abcdef");
		driver.findElement(By.id("dob")).sendKeys("05/21/1970");
		driver.findElement(By.name("email_address")).sendKeys("fuji@gmail.com");
		driver.findElement(By.name("street_address")).sendKeys("abcdef");
		driver.findElement(By.name("postcode")).sendKeys("abcdgdh");
		driver.findElement(By.name("state")).sendKeys("abcef");
		driver.findElement(By.name("city")).sendKeys("abcfd");
		
		WebElement country = driver.findElement(By.name("country"));

		Select selectCountry = new Select(country);
		selectCountry.selectByVisibleText("India");
		driver.findElement(By.name("telephone")).sendKeys("abcef");
		driver.findElement(By.name("password")).sendKeys("abcef");
		driver.findElement(By.name("confirmation")).sendKeys("abcef");

		driver.findElement(By.id("tdb4")).click();

		//verification point
		String confirmationMessage = driver.findElement(By.tagName("h1")).getText();
		
		if(confirmationMessage.equalsIgnoreCase("Your Account Has Been Created!"))
		{
			System.out.println("Customer registration is successfull");
		}
		
		else
		{
			System.out.println("Customer registration is not successfull");
		}
		
		driver.quit();



	}

}
