package TestNgDemo;

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

public class CapturingScreenShot {
	@Test
	public void screenshot() throws IOException, InterruptedException {
		WebDriver driver =new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		Thread.sleep(3000);
	//	WebDriverWait mywait = new WebDriverWait(driver, Duration.ofSeconds(10));
	//	mywait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@src='/web/images/ohrm_branding.png?v=1721393199309']"))).getText();
	//	driver.findElement(By.xpath("//*[@src='/web/images/ohrm_branding.png?v=1721393199309']"));
		TakesScreenshot ts = (TakesScreenshot)driver.findElement(By.xpath("//*[@src='/web/images/ohrm_branding.png?v=1721393199309']"));
		File sourcefile = ts.getScreenshotAs(OutputType.FILE);
		   File destinationfile= new File("C:\\Users\\ACS\\Desktop\\screnshot\\hompage.png");
		   
		   FileUtils.copyFile(sourcefile, destinationfile);
		   
		   System.out.println("capyured");
	}
	

}
