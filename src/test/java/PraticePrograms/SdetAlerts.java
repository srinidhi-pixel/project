package PraticePrograms;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Timeouts;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SdetAlerts {
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
//		Timeouts mywait = driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		WebDriverWait mywait = new WebDriverWait(driver, Duration.ofSeconds(50));
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		driver.manage().window().maximize();
//		 Normal alert with ok button
//	driver.findElement(By.xpath("//button[normalize-space()='Click for JS Alert']")).click();
//	Thread.sleep(5000);
//	
//	Alert alert = driver.switchTo().alert();
//	System.out.println(alert.getText());
//	alert.accept(); // it will close the alert
	// this will switch to alert and close the popup.uf u want to perform multiple operations don't use accept
		
		
		// Confirmation alert OK and cancel
	
//	    mywait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[normalize-space()='Click for JS Confirm']"))).click();
//	    Thread.sleep(5000);
//	 driver.switchTo().alert().accept();// close alert using OK button
//	  Thread.sleep(2000);
//	  driver.switchTo().alert().dismiss();
	 
		
		// prompt alert - input box 
		
		driver.findElement(By.xpath("//button[normalize-space()='Click for JS Prompt']")).click();
		Alert alert = driver.switchTo().alert();
		alert.sendKeys("welcome");
		alert.accept();
		
			}

}
