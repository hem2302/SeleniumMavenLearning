package selenium.object.elements.learning;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicWebTable {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Samsung\\Desktop\\Selenium_Training\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.redbus.in/?gclid=EAIaIQobChMI0-zpj4yY4QIVBo3ICh1lBwWpEAAYASAAEgJHjfD_BwE");
		driver.findElement(By.xpath("//*[@id=\'search\']/div/div[3]/div/label")).click();
		Thread.sleep(3000);
	//it will store all the webelements in the list
		
		List<WebElement> dates = driver.findElements(By.xpath("//div[@class = 'rb-calendar']/table//td"));
		System.out.println(dates.size());
		for(int i=0; i<dates.size();i++) {
			String date = dates.get(i).getText();
			if(date.equals("31")) {
				dates.get(i).click();
				break;
			}
		}
		
		driver.quit();
	}

}
