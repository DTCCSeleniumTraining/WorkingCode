package week2.day5;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class UpdateExcel {
	
	@Test
	public void readExcel() throws InvalidFormatException, IOException {
		FileInputStream src = new FileInputStream(new File("./reports/InputFile.xlsx"));
		XSSFWorkbook wBook = new XSSFWorkbook(src);
		XSSFSheet sheet = wBook.getSheetAt(0);
		int rowCount = sheet.getLastRowNum();
		int columnCount = sheet.getRow(0).getLastCellNum();
		System.out.println("Row Count: "+rowCount);
		System.out.println("Column Count: "+columnCount);
		XSSFRow row = sheet.getRow(0);
		XSSFCell cell = row.createCell(columnCount);
		cell.setCellValue("Result");
		FileOutputStream fos = new FileOutputStream(new File("./reports/InputFile.xlsx"));
		wBook.write(fos);
		wBook.close();
		fos.close();
	}
}