package PraticePrograms;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitWaitDemo {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
	   
		try {
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("admin");
		driver.close();
	}

}
