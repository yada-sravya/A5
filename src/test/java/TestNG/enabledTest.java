package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class enabledTest {
	
	@Test(invocationCount = -2)
	public void demo1()
	{
		Reporter.log("demo1",true);
	}
	@Test(enabled=false)
	public void demo2()
	{
		Reporter.log("demo1",true);
	}
	@Test
	public void demo3()
	{
		Reporter.log("demo1",true);
	}

}
