package week2.day5;

import java.io.FileOutputStream;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class ExcelWrite {
	
	@Test
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

		//data.length
		
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
			FileOutputStream file =new FileOutputStream("./reports/writeExcel.xlsx");
			wBook.write(file);
			wBook.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
