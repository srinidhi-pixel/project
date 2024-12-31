package BasicPrograms;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandlingAutoSuggestDropdown {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver = new ChromeDriver();
	driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
	driver.manage().window().maximize();
	
	
	WebElement autodd = driver.findElement(By.xpath("//input[@id='autosuggest']"));
	Thread.sleep(2000);
	autodd.sendKeys("Ind");
	Thread.sleep(3000);

	
	List<WebElement> list = driver.findElements(By.xpath("//a[@class='ui-corner-all']"));
	for (int i = 0; i <list.size(); i++) {
	if(list.get(i).getText().equals("India")) {
              list.get(i).click();		
	}
	
	
	Thread.sleep(3000);
	
		WebElement dropdown = driver.findElement(By.xpath("//span[@id='ctl00_mainContent_ddl_originStation1_CTXTaction']"));
		dropdown.click();
		Thread.sleep(2000);
		
		
	

		
	WebElement departure = driver.findElement(By.xpath("//a[@value='BLR']"));
	Thread.sleep(2000);
	
	departure.click();
	Thread.sleep(2000);
	
	
	
	driver.findElement(By.xpath("//input[@id='ctl00_mainContent_view_date1']")).click();	
	
	List<WebElement> lc = driver.findElements(By.xpath("//a[@class='javascript:$CityDropDown.SetSelectedValue(this);return false;']"));
          for (int j = 0; j < lc.size(); j++) {
			if (lc.get(j).getText().equals("Ahmedabad (AMD)")) {
				lc.get(j).click();
				}
			}
          
          

	}
}
}
