package Revision;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class scrrenshot {
	public static void main(String[] args) throws IOException {
		WebDriver driver = new ChromeDriver();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		WebDriverWait mywait= new WebDriverWait(driver,Duration.ofSeconds(5));
		mywait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@alt='company-branding']")));

	
		TakesScreenshot ts = (TakesScreenshot)driver.findElement(By.xpath("//*[@alt='company-branding']"));
		try {
			
	
		     
			File srcfile = ts.getScreenshotAs(OutputType.FILE);
			  System.out.println(srcfile);
			File dstfile = new File("C:\\Users\\ACS\\Desktop\\SCREENSHOT\\HOMPAGE.PNG");
			FileUtils.copyFile(srcfile, dstfile);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}

}
