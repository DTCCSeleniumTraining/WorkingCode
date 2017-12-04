package week2.day5;

import java.io.File;
import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class LearnExcel {
	
	public String[][] readExcel(String fileName) throws InvalidFormatException, IOException {
		File src = new File("./reports/"+fileName+".xlsx");
		XSSFWorkbook wBook = new XSSFWorkbook(src);
		XSSFSheet sheet = wBook.getSheetAt(0);
		int rowCount = sheet.getLastRowNum();
		int columnCount = sheet.getRow(0).getLastCellNum();
		String[][] data = new String[rowCount][columnCount];
		System.out.println("Row Count: "+rowCount);
		System.out.println("Column Count: "+columnCount);
		for (int i = 1; i <= rowCount; i++) {
			XSSFRow row = sheet.getRow(i);
			for (int j = 0; j < columnCount; j++) {
			XSSFCell cell = row.getCell(j);
				 data[i-1][j] = cell.getStringCellValue();
				System.out.println(data);
			}
		}
		wBook.close();
		return data;
	}
}
