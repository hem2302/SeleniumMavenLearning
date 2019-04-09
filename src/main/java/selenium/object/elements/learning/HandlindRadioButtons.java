package selenium.object.elements.learning;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlindRadioButtons {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		//name gender
		// (//input[@name='gender'])[2]

				System.setProperty("webdriver.chrome.driver", "C:\\Users\\Samsung\\Desktop\\Selenium_Training\\chromedriver.exe");
				WebDriver driver = new ChromeDriver();
				driver.manage().window().maximize();
				driver.get("http://www.gcrit.com/build3/create_account.php?osCsid=o2c1hs0aiqa7gt9h9mlb349tr3");
				WebElement maleRadio = driver.findElement(By.xpath("(//input[@name='gender'])[1]"));
				WebElement femaleRadio = driver.findElement(By.xpath("(//input[@name='gender'])[2]"));
				
				maleRadio.click();
				Boolean maleRadioStatus = maleRadio.isSelected();
				System.out.println("Male radio button Selected Status -- "+ maleRadioStatus);//true
				Thread.sleep(3000);
				
				
				femaleRadio.click();
				Boolean femaleRadioStatus = femaleRadio.isSelected();
				System.out.println("female radio button Selected Status -- "+ femaleRadioStatus);//true
				
				Thread.sleep(3000);
				maleRadioStatus = maleRadio.isSelected();
				System.out.println("Male radio button Selected Status -- "+ maleRadioStatus);//false
				
				
	
				driver.quit();
	}

}
