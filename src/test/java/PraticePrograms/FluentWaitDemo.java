package PraticePrograms;

import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import com.google.common.base.Functions;

public class FluentWaitDemo {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		
		//declaration
		   Wait<WebDriver> mywait= new FluentWait<WebDriver>(driver)
				   .withTimeout(Duration.ofSeconds(10))
				   .pollingEvery(Duration.ofSeconds(2))
				   .ignoring(NoSuchElementException.class);
		   
//		   we need apply fluent wait for the element which has the sychronizarion here eg username field 
		   
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
//		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("admin");
		
WebElement txtusrname=mywait.until(new Function<WebDriver,WebElement>() {

	@Override
	public WebElement apply(WebDriver driver) {
	
		return driver.findElement(By.xpath("//input[@name='username']")); 
	}	
});

txtusrname.sendKeys("admin");
	}

}
