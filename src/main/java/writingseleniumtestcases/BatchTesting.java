package writingseleniumtestcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BatchTesting {

	public static WebDriver driver;
	static String url3;

	//Launch browser
	public void LaunchBrowser() {

		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

	}

	//Close Browser
	public void CloseBrowser() {
		driver.close();
	}

	//Admin Login
	public void AdminLogin(String uName, String password) {
		driver.get("http://www.gcrit.com/build3/admin/");
		driver.findElement(By.name("username")).sendKeys(uName);
		driver.findElement(By.name("password")).sendKeys(password);
		driver.findElement(By.id("tdb1")).click();
	}


	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//Data driven testing - running single test cases with multiple set of test data
		//Batch Testing - executing series of test cases with one set of test data
		//with or without framework - batch testing can be done. But best practice is using framework only

		/*
		 *simple batch testing example without framework
		 *Test case1 - Verify admin login (positive test case)
		 *Test case 2 - verify "Error message" in admin login functionality(negative test case)
		 *Test case 3 - Verify redirect functionality(admin to user interface after login)

		 Steps:
		 1. Select test cases
		 2. Identify the common steps or common functionality among test cases
		 3. create test cases using reusable components
		 4. execute the test batch

		 Reusable components(functions/methods)
		 1. Launch browser
		 2. admin login
		 3. close browser

		 selenium webdriver test batch
		 */
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Samsung\\Desktop\\Selenium_Training\\chromedriver.exe");
		BatchTesting obj = new BatchTesting();

		//test case 1 - verify admin login
		obj.LaunchBrowser();
		obj.AdminLogin("admin", "admin@123");
		String url = driver.getCurrentUrl();
		if(url.contains("http://www.gcrit.com/build3/admin/index")) 
		{
			System.out.println("Test case1: admin login successfully passed");
		}
		else {
			System.out.println("Test case1: admin login unsuccesful");
		}
		obj.CloseBrowser();

		//Test case2 - verify error message // Negative scenario
		obj.LaunchBrowser();
		obj.AdminLogin("abcdef", "hdhd");
		String errorMessage = driver.findElement(By.className("messageStackError")).getText();
		if(errorMessage.contains("Error: Invalid administrator login attempt.")) {
			System.out.println("Test case2 -- Admin login is unsuccessful and showing correct error message -- passed");
		}
		else
		{
			System.out.println("Testcase 2 -- Admin login not showing error message -- Failed");
		}
		obj.CloseBrowser();

		//Testcase 3: Verify redirect functionality(Admin to user interface after login
		obj.LaunchBrowser();
		obj.AdminLogin("admin", "admin@123");
		String url2 = driver.getCurrentUrl();
		
		if(url2.contains("http://www.gcrit.com/build3/admin/index")) {
			driver.findElement(By.linkText("Online Catalog")).click();
			Thread.sleep(3000);
			url3 = driver.getCurrentUrl();
		}
		if(url3.contains("http://www.gcrit.com/build3/")) {
			System.out.println("Test case3 -- Redirecting from admin to user interface -- Passed");
		}
		else
		{
			System.out.println("Test case3 -- No redirecting from admin to user interface -- failed");
		}
		obj.CloseBrowser();
	}

}
