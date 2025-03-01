package Revision;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssSelector {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demo.opencart.com/");
		driver.manage().window().maximize();
		boolean displayed = driver.findElement(By.cssSelector("#logo")).isDisplayed();
		System.out.println(displayed);
		
		driver.findElement(By.cssSelector("input.form-control")).sendKeys("Tablets");
		
	}

}
