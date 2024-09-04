package DataDrivenTesting;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.HashMap;
import java.util.Map;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ReadFromExcel {
public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {
	FileInputStream f = new FileInputStream("./src/test/resources/testdata.xlsx");
	Workbook wb = WorkbookFactory.create(f);
	Sheet sheet = wb.getSheet("Sheet1");
	Map<String,String> map = new HashMap<String,String>();
	DataFormatter df = new DataFormatter();
	
    
	for(int i=0;i<=sheet.getLastRowNum();i++)
	{
		String key  = df.formatCellValue(sheet.getRow(i).getCell(0));
		String value =df.formatCellValue(sheet.getRow(i).getCell(1));
		map.put(key, value);
		
	}
	System.out.println(map);
	wb.close();
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get(map.get("url"));
	
	long time = Long.parseLong(map.get("timeouts"));
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(time));
	driver.findElement(By.name("email")).sendKeys(map.get("username"));
	Thread.sleep(2000);
	driver.findElement(By.id("password")).sendKeys(map.get("password"));
	Thread.sleep(2000);
	driver.findElement(By.id("last")).click();
	
	Thread.sleep(2000);
	driver.quit();
	
}
	
}

