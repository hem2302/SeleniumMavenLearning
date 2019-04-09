package writingseleniumtestcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCase1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
/*		Test case 1

		verify internal and external links in selenium wikipedia.org

		steps:
		launch browser
		navigate to https://en.wikipedia.org/wiki/Selenium_(software). 
		click create account link
		capture the current url
		navigate back to selenium page
		click seleniumhq.org link
		capture the current url
		close the browser window
		--------------------------------
		verification points
		i) verify if the first url is an internal link
		ii)verify if the second url is an external link
		---------------------------
		input/test data for this test case
		NA
		-----------------------------
		expected REsult
		1st url contains - wikipedia.org
		2nd url not contains wikipedia.org
*/
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Samsung\\Desktop\\Selenium_Training\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://en.wikipedia.org/wiki/Selenium_(software)");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.findElement(By.linkText("Create account")).click();
		Thread.sleep(3000);
		
		String urll = driver.getCurrentUrl();
		//System.out.println(urll);
		if(urll.contains("wikipedia.org")) {
			System.out.println("1st verification - wikipedia.org is present - it is an internal link - Passed");
		}
		else
			System.out.println("1st verification - wikipedia.org not present.. It is an external link - failed");
		
		driver.navigate().back();
		driver.findElement(By.partialLinkText("seleniumhq")).click();
		
		String url2 = driver.getCurrentUrl();
		
		if(!url2.contains("wikipedia.org")) {
			System.out.println("2nd verification - It is external link - passed");
		}
		else
			System.out.println("2nd verification - It is internal link - failed");
		
		
		driver.quit();
	}

}
