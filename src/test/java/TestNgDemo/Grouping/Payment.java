package TestNgDemo.Grouping;

import org.testng.annotations.Test;

public class Payment {
	@Test(priority = 1, groups = { "sanity","regression"})
	public void paymentInr() {
		System.out.println(" in ruppees");
	}

	@Test(priority = 1, groups = { "sanity","regression"})
	public void paymentDollar() {
		System.out.println(" in dollars");
	}
}
