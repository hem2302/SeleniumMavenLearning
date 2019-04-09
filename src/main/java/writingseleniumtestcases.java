import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class writingseleniumtestcases {

	public static void GetRowCount() {

		try {
			String projectpath = System.getProperty("user.dir");
			XSSFWorkbook book = new XSSFWorkbook(projectpath+"excel\\Testdata.xlsx\\Testdata.xlsx");
			XSSFSheet sheet = book.getSheet("Sheet1");
			int rowCount = sheet.getPhysicalNumberOfRows();
			System.out.println("Row count: "+ rowCount);

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	
	public static void GetCellData() {
		
		try {
			String projectpath = System.getProperty("user.dir");
			XSSFWorkbook book = new XSSFWorkbook(projectpath+"excel/Testdata.xlsx");
			XSSFSheet sheet = book.getSheet("Sheet1");
			String stringCellData = sheet.getRow(0).getCell(0).getStringCellValue();
			System.out.println("Row count: "+ stringCellData);

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	
	
	public static void main(String[]args) {
		GetCellData();
		GetRowCount();
		
	}
	}


