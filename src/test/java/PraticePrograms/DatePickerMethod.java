package PraticePrograms;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DatePickerMethod { 
	
	//selecting past date
	static void selectPastDate(WebDriver driver,String month,String date,String year) {
		//select month and year
		while(true)
		{
						  String curentmonth = driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();// actual month
						  String curentyear = driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();// actual year
			  if (curentyear.equals(year) && curentmonth.equals(month)) {
			 break;		
			 }
			  
			 driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-w']")).click();// previous
	}
		
		//select date
		List<WebElement> alldates = driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//tbody//tr/td//a"));
		for (WebElement dt : alldates) {
			if (dt.getText().equals(date)) {
				dt.click();
				break;
				
			}
			
		}
		
		
	}
	//selecting future  date
		static void selectFutureDate(WebDriver driver,String month,String date,String year) {
			
			while(true)
			{
							  String curentmonth = driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();// actual month
							  String curentyear = driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();// actual year
				    if (curentyear.equals(year) && curentmonth.equals(month))
				{
				 break;		
				 }
				  
				 driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']']")).click();//next
		}
			
			//select date
			List<WebElement> alldates = driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//tbody//tr/td//a"));
			for (WebElement dt : alldates) {
				if (dt.getText().equals(date)) {
					dt.click();
					break;
					
				}
				
			}
			
			
		}
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/datepicker/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		driver.switchTo().frame(0);
		String year="2024";
		String month ="November";
		String date ="26";
		driver.findElement(By.xpath("//input[@id='datepicker']")).click();// opens date picker
		//selectPastDate( driver, month, date, year);
		selectFutureDate(driver,month,date,year);
	}

}
