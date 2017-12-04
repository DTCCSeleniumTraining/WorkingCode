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
	public void testAllExcelMethods() throws Exception, IOException {
		writeExcel();
		readExcel();
	}
	
	public void writeExcel() {
		String[][] data = new String[3][3];
		data[0][0] = "CName";
		data[0][1] = "FName";
		data[0][2] = "LName";
		
		data[1][0] = "TCS";
		data[1][1] = "Gopi";
		data[1][2] = "P";
		
		data[2][0] = "HCL";
		data[2][1] = "Jai";
		data[2][2] = "P";
		
		XSSFWorkbook wBook = new XSSFWorkbook();
		XSSFSheet sheet = wBook.createSheet("Create Lead");
		int rowCount = 0;
		 for (String[] rowData : data) {
			 XSSFRow row = sheet.createRow(rowCount);
			 int columnCount = 0;
			for (String columnData : rowData) {
				XSSFCell cell = row.createCell(columnCount);
				cell.setCellValue(columnData);
				columnCount++;
			}
			rowCount++;
		}		
		try {
			FileOutputStream file =new FileOutputStream("./reports/TestExcel.xlsx");
			wBook.write(file);
			wBook.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void readExcel() throws InvalidFormatException, IOException {
		FileInputStream src = new FileInputStream("./reports/TestExcel.xlsx");
		XSSFWorkbook wBook = new XSSFWorkbook(src);
		XSSFSheet sheet = wBook.getSheetAt(0);
		int rowCount = sheet.getLastRowNum();
		int columnCount = sheet.getRow(0).getLastCellNum();
		System.out.println("Row Count: "+rowCount);
		System.out.println("Column Count: "+columnCount);
		
		XSSFRow row = sheet.getRow(0);
		XSSFCell cell = row.createCell(columnCount);
		cell.setCellValue("Result");
		for (int i = 1; i <= rowCount+1; i++) {
			if(i<=rowCount) {
			row = sheet.getRow(i);
			row.createCell(columnCount).setCellValue("PASS");
			}
			else {
				row = sheet.createRow(i);
				row.createCell(0).setCellValue("HCL");
				row.createCell(1).setCellValue("Babu");
				row.createCell(2).setCellValue("M");
				row.createCell(3).setCellValue("Pass");
			}
		}
		try {
			FileOutputStream file =new FileOutputStream("./reports/TestExcel.xlsx");
			wBook.write(file);
			wBook.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}
