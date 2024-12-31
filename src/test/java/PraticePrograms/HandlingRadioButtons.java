package PraticePrograms;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingRadioButtons {
public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	driver.get("https://rahulshettyacademy.com/AutomationPractice/");
	driver.manage().window().maximize();
	
	
List<WebElement> ar = driver.findElements(By.xpath("//input[@name='radioButton']"));
for (int i = 0; i<ar.size(); i++) {
	
	ar.get(i).click();

}
}
}
