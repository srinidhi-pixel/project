package PraticePrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SdetMouseHover {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.opencart.com/");
		driver.manage().window().maximize();
	WebElement dsktop = driver.findElement(By.xpath("//a[normalize-space()='Desktops']"));	
	WebElement mac = driver.findElement(By.xpath("//a[normalize-space()='Mac (1)']"));
	
	Actions a = new Actions(driver); //when use action mandatory build and perform method
	//a.moveToElement(dsktop).moveToElement(mac).click().build().perform();// build method creates an action and perform completes action
      a.moveToElement(dsktop).moveToElement(mac).click().perform();
	
	}

}
