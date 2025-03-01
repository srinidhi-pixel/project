package Revision;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class A {
public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
     try {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
	} catch (Exception e) {
		e.printStackTrace();
	}
     driver.get("https://rahulshettyacademy.com/AutomationPractice/");
     driver.manage().window().maximize();
     
//     List<WebElement> elements = driver.findElements(By.xpath("//*[@name='radioButton']"));
//     for (WebElement webElement : elements) {
//    	 webElement.click();
//	}
     
     List<WebElement> chxbk = driver.findElements(By.xpath("//*[@type='checkbox']"));
     for (WebElement webElement : chxbk) {
    	      webElement.isSelected();
    	      
		      webElement.click();
	}
     
}
}
