package TestNgDemo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class DataProvider {
	WebDriver driver ;
	@BeforeClass
	void launchbrowser() {
   driver = new ChromeDriver();
	
		driver.manage().window().maximize();
		}
	
	
	@Test(dataProvider="loginData")
	void  openWebsite_Login(String username,String password) {
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys(username);
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys(password);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
       String actual = driver.findElement(By.xpath("//*[text()='Dashboard']")).getText();
         String expected = "Dashboard";
         Assert.assertEquals(actual, expected );
}
	
	@org.testng.annotations.DataProvider
Object [][] loginData() {
		
		      
	Object data[][]= {{"Admin","admin123"}, {"Admin","admin12345"},{"Adi","admin123"},{"Aditya","admin123@"} };
	return data;
	}
	
	
	
	
	
	@AfterClass
	void closewebsite() {
	     driver.close();	
	}
}
