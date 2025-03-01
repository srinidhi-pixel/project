package Revision;

import java.util.Set;

import org.jspecify.annotations.Nullable;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetMethds {
	public static void main(String[] args) {
			WebDriver driver = new ChromeDriver();
			driver.get("https://demo.opencart.com/");
			driver.manage().window().maximize();
			@Nullable
			String title = driver.getTitle();
			System.out.println(title);
			driver.findElement(By.xpath("//*[text()='Desktops']")).click();
			@Nullable
			String currentUrl = driver.getCurrentUrl();
			System.out.println(currentUrl);
			String windowHandle = driver.getWindowHandle();
			System.out.println(windowHandle);
			 Set<String> windowHandles = driver.getWindowHandles();
			 System.out.println(windowHandles);
	}

}
