package BasicPrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath {
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.opencart.com/");
		driver.manage().window().maximize();
		// x path with single attribute 
//		driver.findElement(By.xpath("//*[@placeholder='Search']")).sendKeys("tablets");
		
		// x path with multiple attributes. names should be case sensitive
//		driver.findElement(By.xpath("//*[@placeholder='Search'][@name='search']")).sendKeys("tablets");
		
//		driver.findElement(By.xpath("//*[@placeholder='Search'and @name='search']")).sendKeys("tablets");
		
//		driver.findElement(By.xpath("//*[@placeholder='Search'or @name='Search']")).sendKeys("tablets");
		
//		whithout using attribute we can locate using inner text all link will have IT but all inner text will not contain link
//		driver.findElement(By.xpath("//*[text()='Desktops']")).click();
         
		// i want display label on the console we can do using text() methood
//		boolean displayed = driver.findElement(By.xpath("//*[text()='Featured']")).isDisplayed();
//		System.out.println(displayed);
//		 String text = driver.findElement(By.xpath("//*[text()='Featured']")).getText();
//		 System.out.println(text);
//		 with contains methood
		
//		driver.findElement(By.xpath("//*[contains(@placeholder,'Sea')]")).sendKeys("tablets");
		
		// Xpath with starts-with()
//		driver.findElement(By.xpath("//*[starts-with(@placeholder,'Sea')]")).sendKeys("tablets");
//		chained x path
		boolean displayed = driver.findElement(By.xpath("//div[@id='logo']/a/img")).isDisplayed();
		System.out.println(displayed);
	
	}

}
