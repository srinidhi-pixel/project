package PraticePrograms;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollBar {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.nopcommerce.com/en/demo");
		driver.manage().window().maximize();
		
		
		
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		// 1) scroll by pixel number
	//	js.executeScript("window.scrollBy(0,1500)","");
		//System.out.println(js.executeScript("return window.pageYOffset;"));
	
	
	//2) scroll the page till the element is visible

	//WebElement btn = driver.findElement(By.xpath("//a[@class='btn blue-button']"));
    //js.executeScript("arguments[0].scrollIntoView();", btn);
	//System.out.println(js.executeScript("return window.pageYOffset;"));
	
		//3) scroll the page till end of the page
				js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
				System.out.println(js.executeScript("return window.pageYOffset;"));
		Thread.sleep(5000);
		
		// scrolling up to initial position 
		js.executeScript("window.scrollBy(0,-document.body.scrollHeight)");// put minus
	}

}
