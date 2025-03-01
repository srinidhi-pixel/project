package Revision;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class locators {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		try {
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		} catch (Exception e) {
			e.printStackTrace();
		}
		driver.get("https://demo.opencart.com/");
		driver.manage().window().maximize();
		
		boolean status = driver.findElement(By.id("logo")).isDisplayed();
		System.out.println(status);
		
//		driver.findElement(By.name("search")).sendKeys("Tablets");
//		driver.findElement(By.className("btn")).click();
//		driver.findElement(By.linkText("Desktops")).click();
//		driver.findElement(By.partialLinkText("Desk")).click();
		List<WebElement> elements = driver.findElements(By.tagName("a"));
		System.out.println(elements.size());
		                 
	}

}
