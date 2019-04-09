package selenium.object.elements.learning;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingImage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Samsung\\Desktop\\Selenium_Training\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.seleniumhq.org/");
		
		WebElement seleniumImage = driver.findElement(By.xpath("//img[@alt='Selenium Logo']"));
		
		String getLogoName = seleniumImage.getAttribute("alt"); //Take alternative text for the image to validate the image
		System.out.println(getLogoName);
		
		driver.navigate().to("http://newtours.demoaut.com/");
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();
		
		//driver.quit();
		
	}

}
