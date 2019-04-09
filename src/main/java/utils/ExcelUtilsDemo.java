package utils;

public class ExcelUtilsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String projectPath = System.getProperty("user.dir");
		ExcelUtils excel = new ExcelUtils(projectPath + "\\excel\\Testdata.xlsx", "Sheet1");
		excel.GetNumberCellData(1, 1);
		excel.GetStringCellData(0, 0);
		excel.GetRowCount();

	}

}
