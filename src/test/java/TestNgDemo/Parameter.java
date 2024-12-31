package TestNgDemo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parameter {
	WebDriver driver;
	@Parameters({"browser"})
	@BeforeClass
	void openApp(String br) {
		switch(br) {
         case"chrome":	driver=new ChromeDriver();
         break;
         case"firefox": driver= new FirefoxDriver();
         break;
         case"edge":driver= new EdgeDriver();
         break;
         default:System.out.println("Invalid browser");
		}
		}
		
		
	@Test
	void login() {
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
       String actual = driver.findElement(By.xpath("//*[text()='Dashboard']")).getText();
         String expected = "Dashboard";
         Assert.assertEquals(actual, expected );
	}
	@AfterClass
	void closeApp() {
		driver.close();
	}

}
