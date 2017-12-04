package week2.day5;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class ReadExcel {
	
	@Test
	public void readExcel() throws InvalidFormatException, IOException {
		FileInputStream src = new FileInputStream("./reports/InputFile.xlsx");
		XSSFWorkbook wBook = new XSSFWorkbook(src);
		XSSFSheet sheet = wBook.getSheetAt(0);
		int rowCount = sheet.getLastRowNum();
		int columnCount = sheet.getRow(0).getLastCellNum();
		System.out.println("Row Count: "+rowCount);
		System.out.println("Column Count: "+columnCount);
		
		XSSFRow row = sheet.getRow(0);
		XSSFCell cell = row.createCell(columnCount);
		cell.setCellValue("Result");
		for (int i = 1; i <= rowCount; i++) {
			row = sheet.getRow(i);
			row.createCell(columnCount).setCellValue("PASS");
		}
		try {
			FileOutputStream file =new FileOutputStream("./reports/InputFile.xlsx");
			wBook.write(file);
			wBook.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}
