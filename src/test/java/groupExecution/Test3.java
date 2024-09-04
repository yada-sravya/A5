package groupExecution;

import org.testng.annotations.Test;

public class Test3 {
	@Test(groups = "regression")
	public void test1()
	{
		System.out.println("Test3- test1 - regression");
	}
	
	@Test(groups = "regression")
	public void test2()
	{
		System.out.println("Test3- test2 - sanity");
	}
	
	@Test(groups = "regression")
	public void test3()
	{
		System.out.println("Test3- test3 - regression and sanity");
	}

}
