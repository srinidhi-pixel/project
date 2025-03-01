package Revision;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathRevise {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.opencart.com/");
		driver.manage().window().maximize();
		boolean displayed = driver.findElement(By.id("logo")).isDisplayed();
		System.out.println(displayed);
	   // driver.findElement(By.name("search")).sendKeys("MacBook");
	   
		Thread.sleep(2000);
	    //driver.findElement(By.linkText("Tablets")).click();
	    
	    driver.findElement(By.partialLinkText("Tab")).click();
	}
}
