package distributedParallel;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Test5 {
	public void demo1() {
		System.out.println("Test5- demo1");
	}
	@Test
	public void demo2() {
		System.out.println("Test5- demo2");
		Assert.fail();
	}

}
