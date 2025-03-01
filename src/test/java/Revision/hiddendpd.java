package Revision;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class hiddendpd {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		driver.manage().window().maximize();
		
//		driver.findElement(By.xpath("//*[text()='Click for JS Alert']")).click();
//		Alert alert = driver.switchTo().alert();
//		alert.accept();
//		
//		driver.findElement(By.xpath("//*[text()='Click for JS Confirm']")).click();
//		String text = driver.switchTo().alert().getText();
//		System.out.println(text);
	
		
		driver.findElement(By.xpath("//*[text()='Click for JS Prompt']")).click();
		Alert alert = driver.switchTo().alert();
		alert.sendKeys("adi");
		alert.accept();
	}

}
