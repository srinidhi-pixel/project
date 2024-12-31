package PraticePrograms;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingCheckBoxes {
public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	driver.get("https://rahulshettyacademy.com/AutomationPractice/");
	driver.manage().window().maximize();
	
	WebElement ch1 = driver.findElement(By.xpath("//input[@id='checkBoxOption1']"));
	System.out.println(ch1.isDisplayed());
	System.out.println(ch1.isEnabled());
	System.out.println(ch1.isSelected());
	ch1.click();
	System.out.println(ch1.isSelected());
	
	List<WebElement> chkb = driver.findElements(By.xpath("//input[@type='checkbox']"));
	for (int i = 0; i < chkb.size(); i++) {
		chkb.get(i).click();
		
	}
	
}
}
