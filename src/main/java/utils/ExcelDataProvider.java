package utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;

public class ExcelDataProvider {
	FileInputStream fis = null;
	XSSFWorkbook book = null;
	XSSFSheet sheet=null;
	XSSFRow row = null;
	XSSFCell cell = null;
	Object[][] excelData = null;

	public Object[][] ReadExcel(String filePath,String sheetName) throws IOException {

		fis = new FileInputStream(filePath);
		book = new XSSFWorkbook(fis);
		sheet = book.getSheet(sheetName);

		int row = sheet.getLastRowNum();
		int column = sheet.getRow(0).getLastCellNum();
		excelData = new Object[row][column];

		for (int i=1;i<=row;i++) {
			for(int j=0;j<column;j++) {
				System.out.println(excelData [i-1][j] = sheet.getRow(i).getCell(j).getStringCellValue());
				excelData [i-1][j] = sheet.getRow(i).getCell(j).getStringCellValue();

			}

		}
		fis.close();
		book.close();
		return excelData;
	}

	
	

}
