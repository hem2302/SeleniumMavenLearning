package selenium.object.elements.learning;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingCheckBox {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		//Actions - Select(Click), Unselect(Click)
		//Verification commands - isSelected, isDisplayed, isEnabled
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Samsung\\Desktop\\Selenium_Training\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.gcrit.com/build3/create_account.php?osCsid=o2c1hs0aiqa7gt9h9mlb349tr3");
		
		
		WebElement newsLetterCheckBox = driver.findElement(By.name("newsletter"));
		
		boolean checkBoxStatus = newsLetterCheckBox.isDisplayed();
		System.out.println("Displayed status -- "+ checkBoxStatus);//true
		
		checkBoxStatus = newsLetterCheckBox.isEnabled();
		System.out.println("Enabled status -- "+ checkBoxStatus);//true
		
		newsLetterCheckBox.click();
		
		Thread.sleep(3000);
		
		checkBoxStatus = newsLetterCheckBox.isSelected();//true
		System.out.println("Selected Status -- "+ checkBoxStatus);
		
		newsLetterCheckBox.click();

		checkBoxStatus = newsLetterCheckBox.isSelected();//false
		System.out.println("Selected Status -- "+ checkBoxStatus);
		
		driver.quit();
	}

}
