package TestNgDemo;

import org.testng.annotations.Test;

public class Dependson {
	
	@Test
	public void openurl() {
		System.out.println("open browser");
	}
	@Test(dependsOnMethods="operurl")
	public void vrifylogin() {
		System.out.println("logn passed");
	}

}
