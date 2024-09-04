package POM;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginToFBTest {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(0));
		
		LoginFBPage l = new LoginFBPage(driver);
		l.setEmail("qwefghjbv");
		l.setPassword("asdfghjjjh");
		l.clicklogin(); 
		
		Thread.sleep(2000);
		driver.quit();
		
		
		
		
	}

}
