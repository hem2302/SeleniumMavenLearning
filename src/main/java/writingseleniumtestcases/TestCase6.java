package writingseleniumtestcases;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCase6 {

	public static WebDriver driver;
	static String errorMessage;
	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		/*
		Scenario:
	 	Data driven testing for Admin login in gcrshop Admin Interface by reading test data from a text file(from resources)

		Enter username
		enter password
		click login button
		
		Verification point
		1. capture the current url after login to application and compare with expected
		2. verify error message and compare with expected message if login is unsuccessful
		
		expected result
		1. https://www.gcrit.com/build3/admin/index.php
		2. "Error: Invalid administrator login attempt
		
		Input data
		1. Test data for positive scenario
		a. username = admin
		b. password = admin@123
		
		2. negative scenario test data
		a. username = abcdef
		b. password = admin@123
		 */
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Samsung\\Desktop\\Selenium_Training\\chromedriver.exe");

		FileReader file = new FileReader("C:\\Users\\Samsung\\Desktop\\input.txt");
		BufferedReader br = new BufferedReader(file);

		String line;
		int count = 0;
		int iteration = 0;
		

		while((line = br.readLine())!= null) {
			count = count+1;

			if(count>1) {
				iteration = iteration+1;

				String[] inputData = line.split(", ", 2);


				driver = new ChromeDriver();
				driver.manage().window().maximize();
				driver.get("http://gcrit.com/build3/admin/");
				driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

				driver.findElement(By.name("username")).sendKeys(inputData[0]);
				driver.findElement(By.name("password")).sendKeys(inputData[1]);
				driver.findElement(By.id("tdb1")).click();
				Thread.sleep(3000);
				String url = driver.getCurrentUrl();
				
				if(!url.contains("http://www.gcrit.com/build3/admin/index.php")) {
					errorMessage = driver.findElement(By.className("messageStackError")).getText();
					System.out.println(iteration+ "--" + errorMessage);
				}
				
				if(url.contains("http://www.gcrit.com/build3/admin/index")) {
					System.out.println(iteration+" - admin login is successful -- passed");
				}
				else if (errorMessage.contains("Error: Invalid administrator login attempt.")){
					System.out.println(iteration+" - admin login is not unsuccesful, but showing correct error message -- passed");
				}
				else
				{
					System.out.println(iteration+" Admin login is unsuccessful and not showing correct error message -- failed");
				}
				driver.close();
			}
		}
		
		br.close();
		file.close();
	}
}