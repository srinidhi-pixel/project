package PraticePrograms;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Zoom {
public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.nopcommerce.com/en/demo");
	driver.manage().window().maximize();
	

	JavascriptExecutor js = (JavascriptExecutor)driver;
	js.executeScript("document.body.style.zoom='50%'");//set zoom level
}
}
