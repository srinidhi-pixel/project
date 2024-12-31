package PraticePrograms;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SdetHiddenDpd {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver = new ChromeDriver();
	driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
	Thread.sleep(2000);
	
	driver.findElement(By.xpath("//*[@placeholder='Username']")).sendKeys("Admin");
	driver.findElement(By.xpath("//*[@placeholder='Password']")).sendKeys("admin123");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//*[@type='submit']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//*[text()='PIM']")).click();
	//driver.findElement(By.xpath("//*[@class='oxd-icon bi-caret-down-fill oxd-select-text--arrow']")).click();
}
}
