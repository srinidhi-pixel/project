package TestNgDemo;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class HandlingWindow {
	@Test
	public void newWidow() throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		  driver.get("https://rahulshettyacademy.com/AutomationPractice/");
//		  WebDriverWait mywait = new WebDriverWait(driver,Duration.ofSeconds(3000));
//		  mywait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//img[@alt='company-branding']"))); 
		  
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		  driver.manage().window().maximize();
		  Thread.sleep(3000);
		  WebElement openwindow = driver.findElement(By.xpath("//button[@id='openwindow']"));
		   openwindow.click();
		   System.out.println(driver.getCurrentUrl());
		                Set<String> windowHandles = driver.getWindowHandles();
		                Iterator<String> iterator = windowHandles.iterator();    
		                String parentwindow = iterator.next();
		                String childwindow = iterator.next();
		               driver.switchTo().window(childwindow);	        
		               System.out.println(driver.getCurrentUrl());
	             WebElement courses = driver.findElement(By.xpath("(//*[text()='Courses'])[1]"));
	             courses.click();
		   
	}

}
