package Revision;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseOpr {
	
	public static void main(String[] args) {
		 WebDriver driver = new ChromeDriver();
		 driver.get("https://www.nopcommerce.com/en/demo");
		 
		 WebElement element = driver.findElement(By.xpath("//*[text()='Product']"));
		                       WebElement element2 = driver.findElement(By.xpath("//*[text()='Showcase']"));
		 
		 Actions a = new Actions(driver);
		 a.moveToElement(element).moveToElement(element2).click().build().perform();
		 
	}

}
