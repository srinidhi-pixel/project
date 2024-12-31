package Revision;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DatePicker {
public static void main(String[] args) throws InterruptedException {
	
	WebDriver driver = new ChromeDriver();
	driver.get("https://testautomationpractice.blogspot.com/");
	driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
	//select month
	driver.findElement(By.xpath("//input[@id='txtDate']")).click();
	Thread.sleep(2000);
	
	WebElement dpd = driver.findElement(By.xpath("//*[@class='ui-datepicker-month']"));
	dpd.click();
	Select sl = new Select(dpd);
    List<WebElement> options = sl.getOptions();
    String month ="Oct";
	String year ="2024";
	String date ="27";
	
	Thread.sleep(2000);
	
	for (WebElement allmoth : options) {
		if(allmoth.getText().equals(month)) {
			allmoth.click();
			break;
		}
	}
	
	WebElement dpdy = driver.findElement(By.xpath("//*[@class='ui-datepicker-year']"));
	dpdy.click();
	Select sy = new Select(dpdy);
	List<WebElement> yeardpd = sy.getOptions();
	for (WebElement optionyear : yeardpd) {
        if (optionyear.getText().equals(year)) {
        	optionyear.click();
			break;
		}		
	}
	
	List<WebElement> alldates = driver.findElements(By.xpath("//*[@class='ui-datepicker-calendar']//tbody//tr/td/a"));
	for (WebElement dt : alldates) {
		if (dt.getText().equals(date)) {
			dt.click();
			break;
		}
		
	}
}
	
}

