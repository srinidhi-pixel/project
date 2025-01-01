package TestNgDemo;


import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class BeforeTestdemo {
	
	@BeforeSuite  
	public void befiresuite() {
		System.out.println("bfr suite");
	}
	@BeforeTest
	public void beforetest() {
		System.out.println("bft test");
	}
	@BeforeClass
	public void afterclass() {
		System.out.println("bfr clss");
	}
	
	@BeforeMethod
	public void beforemethod() {
		System.out.println("bfrmethod");
	}
	
	@Test
	
	public void m1() {
		System.out.println("from m1");
	}

}
