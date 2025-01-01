package Revision;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DatePicker1 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
	    
	    driver.findElement(By.id("txtDate")).click();
	    
	    
	    String month ="Nov";
	    String year ="2023";
	    String date ="28";
	    while(true) {
	    String cmonth = driver.findElement(By.xpath("//*[@class='ui-datepicker-month']")).getText();
	     String cyear = driver.findElement(By.xpath("//*[@class='ui-datepicker-year']")).getText();
	      
	     if (cmonth.equals(month) && cyear.equals(year)) {
	          break;
		}
	     
	     driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-w']")).click();
	    }
	 
	}
}



