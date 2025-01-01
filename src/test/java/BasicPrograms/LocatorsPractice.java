package BasicPrograms;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsPractice {

	public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	driver.get("https://accounts.spotify.com/en/login?continue=https%3A%2F%2Fopen.spotify.com%2F");
	driver.manage().window().maximize();
//	WebElement element = driver.findElement(By.id("Login"));
//	element.click();
	
//	WebElement element = driver.findElement(By.id("login2"));
//	element.click();
		
	WebElement element = driver.findElement(By.xpath("//input[@placeholder='Email or username']"));
	element.click();
	element.sendKeys("admin");
	
	         
	}

}
