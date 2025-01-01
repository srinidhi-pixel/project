package BasicPrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandlingDropdown {
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		
		WebElement dropdown = driver.findElement(By.id("dropdown-class-example"));
		dropdown.click();
		
		
//		Select sl = new Select(dropdown);
//		
//		if we dont have tag name select we cannot use select class . static dropdown.
//		sl.selectByVisibleText("Option1");
//	    sl.selectByIndex(1);
//		sl.selectByValue("option1");
		driver.findElement(By.xpath("//option[@value='option2']")).click();
		
		
		
	}

}
