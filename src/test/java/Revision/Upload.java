package Revision;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Upload {

	@Test
	public void upload() throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.get("https://demo.automationtesting.in/FileUpload.html");
		Thread.sleep(3);
		String filepath="C:\\Users\\ACS\\Desktop\\interview questions.txt";
		driver.findElement(By.id("input-4")).sendKeys(filepath);
		
	}
}
