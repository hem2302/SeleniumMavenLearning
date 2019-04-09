package selenium.object.elements.learning;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingFrames {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//HTML frames are used to divide the multiple windows into multiple sections.
		//each section can load a seperate HTML document
		//First we need to switch to frame from top window and  then access elements from frame
		//Switch from top window to frame in two ways
		//using frame index or frame id or name

		//using frame index = driver.switchTo().frame(index);//index is int
		//using frame name or id = driver.switchTo.frame(id or name);//id or name is string
		//cannot switch directly from one frame to another frame. for that go to top window first and move to another frame

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Samsung\\Desktop\\Selenium_Training\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://seleniumhq.github.io/selenium/docs/api/java/index.html");
		//using index
		driver.switchTo().frame(2);
		Thread.sleep(3000);
		//using frame name
		//driver.switchTo().frame("ClassFrame");
		driver.findElement(By.linkText("org.openqa.selenium")).click();
		
		driver.switchTo().defaultContent();
		driver.switchTo().frame(0);
		
		Thread.sleep(3000);
		driver.findElement(By.linkText("com.thoughtworks.selenium")).click();
		
		driver.switchTo().defaultContent();
		
		Thread.sleep(3000);
		driver.switchTo().frame(1);
		driver.findElement(By.linkText("Actions")).click();
		
		driver.quit();
		

	}

}
