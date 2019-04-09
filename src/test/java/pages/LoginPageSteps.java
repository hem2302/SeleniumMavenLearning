package pages;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import utils.ExcelDataProvider;

public class LoginPageSteps {
//added one comment
	//added second comment
	//third comment
	WebDriver driver;
	LoginPage objLoginPage;

	@DataProvider(name = "testData")
	public Object[][] simpleDataProvider() throws IOException{
		ExcelDataProvider excelObj = new ExcelDataProvider();
		return excelObj.ReadExcel("E:/SeleniumMaven/SeleniumMavenLearning/excel/Testdata.xlsx", "Sheet1");
	}
		
	//Start Session
	@BeforeMethod

	public void setup() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Samsung\\Desktop\\Selenium_Training\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://localhost/product/admin/login.php");
	}

	//Check login page successful

	@Test(dataProvider = "testData" , priority = 0)
	public void CheckLoginPageSuccess(String uName, String password) throws InterruptedException {

		objLoginPage = new LoginPage(driver);
		objLoginPage.SetUserName(uName);	
		objLoginPage.SetPassword(password);
		objLoginPage.ClickLoginButton();

		String expectedTitle = driver.getTitle();
		String actualTitle = driver.getTitle();
		Assert.assertEquals(actualTitle, expectedTitle, "Home page title not matching");
		Thread.sleep(3000);
	}


	@AfterMethod
	public void EndSession() {
		driver.quit();
	}
}

