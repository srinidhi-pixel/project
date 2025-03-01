package Revision;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class TakesceenShoot {
	@Test
	public void screenshot() throws IOException {
		
	WebDriver driver = new ChromeDriver();
	driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
	WebDriverWait mywait= new WebDriverWait(driver, Duration.ofSeconds(3));
	mywait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@name='username']")));
	TakesScreenshot ts = (TakesScreenshot)driver;
	File sourcefile = ts.getScreenshotAs(OutputType.FILE);
	File dstnationfile=new File("C:\\Users\\ACS\\Desktop\\SCREENSHOT\\hompage.png");
	FileUtils.copyFile(sourcefile, dstnationfile);
	System.out.println("capyured");
	
			}

	
		
	
}
