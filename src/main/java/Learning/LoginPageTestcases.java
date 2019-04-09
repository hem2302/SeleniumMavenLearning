package Learning;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginPageTestcases {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "D:\\dump\\chrome driver\\chromedriver.exe");
WebDriver driver = new ChromeDriver();
LoginPage login = new LoginPage(driver);
System.out.println(driver);

driver.get("hhhp://www.google.com");
login.TypeUsername("admin");
login.typePassword("password");
login.ClickLoginButton();

String url = driver.getCurrentUrl();
if(url.contains("abcd")) {
	System.out.println("Admin page login successfull");
}
else
	System.out.println("Failed");
	}

}
