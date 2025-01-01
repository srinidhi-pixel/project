package PraticePrograms;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.support.ui.Select;

public class AutoSuggest {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver = new ChromeDriver();
	driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
	driver.manage().window().maximize();
	
	WebElement add = driver.findElement(By.id("autosuggest"));
	add.click();
	add.sendKeys("Ind");
	
	Thread.sleep(2000);
	
	List<WebElement> al = driver.findElements(By.xpath("//a[@class='ui-corner-all']"));
	for (int i = 0; i < al.size(); i++) {
	    if (al.get(i).getText().equals("India")) {
			al.get(i).click();
		}
	}
	Thread.sleep(2000);
	
	driver.findElement(By.xpath("//span[@id='ctl00_mainContent_ddl_originStation1_CTXTaction']")).click();
	
	List<WebElement> departure = driver.findElements(By.xpath("//a[@href='#']"));
	for (int i = 0; i < departure.size(); i++) {
		if (departure.get(i).getText().equals("Ahmedabad (AMD)")) {
			departure.get(i).click();
		}
		}

	List<WebElement> arrival = driver.findElements(By.xpath("//a[@href='#']"));
	for (int i = 0; i < arrival.size(); i++) {
		if (arrival.get(i).getText().equals("Adampur (AIP)")) {
			arrival.get(i).click();
		}
		}
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	
//	List<WebElement> datepicker = driver.findElements(By.xpath("//span@[class='ui-state-default']"));
//	for (int i = 0; i < datepicker.size(); i++) {
//		if (datepicker.get(i).getText().equals("17/11")) {
//			datepicker.get(i).click();
//		}
//	}
	
//	driver.findElement(By.cssSelector("span.ui-state-default")).click();
driver.findElement(By.xpath("//*[@id='ctl00_mainContent_view_date1']")).click();
	
	driver.findElement(By.xpath("//*[@class='paxinfo']")).click();
	
	WebElement adult = driver.findElement(By.xpath("//*[@id='hrefIncAdt']"));
	for (int i = 0; i < 2; i++) {
		adult.click();
		}
	
	WebElement infant = driver.findElement(By.xpath("//*[@id='hrefIncChd']"));
	for (int i = 0; i <1; i++) {
		infant.click();
		}
	WebElement child = driver.findElement(By.xpath("//*[@id='hrefIncInf']"));
	
	for (int i = 0; i <1; i++) {
		child.click();
		}
	driver.findElement(By.xpath("//*[@id='btnclosepaxoption']")).click();
	
	WebElement dropdown = driver.findElement(By.xpath("//*[@id='ctl00_mainContent_DropDownListCurrency']"));
	dropdown.click();
	Select sl = new Select(dropdown);
	sl.selectByIndex(1);
	dropdown.click();
	
	
  List<WebElement> rdbtn = driver.findElements(By.xpath("//*[@type='checkbox']"));
  JavascriptExecutor js = (JavascriptExecutor)driver;
	js.executeScript("arguments[0].click();",rdbtn);
  
// for (int i = 0; i < rdbtn.size(); i++) {
//	 rdbtn.get(i).click();
//	
//}

  

//	JavascriptExecutor js = (JavascriptExecutor)driver;
//	js.executeScript("arguments[0].click();",rdbtn);


//	driver.findElement(By.linkText("Special Assistance")).click();
}
}

