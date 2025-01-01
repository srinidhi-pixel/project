package TestNgDemo;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BaseClass {
	@BeforeClass
	public void beforeclass() {
		System.out.println("before class");
	}
	
	@AfterClass // runs only once
	public void afterClass() {
		System.out.println("after class");
	}
	@AfterMethod
	public void AfterMethod() {
		System.out.println("from aftrmethod");
	}
	
	@BeforeMethod // this run 2 times
	public void BeforeMetod() {
		System.out.println("from bfrmethod");
	}
	
	//@test acts as amain method after this only all method will run actual implementation 
	@Test
	public void m1() {
		System.out.println(" from m1");
		
	}
	@Test
	public void m2() {
		System.out.println(" from m2");
		
	}

}
