package TestNgDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import junit.framework.Assert;

public class VerifyErrorMessageDemo {
	
	@Test
	public void verifyErrorMessage() {
		
	WebDriver driver = new ChromeDriver();
	driver.get("https://login.salesforce.com/");
	driver.findElement(By.id("username")).sendKeys("admin");
	driver.findElement(By.xpath("//*[@type='password']")).sendKeys("admin123");
	driver.findElement(By.id("Login")).click();
	String expectedErrorMessage="Please check your username and password. If you still can't log in, contact your Salesforce administrator.";
		String actualmsg = driver.findElement(By.id("error")).getText();
		Assert.assertEquals(expectedErrorMessage,actualmsg);
		
		System.out.println("passed!!");
	}

}
