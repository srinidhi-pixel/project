package TestNgDemo;

import org.testng.annotations.Test;

import junit.framework.Assert;

public class A2 {

	@Test
	public void m1() {
		//logo is displayed will returned boolean value that value is passed as an arg to assert true
		Assert.assertTrue(true);
		System.out.println("t");
		Assert.assertFalse(false);
		System.out.println("f");
		
		Assert.assertNull(null);
		Assert.assertNotNull(null);
		
	}
}
