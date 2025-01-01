package Revision;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Handlingwindow {
	@Test
	public void windowHandle() {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		driver.findElement(By.id("openwindow")).click();
         Set<String> windowHandles = driver.getWindowHandles();		
         Iterator<String> iterator = windowHandles.iterator();
         String parentwindow = iterator.next();
         String childiwindow = iterator.next();
         driver.switchTo().window(childiwindow);
         driver.findElement(By.xpath("//li[@class='nav-item']//a[normalize-space()='Courses']")).click();
         
         
	}
	
	

}
