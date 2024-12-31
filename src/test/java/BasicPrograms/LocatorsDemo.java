package BasicPrograms;

import java.net.http.WebSocket;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsDemo {
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demo.opencart.com/");
		driver.manage().window().maximize();
		
		//name
//		driver.findElement(By.name("search")).sendKeys("Mac");
		
		//id
		//	boolean logoDisplayStatus =	driver.findElement(By.id("logo")).isDisplayed();
	//System.out.println(logoDisplayStatus);
		
		//linktext & partialLinkText
//		driver.findElement(By.linkText("Tablets")).click();
		//class name
	  List<WebElement> headerLinks = driver.findElements(By.className("list-inline-item"));
	 System.out.println("total number of header links:"+headerLinks.size());
	 System.out.print(headerLinks);
		
		
//		List<WebElement> elements = driver.findElements(By.tagName(" a"));
//		System.out.println("total number of links:"+elements.size() );
		
//		List<WebElement> elements = driver.findElements(By.tagName("img"));
//		System.out.println("total number of images:"+elements.size());
//		
	}

}
