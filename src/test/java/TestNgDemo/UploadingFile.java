package TestNgDemo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class UploadingFile {
	@Test
	public void fiehandling() throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		  driver.get("https://demo.automationtesting.in/FileUpload.html");
//		  WebDriverWait mywait = new WebDriverWait(driver,Duration.ofSeconds(3000));
//		  mywait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//img[@alt='company-branding']"))); 
		  
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		  driver.manage().window().maximize();
		  Thread.sleep(3000);
		  String filepath="C:\\Users\\ACS\\Desktop\\interview questions.txt";
		WebElement browsewindow = driver.findElement(By.id("input-4"));
		browsewindow.sendKeys(filepath);
		
	}

}
