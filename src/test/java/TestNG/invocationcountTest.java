package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class invocationcountTest {
	
		
		@Test(invocationCount = 2)
		public void demo1()
		{
			Reporter.log("demo1",true);
		}
		@Test(invocationCount = 1)
		public void demo2()
		{
			Reporter.log("demo2",true);
		}
		@Test(invocationCount = 0)
		public void demo3()
		{
			Reporter.log("demo3",true);
		}
		@Test(invocationCount = -2)
		public void demo4()
		{
			Reporter.log("demo4",true);
		}
	

}
