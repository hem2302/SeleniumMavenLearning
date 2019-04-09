package writingseleniumtestcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCase8 {

	static String userName, password;
	static int iteration = 0;
	static WebDriver driver;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 *Write a test case for positive and negative testing for admin login
 Exeucte the test case for two iterations(one is positive, another is nagtive)
 Note: 
		 *Dont use data driver testing
		 *No multiple iterations(single iteration only)

 Test steps
 1. Launch Browser
 2. Navigate to gcr shop admin interface
 3. Enter username
 4. enter password
 5. click login button

 Expected url: http://www.gcrit.com/build3/admin/index.php
 Expected test result:
 1. Login should pass(positive)
 2. login should fail(negative)

 input 1: username = admin, password admin@123 - Valid
 Input 2: username = abcdef, password = 12345 - invalid
		 *
		 */

		for(int i=1;i<=2;i++) {
			iteration++;
			if(i==1) {
				userName = "admin";
				password = "admin@123";
			}
			else if(i==2) {
				userName = "dhfhf";
				password = "hfhfhf";
			}
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Samsung\\Desktop\\Selenium_Training\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("http://gcrit.com/build3/admin/");
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

			driver.get("http://www.gcrit.com/build3/admin/");
			driver.findElement(By.name("username")).sendKeys(userName);
			driver.findElement(By.name("password")).sendKeys(password);
			driver.findElement(By.id("tdb1")).click();

			String url = driver.getCurrentUrl();

			if(url.contains("http://www.gcrit.com/build3/admin/index.php")) {
				System.out.println(iteration+"Admin login is successfull - passed");

			}
			else
			{
				System.out.println(iteration+"Admin login unsuccessful -- failed");
			}
			driver.close();
		}
	}

}
