package PraticePrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		
		WebElement dropdown = driver.findElement(By.id("dropdown-class-example"));
		dropdown.click();
		
		Select sl = new Select(dropdown);
		sl.selectByIndex(1);
//		sl.selectByVisibleText("");
//		sl.selectByValue("");
	}

}
