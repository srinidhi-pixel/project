package TestNgDemo;


import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;



public class SoftAssertDemo {
	@Test
 void m1() {
	 System.out.println(" i am method");
	// Assert.fail(); //hardasestion
	// Assert.assertEquals(false, true);//hard asert fails
	SoftAssert sa = new SoftAssert();
	sa.assertEquals(1, 2);
	  System.out.println(" i am m1");//this will not execute
	 sa.assertAll();// this will execute
	 
 }

}
