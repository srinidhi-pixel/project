package pageFactoryDesignPattern;

import java.time.Duration;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class LoginTestCase1{
	
	
	
	WebDriver driver;
	public Logger logger;



	@BeforeClass
	void launchBrowser() {
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
	}
	@Test
	void login() {
		LoginPage lp = new LoginPage(driver);
		logger=LogManager.getLogger(this.getClass());
		logger.info("username");
		
	    lp.setUserName("Admin");
		logger.info("password");
	    lp.setpwd("admin123");
	    lp.clickBtn();
	}
	
	@AfterClass
	void closeBrowser() {
		driver.close();
	}
}
