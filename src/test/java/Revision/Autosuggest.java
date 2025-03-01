package Revision;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Autosuggest {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.manage().window().maximize();
		
		WebElement element = driver.findElement(By.id("autosuggest"));
		element.click();
		element.sendKeys("Ind");
		
		List<WebElement> elements = driver.findElements(By.xpath("//*[@class='ui-corner-all']"));
		for (int i = 0; i < elements.size(); i++) {
			if(elements.get(i).getText().equals("India")) {
				elements.get(i).click();
			}
		
		for (WebElement webElement : elements) {
			 if(webElement.getText().equals("India")) {
				 webElement.click();
			 }
			 
			
			
		}
	}
	}
}
		
			 
		
	

