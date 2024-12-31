package PraticePrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.JavascriptExecutor;


public class SdetJavascriptExecutorDemo {

	public static void main(String[] args) {
		//WebDriver driver = new ChromeDriver();
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
		//WebElement ipbx = driver.findElement(By.xpath("//input[@id='name']"));
		
    //JavascriptExecutor js =(JavascriptExecutor) driver;
//		JavascriptExecutor js= driver;
//		js.executeScript("arguments[0].setAttribute('value','john')",ipbx);
		
		WebElement rdbtn = driver.findElement(By.xpath("//input[@id='male']"));
		JavascriptExecutor js= driver;
		js.executeScript("arguments[0].click()",rdbtn);
	
	
	}
	

}
