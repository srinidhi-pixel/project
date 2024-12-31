package TestNgDemo;

import org.testng.annotations.Test;

public class Demo {
	@Test
 public void driverLaunch() {
	 System.out.println(" Url launched");
	 }
	@Test
	public void verifyLogin() {
		System.out.println("code to verify login");
	}
	@Test
	public void enterUrl() {
		System.out.println("code to enter url");
	}
}
