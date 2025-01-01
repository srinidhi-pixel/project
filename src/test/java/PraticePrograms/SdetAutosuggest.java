package PraticePrograms;

import java.time.Duration;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SdetAutosuggest {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		
		driver.findElement(By.name("q")).sendKeys("selenium");
		
		Thread.sleep(5000);
		List<WebElement> list = driver.findElements(By.xpath("//ul[@role='listbox']//li//div[@role='option']"));
		
	for (int i = 0; i < list.size(); i++) {
		if (list.get(i).getText().equals("selenium")) {
			list.get(i).click();
			break;
		}
		
	}
		

	}

}
