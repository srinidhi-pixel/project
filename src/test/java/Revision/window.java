package Revision;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.jspecify.annotations.Nullable;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class window {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.nopcommerce.com/en/demo");//parent window
		driver.findElement(By.xpath("//*[text()='Product']")).click();
		driver.findElement(By.xpath("//*[text()='Showcase']")).click(); //childwindow
		
		Set<String> windowHandles = driver.getWindowHandles();
		
		List<String> newWindow=new ArrayList( windowHandles);
		    String parentid = newWindow.get(0);
	                          String childid = newWindow.get(1);
		
	                  driver.switchTo().window(parentid);
	                  @Nullable
					String title = driver.getTitle();
	                  System.out.println(title);
	                  
	                  driver.switchTo().window(childid);
	                      @Nullable
						String title2 = driver.getTitle();    
	                      System.out.println(title);
		
	                      
	                      for (String windowH : newWindow) {
							@Nullable
							String title3 = driver.switchTo().window(windowH).getTitle();
							if (title3.equals("")) {
								
							}
						}
	}

}
