package BasicPrograms;


import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHover {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		
		
		WebElement mousehover = driver.findElement(By.id("mousehover"));
		
		
		Actions a = new Actions(driver);
	         a.moveToElement(mousehover).build().perform();
	         
	         driver.findElement(By.xpath("//*[@href='#top']")).click();
	}

}
