package TestNgDemo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;



public class Anotations {
	
WebDriver driver ;
	@BeforeClass
	void launchbrowser() {
   driver = new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		
		
	}
	@Test(priority = 0) 
void loadurl() {
driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
String exptdtitle="OrangeHRM";

String acttitle = driver.getTitle();
Assert.assertEquals(exptdtitle, acttitle);
}


@Test(priority = 1,dependsOnMethods = {"loadurl"})
	void loginurl() {
		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
        boolean displayed = driver.findElement(By.xpath("//h6[@class='oxd-text oxd-text--h6 oxd-topbar-header-breadcrumb-module']")).isDisplayed();
   Assert.assertTrue(displayed);
}

@Test(priority = 2,dependsOnMethods ={"loginurl","loadurl"})
void logout() {
	driver.findElement(By.xpath("//p[@class='oxd-userdropdown-name']")).click();
	driver.findElement(By.xpath("//a[normalize-space()='Logout']")).click();
}

@AfterClass
void closewebsite() {
     driver.close();	
}

}

