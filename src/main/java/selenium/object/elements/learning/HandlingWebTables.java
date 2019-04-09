package selenium.object.elements.learning;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingWebTables {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/* check displayed status
		 * return a cell value
		 * return rows count
		 * return cells count
		 * return columns count
		 * Static and WebTable
		 */



		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Samsung\\Desktop\\Selenium_Training\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		boolean displayedStatus = driver.findElement(By.id("customers")).isDisplayed();
		System.out.println(displayedStatus);
		WebElement customerTable = driver.findElement(By.id("customers"));
		List<WebElement> rows = customerTable.findElements(By.tagName("tr")); // to take rows count, take tr
		int rowcount = rows.size();
		System.out.println("row count - "+rowcount);
		List<WebElement> cells = customerTable.findElements(By.tagName("td"));// to take columns count take td
		int cellcount = cells.size();
		System.out.println("cell count - "+cellcount);
		for(WebElement cellvalue:cells) {
			
			System.out.println(cellvalue.getText());
		}
		//column count = cells/rows

		int columncount = cellcount/rowcount;
		System.out.println("column count - "+columncount); //no direct method for column count

		//print cell value
		System.out.println(driver.findElement(By.xpath("//*[@id=\'customers\']/tbody/tr[2]/td[1]")).getText());
	}

}
