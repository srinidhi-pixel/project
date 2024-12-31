package Listneers;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(Listneers.Mylistners.class)
public class OrangeHRMListnners {
	
WebDriver driver ;
	@BeforeClass
	void launchbrowser() throws InterruptedException {
   driver = new ChromeDriver();
   driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		
	}
	
	@Test(priority = 0)
	void testlogo() {
		boolean status = driver.findElement((By.xpath("//img[@alt='company-branding']"))).isDisplayed();
		Assert.assertEquals(status, true);
	}
	@Test(priority = 1) 
void testUrl() {

Assert.assertEquals(driver.getCurrentUrl(), "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login/");
}


@Test(priority = 2,dependsOnMethods={"testUrl"})
	void homepageTitle() {
	
     Assert.assertEquals(driver.getTitle(), "OrangeHRM");
}


@AfterClass
void closewebsite() {
     driver.close();	
}
}
