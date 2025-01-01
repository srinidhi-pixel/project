package PraticePrograms;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DatePicker2 {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		
//		//input DOB
//		String year="2021";
//		String month ="November";
//		String date ="15";
		
		
		//driver.findElement(By.xpath("//input[@id='datepicker']")).sendKeys("11/27/2024");
		
		driver.findElement(By.id("datepicker")).click();
		// expected date
		String month ="November";
		String date ="27";
		String year ="2023";
		//future date
		while(true) {
			
	    String curentmonth = driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();//actual
	    String currentyear = driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();
			if (curentmonth.equals(month) &&currentyear.equals(year) ) {
				 
				break;
			}
			
		//	driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']")).click();
			driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-w']")).click();
			
		}
		
List<WebElement> alldate = driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//tbody//tr//td/a"));

    for (WebElement dt : alldate) {
		if (dt.getText().equals(date)) {
			dt.click();
			break;
		}
		
	}
	}

}
