package BasicPrograms;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingCheckBoxes {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		
		
		WebElement ch1 = driver.findElement(By.id("checkBoxOption1"));
	System.out.println(	ch1.isDisplayed());
	System.out.println(ch1.isSelected());
	ch1.click();
	Thread.sleep(2000);
		System.out.println(ch1.isSelected());
		
		
		WebElement ch2 = driver.findElement(By.id("checkBoxOption2"));
		System.out.println(	ch2.isDisplayed());
		System.out.println(ch2.isSelected());
		ch2.click();
		Thread.sleep(2000);
		System.out.println(ch2.isSelected());
		
		
		WebElement ch3 = driver.findElement(By.id("checkBoxOption3"));
		System.out.println(	ch3.isDisplayed());
		System.out.println(ch3.isSelected());
		ch3.click();
		Thread.sleep(2000);
		System.out.println(ch3.isSelected());
		
		List<WebElement> alcheckboxes = driver.findElements(By.xpath("//input[@type='checkbox']"));
		 for (int i = 0; i <alcheckboxes.size(); i++) {
			 alcheckboxes.get(i).click();
			 
		Thread.sleep(2000);	
		}
		 
		 for (WebElement webElement : alcheckboxes) {
			         webElement.click();
			Thread.sleep(2000);
		}
	}

}
