package DataDrivenTesting;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class WriteToExcel {
public static void main(String[] args) throws IOException {
	FileInputStream fis = new FileInputStream("./src/test/resources/testdata.xlsx");
	Workbook wb = WorkbookFactory.create(fis);
	Sheet sheet = wb.getSheet("Sheet1");
	
	sheet.createRow(5).createCell(0).setCellValue("user2");
	sheet.getRow(5).createCell(1).setCellValue("asdfg");
	
	FileOutputStream fos = new FileOutputStream("./src/test/resources/testdata.xlsx");
	wb.write(fos);
	
	wb.close();
	
	
}
}
