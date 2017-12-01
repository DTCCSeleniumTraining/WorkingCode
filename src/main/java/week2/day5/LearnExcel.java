package week2.day5;

import java.io.File;
import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class LearnExcel {
	
	@Test
	public void readExcel() throws InvalidFormatException, IOException {
		
		File src = new File("./reports/CreatedExcel.xlsx");
		XSSFWorkbook wBook = new XSSFWorkbook(src);
		XSSFSheet sheet = wBook.getSheetAt(0);
		int rowCount = sheet.getLastRowNum();
		int columnCount = sheet.getRow(0).getLastCellNum();
		for (int i = 1; i <= rowCount; i++) {
			//XSSFRow row = sheet.getRow(i);
			
			for (int j = 0; j < columnCount; j++) {
			//	XSSFCell cell = row.getCell(j);
				//String data = cell.getStringCellValue();
				String data = sheet.getRow(i).getCell(j).getStringCellValue();
				System.out.println(data);
			}
		}
		wBook.close();
	}
}
