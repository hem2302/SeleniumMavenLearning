package selenium.object.elements.learning;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnTextArea {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub


		//labels = text area

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Samsung\\Desktop\\Selenium_Training\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://accounts.google.com/signin/v2/identifier?continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&service=mail&sacu=1&rip=1&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
		driver.manage().window().maximize();
		
		//get text area(label)
		String textArea = driver.findElement(By.id("headingSubtext")).getText();
		System.out.println(textArea);
		
		//get attribute of email or phone(placeholder)
		String aa =  driver.findElement(By.id("identifierId")).getAttribute("aria-label");
		System.out.println(aa);
		
		//get error message
		driver.findElement(By.id("identifierNext")).click();
		String errorMsg = driver.findElement(By.xpath("//*[@id='view_container']/div/div/div[2]/div/div[1]/div/form/content/section/div/content/div[1]/div/div[2]/div[2]/div")).getText();
		System.out.println(errorMsg);	

		Thread.sleep(3000);
		
		//verify error message equals actual-expected
		if(errorMsg.equals("Enter an email or phone number")) {
			System.out.println("pass");
		}
		else
			System.out.println("fail");

		driver.quit();

	}

}
