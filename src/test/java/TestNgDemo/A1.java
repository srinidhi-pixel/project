package TestNgDemo;

import org.testng.Assert;
import org.testng.annotations.Test;

public class A1 {
//@Test
//public void m1() {
//	Assert.assertEquals("adi", "adi");
//	System.out.println("test passed ");
//}
	@Test
	public void m1() {
		Assert.assertNotEquals("adi", "aditya");
		System.out.println("passed");
	}
}
