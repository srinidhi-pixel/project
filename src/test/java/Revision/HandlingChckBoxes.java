package Revision;

import java.time.Duration;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingChckBoxes {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		try {
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		} catch (Exception e) {
		 e.printStackTrace();
		}
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		
		
		List<WebElement> elements = driver.findElements(By.xpath("//*[@type='radio']"));
	         for (int i = 0; i <elements.size(); i++) {
	        	    elements.get(i).click();
				
			}
	         
//	         List<WebElement> ar = driver.findElements(By.xpath("//input[@name='radioButton']"));
//	 		for (int i = 0; i <ar.size(); i++) {
//	 			ar.get(i).click();
//	 		}
	}

}
