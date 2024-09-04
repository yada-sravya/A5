package check;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Saddlepoint {
	public static void main(String[] args) throws IOException {
		FileInputStream f = new FileInputStream("./src/test/resources/data.properties");
		Properties property = new Properties();
		property.load(f);
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(property.getProperty("url"));
		long time = Long.parseLong(property.getProperty("timeouts"));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(time));
		
		driver.findElement(By.id("first_field")).sendKeys(property.getProperty("user2"));
		driver.findElement(By.id("second_field")).sendKeys(property.getProperty("password"));
		driver.findElement(By.xpath("//button[text()='LOGIN']")).click();
		
		driver.findElement(By.id("s7tXg5")).click();
		driver.findElement(By.id("tOAYg5")).click();
	

		
		
        
	
		
	}

}
