package writingseleniumtestcases;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCase7 {
	public static WebDriver driver;
	static String errorMessage;
	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		/*
		 Write a testcase for admin login locking functionality
		 Business rule: It has to lock admin login functionality for 5 minutes after 3 invalid attempts

		Test Steps:
		launch browser, navigate to gcrshop admin unserinterface
		Enter username
		enter password
		click login button

		Verification points
		capture the error message and compare with expected for 4 times

		Data driven test data
		Ref: input.txt

		expected output after 3 failed iterations
		error Error Error: The maximum number of login attempts has been reached. Please try again in 5 minutes.

		 */
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Samsung\\Desktop\\Selenium_Training\\chromedriver.exe");
		FileReader file = new FileReader("C:\\Users\\Samsung\\Desktop\\input.txt");
		BufferedReader br = new BufferedReader(file);
		int count = 0;
		int iteration = 0;
		String line;

		while((line=br.readLine()) != null){
			count++;

			if(count>1) {

				iteration++;
				String[] inputData = line.split(", ", 2);

				driver = new ChromeDriver();
				driver.manage().window().maximize();
				driver.get("http://gcrit.com/build3/admin/");
				driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

				driver.findElement(By.name("username")).sendKeys(inputData[0]);
				driver.findElement(By.name("password")).sendKeys(inputData[1]);
				driver.findElement(By.id("tdb1")).click();
				Thread.sleep(3000);
				errorMessage = driver.findElement(By.className("messageStackError")).getText();
				
				if((iteration == 4) && ((errorMessage.contains("Error: The maximum number of login attempts has been reached")))){
				System.out.println(iteration+" - Maximum nuber of login attemps has been reached -- passed");	
				}
				else
				{
					System.out.println(iteration+"maximum number of login attempts not over -- Done");
				}
				driver.close();
			}
		}
		
		br.close();
		file.close();
	}

}
