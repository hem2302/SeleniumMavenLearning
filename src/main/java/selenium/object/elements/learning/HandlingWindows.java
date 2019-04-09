package selenium.object.elements.learning;

import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingWindows {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Samsung\\Desktop\\Selenium_Training\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://bank.barclays.co.uk/olb/authlogin/loginAppContainer.do#/identification");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		String parentWindow = driver.getWindowHandle();
		System.out.println(parentWindow);
		driver.findElement(By.linkText("Service status")).click();
		driver.findElement(By.linkText("Contact us")).click();
		driver.findElement(By.linkText("Security")).click();
		Set<String> allWindows = driver.getWindowHandles();
		int size = allWindows.size();
		
		ArrayList<String> tabs = new ArrayList<>(allWindows);//convert set to list
		driver.switchTo().window(tabs.get(2));
		driver.close();
		
		/*for(String child:allWindows) {
			if(!parentWindow.equalsIgnoreCase(child)) {
				driver.switchTo().window(child);
				System.out.println(driver.getTitle());
				driver.close();
			}
		}*/
	}
}

