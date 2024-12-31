package PraticePrograms;

import java.time.Duration;
import java.util.Set;

import org.jspecify.annotations.Nullable;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClosingSpecificBrowserWindow {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		// it will open another browser window.now i want to capture ids of both the windows
		
	driver.findElement(By.xpath("//a[normalize-space()='OrangeHRM, Inc']")).click();
	Set<String> windowHandles = driver.getWindowHandles();// windohandles contains both parent and child
	
	for (String wind : windowHandles) {
		String title = driver.switchTo().window(wind).getTitle();
		System.out.println(title);
		if (title.equals("OrangeHRM")|| title.equals("some other window handles")) {
			driver.close();
//			break;if u have only one browser window then use break
		}
	}
	}

}
