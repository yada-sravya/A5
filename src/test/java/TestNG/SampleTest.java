package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class SampleTest {
	@Test
	public void test0()
	{
		Reporter.log("Hello World",true);
	}

}
