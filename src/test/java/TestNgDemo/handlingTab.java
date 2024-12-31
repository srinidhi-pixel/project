package TestNgDemo;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class handlingTab {
	@Test
	public void newTab() throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		  driver.get("https://rahulshettyacademy.com/AutomationPractice/");
//		  WebDriverWait mywait = new WebDriverWait(driver,Duration.ofSeconds(3000));
//		  mywait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//img[@alt='company-branding']"))); 
		  
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		  driver.manage().window().maximize();
		  Thread.sleep(3000);
		  
		  driver.findElement(By.xpath("//a[@id='opentab']")).click();
		  Set<String> windowHandles = driver.getWindowHandles();
		  Iterator<String> iterator = windowHandles.iterator();
		  String parentTab = iterator.next();
		  String childTab = iterator.next();
		  driver.switchTo().window(childTab);
		  driver.findElement(By.xpath("//li[@class='nav-item']//a[normalize-space()='Courses']")).click();
		  driver.quit();
	}

}
