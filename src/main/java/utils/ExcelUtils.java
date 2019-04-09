package utils;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtils {


	static String projectPath;
	static XSSFWorkbook book;
	static XSSFSheet sheet;



	public ExcelUtils(String projectPath, String sheetname) {

		try {
			book = new XSSFWorkbook(projectPath);
			sheet = book.getSheet(sheetname);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	public static int GetRowCount()  {

		int rowCount = sheet.getPhysicalNumberOfRows();
		//System.out.println("Rowcount "+rowCount);
		return rowCount;
	}

	public static int GetColumnCount()  {

		int columnCount = sheet.getRow(0).getPhysicalNumberOfCells();
		//System.out.println("Rowcount "+columnCount);
		return columnCount;

	}
	public static String GetStringCellData(int rownum, int columnnum) {

		String stringCellData = sheet.getRow(rownum).getCell(columnnum).getStringCellValue();
		//System.out.println("String cell data: "+stringCellData);
		return stringCellData;
	}

	public static double GetNumberCellData(int rownum, int columnnum) {

		double numericCellData = sheet.getRow(rownum).getCell(columnnum).getNumericCellValue();
		//System.out.println("Number cell data: "+numericCellData);
		return numericCellData;

	}
}
