package Revision;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scrollbar {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.nopcommerce.com/en/demo");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.manage().window().maximize();
	
	JavascriptExecutor js = (JavascriptExecutor)driver;
//	js.executeScript("window.scrollBy(0,1000)", "");
//	System.out.println("return window.pageYOffset;");
	WebElement btn = driver.findElement(By.xpath("//*[@class='btn blue-button']"));
     js.executeScript("arguments[0].scrollIntoView();",btn);
     js.executeScript("arguments[0].click();",btn);
     
     js.executeScript("window.scrollBy(0,document.body.scrollHeight)", "");
     js.executeScript("window.scrollBy(0,-document.body.scrollHeight)", "");
     
}


}
