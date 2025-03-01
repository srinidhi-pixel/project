package PraticePrograms;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class TabsAndWindow {
	
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.nopcommerce.com/en/demo");
		
		driver.switchTo().newWindow(WindowType.TAB);//selenium4.x open new tab
//		driver.switchTo().newWindow(WindowType.WINDOW);//open new window. default driver is focused on first window/tab after switch focused on particular window/tab
//		driver.get("https://www.instagram.com/?hl=en");
		driver.manage().window().maximize();
		
	}

}
