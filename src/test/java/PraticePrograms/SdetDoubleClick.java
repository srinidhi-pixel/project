package PraticePrograms;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SdetDoubleClick {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver = new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
	driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_ondblclick");
	driver.manage().window().maximize();
	
	// switch to frame
	WebElement frame = driver.findElement(By.xpath("//iframe[@id='iframeResult']"));
	driver.switchTo().frame(frame);
	Thread.sleep(2000);
	WebElement text = driver.findElement(By.xpath("//p[@ondblclick='myFunction()']"));
	
	// double click 
	
	Actions a = new Actions(driver);
	a.doubleClick(text).perform();
}
}
