package writingseleniumtestcases;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Testcase5 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		/*
		 Verify user registration forum in gcreddy forum

		 Test steps
		 1. Launch browser
		 2. Navigate to software testing forum(http://gcreddy.com/forum/)
		 3. Click register link - 			link Register
		 4. Accept licence agreement button - 			id: agreed
		 5. Enter user name - username - zakir, id - username
		 6. Enter email id - 			email - zakir@gmail.com, id - email
		 7. Enter password - 			password  - abcdef, id - new_password
		 8. confirm password - 			password confirm, id, password_confirm
		 8. Enter confirmation code - captcha
		 9. click submit button - 			submit button - submit

		 Test data/Input
		 1. user name - username - zakir, id - username
		 2. email id - 			email - zakir@gmail.com, id - email
		 3. password - 			password  - abcdef, id - new_password
		 4. password - 			password confirm, id, password_confirm
		 6. password confirmation code - captcha(Dynamic data handling)
		 7. submit button - 			submit button - submit

		 Expected result
		 "Your account has been created."Tag - h2

		 Verification point
		 capture the confirmation message and compare with expected.
		 */

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Samsung\\Desktop\\Selenium_Training\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://gcreddy.com/forum/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.findElement(By.linkText("Register")).click();
		driver.findElement(By.id("agreed")).click();
		driver.findElement(By.id("username")).sendKeys("zakir11");

		driver.findElement(By.id("email")).sendKeys("zakir@gmail.com");
		driver.findElement(By.id("new_password")).sendKeys("password");
		driver.findElement(By.id("password_confirm")).sendKeys("password");


		Scanner scan = new Scanner(System.in);
		System.out.println("Enter captcha");
		String captcha = scan.nextLine();

		Thread.sleep(3000);		
		driver.findElement(By.name("submit")).click();

		try {
			
		
		String confirmationMessage = driver.findElement(By.tagName("h2")).getText();
		
		if(confirmationMessage.contains("Your account has been created.")) {
			System.out.println("successfully logged in - passed");
		}
		}catch(NoSuchElementException exp1)
		
		{
			System.out.println("Failed - not succesfully logged in");
		}
	}

}
