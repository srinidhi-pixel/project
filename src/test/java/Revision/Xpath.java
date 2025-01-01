package Revision;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
//selenium is automation tools which help us automate browsers
//s.webdriver is one of the compent of seelnium,web driver is java interface
//locators are the adress which help us to uniquely locate web elements on the web page
//types of locators
//1.id,name,classname,tagname,linktext,partial linktext,cssSelector-->customselectors,xpath==>relative xpath, absolute xpath
public class Xpath {
	@Test
	public void xpath() throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	    driver.manage().window().maximize();
	    Thread.sleep(3000);
	    boolean displayed = driver.findElement(By.id("logo")).isDisplayed();
		System.out.println(displayed);
		driver.findElement(By.name(""));
		driver.findElement(By.className(""));
	}

}
