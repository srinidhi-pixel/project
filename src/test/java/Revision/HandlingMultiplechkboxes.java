package Revision;

import java.time.Duration;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingMultiplechkboxes {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		try {
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		} catch (Exception e) {
			 e.printStackTrace();
		}
		driver.manage().window().maximize();
	//	driver.findElement(By.xpath("//*[@id='sunday']")).click();
	List<WebElement> chkbx = driver.findElements(By.xpath("//*[@class='form-check-input' and @type='checkbox']"));
//	         for (int i = 0; i <chkbx.size(); i++) {
//				    chkbx.get(i).click();
//			}
	         
//	         for (WebElement webElement : chkbx) {
//				    webElement.click();
//			}
//		
//	   for (int i = 0; i <3; i++) {
//		        chkbx.get(i).click();
//	}
	
//	  for (int i = 4; i < chkbx.size(); i++) {
//		     chkbx.get(i).click();
//	}
        
	for (int i = 0; i < 3; i++) {
		     chkbx.get(i).click();
	}
	
	for (int i = 0; i<chkbx.size(); i++) {
		   if (chkbx.get(i).isSelected()) {
			chkbx.get(i).click();
		}
		
		
	}

	}
}
