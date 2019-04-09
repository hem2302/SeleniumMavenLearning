package selenium.object.elements.learning;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnAlert {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Samsung\\Desktop\\Selenium_Training\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		//open rediff page
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		driver.findElement(By.name("proceed")).click();
		
		//Create Alert object to handle Alert
		Alert popUp = driver.switchTo().alert();
		String popUpName = popUp.getText();
		System.out.println("Popup error message is: "+popUpName);
		
		Thread.sleep(3000);
		popUp.accept();

	}

}
