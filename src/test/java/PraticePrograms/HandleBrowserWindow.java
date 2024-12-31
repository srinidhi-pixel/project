package PraticePrograms;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.jspecify.annotations.Nullable;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleBrowserWindow {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		// it will open another browser window.now i want to capture ids of both the windows
		
	driver.findElement(By.xpath("//a[normalize-space()='OrangeHRM, Inc']")).click();
	Set<String> windowHandles = driver.getWindowHandles();// windohandles contains both parent and child
	
	 // Approach 1 we can convert set into list .if we have limted windowhandles (2) parent and child
	
	List<String> windowlist= new ArrayList(windowHandles);// this will convert set into list
	String parentid = windowlist.get(0); // extract parent id
	String childid = windowlist.get(1);
//switch to child window
	driver.switchTo().window(childid);
	System.out.println(driver.getTitle());// evethough driver is going to secondwindow driver is fcused on the first window 
//	switch to parent window
	driver.switchTo().window(parentid);
	System.out.println(driver.getTitle());
	
	//Approach 2
	
	for (String newwind : windowlist) {
		String title = driver.switchTo().window(newwind).getTitle();
		
		
		if (title.equals("OrangeHRM")) {
			System.out.println(driver.getCurrentUrl());
//			some validation on the parent window
		}
		
	}
	}


	
	
}
