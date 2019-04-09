package selenium.object.elements.learning;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandlingDropDown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		/* Check displayed Status
		   Check Enabled Status
		   Select an Item
		   Return Items

		 */

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Samsung\\Desktop\\Selenium_Training\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.gcrit.com/build3/create_account.php?osCsid=o2c1hs0aiqa7gt9h9mlb349tr3");
		WebElement countryDropDown = driver.findElement(By.name("country"));

		boolean DropDownDisplayedStatus = countryDropDown.isDisplayed();
		System.out.println(DropDownDisplayedStatus);//true
		DropDownDisplayedStatus = countryDropDown.isEnabled();
		System.out.println(DropDownDisplayedStatus);//true

		Select dropDown = new Select(countryDropDown);
		dropDown.selectByIndex(2);
		dropDown.selectByValue("200");
		dropDown.selectByVisibleText("India");

		//get all the options from dropdown list
		List<WebElement> optionsList = dropDown.getOptions();
		System.out.println(optionsList.size());

		//get all the links from the page
		List<WebElement> allLinks = driver.findElements(By.tagName("a"));



		/*for(WebElement links:allLinks) {
			System.out.println(links.getText());
			//links.getAttribute("type");
			//links.click();
			//Thread.sleep(4000);

		}*/


		//print all the options one by one using for loop
		for (int i=0;i<optionsList.size();i++)
		{
			System.out.println(optionsList.get(i).getText());
		}

		//print all the links one by one using for loop
		for (int i=0;i<allLinks.size();i++)
		{
			System.out.println(allLinks.get(i).getText());
		}


		driver.quit();
	}

}
