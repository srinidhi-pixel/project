package TestNgDemo;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestAnotations {
   
	
	@BeforeTest
	public void beforetest() {
		System.out.println("from before test");
	}
	@BeforeMethod
	public void beforemethod() {
		System.out.println("before methood");
	}
	@AfterTest
	public void afterTest() {
		System.out.println("after test");
	}
	 @AfterMethod
	public void aftermethod() {
		System.out.println("aftermethod");
		
	}
	
	@Test
	public void m1() {
		System.out.println("from test");
	}
	@Test
	public void m2() {
		System.out.println("from testm2");
	}

}
