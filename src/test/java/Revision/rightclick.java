package Revision;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class rightclick {
	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.get("https://swisnl.github.io/jQuery-contextMenu/3.x/demo.html");
		driver.manage().window().maximize();
		
		WebElement element = driver.findElement(By.xpath("//*[text()='right click me']"));
		
		Actions a = new Actions(driver);
		a.contextClick(element).perform();
		a.doubleClick();
		
		driver.findElement(By.className("")).click();
	}

}
