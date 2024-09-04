package crossBrowser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;


public class BaseClass {
	WebDriver driver ;
	@Parameters("BROWSER")
	@BeforeClass
	public void classconfig(String browser)
	{ 
		if(browser.equalsIgnoreCase("chrome"))
		{
			driver= new ChromeDriver();
			System.out.println("chrome");
			
		}
		else if(browser.equalsIgnoreCase("firefox"))
		{
			driver =new FirefoxDriver();
			System.out.println("Firefox");
			
		}
		else if(browser.equalsIgnoreCase("edge"))
		{
			driver=new EdgeDriver();
			System.out.println("Edge");
		}
		else
			System.out.println("invalid browser info");
		driver.manage().window().maximize();
	}
	@AfterClass
	public void classDEconfig()
	{
		driver.quit();
	}
	

}
