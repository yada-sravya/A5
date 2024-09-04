package DataDrivenTesting;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFWorkbookFactory;

public class ReadDataFromExcelUsingMetodChianing {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream fis = new FileInputStream("./src/test/resources/testdata.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
	double data = wb .getSheet("Sheet1").getRow(2).getCell(1).getNumericCellValue();
		System.out.println(data);
		wb.close();
	}

}
