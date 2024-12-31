
package BasicPrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssSelectors {
	
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.opencart.com/");
		driver.manage().window().maximize();
//		css by id tag is optional
//		boolean displayed = driver.findElement(By.cssSelector("div#logo")).isDisplayed();
//		boolean displayed = driver.findElement(By.cssSelector("#logo")).isDisplayed();
//		System.out.println(displayed);
		
		
		//tag class tag.classname
//		driver.findElement(By.cssSelector("input.form-control")).sendKeys("tablets"); 
		
		
//		tag attribute
		
//		driver.findElement(By.cssSelector("input[placeholder='Search']")).sendKeys("Tablets");
//		driver.findElement(By.cssSelector("[placeholder='Search']")).sendKeys("Tablets");
		
//		tag class attribute
		
		driver.findElement(By.cssSelector("input.form-control[placeholder='Search']")).sendKeys("tablets");
	}

}
