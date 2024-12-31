package pageFactoryDesignPattern;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import junit.framework.Assert;

public class LoginTestCase2 {
	WebDriver driver;

	@BeforeClass
	void launchBrowser() {
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	}
	@Test
	void login() {
		LoginPage2 lp = new LoginPage2(driver);
	      lp.setUserName("Admin");
	      lp.setpwd("admin123");
	      lp.clickBtn();
	      Assert.assertEquals(driver.getTitle(), "OrangeHRM");
	}
	
	@AfterClass
	void closeBrowser() {
		driver.close();
	}
}
