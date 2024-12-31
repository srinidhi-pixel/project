package PraticePrograms;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class OpenLinkInNewTab {
	
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.nopcommerce.com/en/demo");
		driver.manage().window().maximize();
		
		
	WebElement pdlink = driver.findElement(By.xpath("//span[normalize-space()='Product']"));

	WebElement showcase = driver.findElement(By.xpath("//span[normalize-space()='Showcase']"));
		
		Actions a = new Actions(driver);
		a.moveToElement(pdlink).build().perform();
//		ctrl+showcase
	   a.keyDown(Keys.CONTROL).click(showcase).keyUp(Keys.CONTROL).perform();
	   
	   //switch to showcase page .even though the driver opens showcase it is focoused on 1st tab so switch to showcase
	   
	   List<String> windowHandles = new  ArrayList(driver.getWindowHandles());//both parent and child window id
	  
	  driver.switchTo().window(windowHandles.get(1)); // this wil switch to showcase
	   
	   
	}

}
