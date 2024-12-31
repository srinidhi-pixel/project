package PraticePrograms;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SdetCheckBox {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
		
		// locating specific checkbox
	//	driver.findElement(By.xpath("//*[@id='sunday']")).click();
		
		//locating multipleCheckBox
		List<WebElement> chkboxes = driver.findElements(By.xpath("//input[@class='form-check-input' and @type='checkbox']"));
		// use enchanced for loop
		
//		for (int i = 0; i < chkboxes.size(); i++) {
//			chkboxes.get(i).click();
//			
//		}

		
//		for (WebElement webElement : chkboxes) {
//			webElement.click();
//		}
//		i want to select last three checkboxes   total no of chkbx - required (7-3=4) index wil start from 4
		
//		for (int i = 4; i <chkboxes.size(); i++) {
//			chkboxes.get(i).click();
//			
//		}
		
		
		// select first thrre chxboxes
//		for (int i = 0; i <3; i++) {
//	         chkboxes.get(i).click();     		
//		}
		
		
//		 unselect checkboxes if they are selected. if u want select specific chkbxes then use for loop it has indexing. if uwant check all use 
		//this loop will select al the chkboxes
		
//		for (WebElement chkbox : chkboxes) {
//			chkbox.click();
//			
//		}
		
		// this click first three chkbox
		for (int i = 0; i <3; i++) {
	         chkboxes.get(i).click();     		
		}
		
		Thread.sleep(2000);
//		first three are slected.unselect those three chekboxes
		for (int i = 0; i <chkboxes.size(); i++) {
			if (chkboxes.get(i).isSelected()) {
				chkboxes.get(i).click();
			}
			
		}
		
	}

}
