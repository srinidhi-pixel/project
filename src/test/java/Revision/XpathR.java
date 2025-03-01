package Revision;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.jspecify.annotations.Nullable;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//absolute xpath:traverse from root node till the target element.
//relative xpath : drictely jumps to the target element 
//abs xpath :works without attributes.singels slash
//rel xpath:work with attributes

public class XpathR {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		//get methods .all get methods return string
	//	driver.get("https://demo.opencart.com/");
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//		driver.findElement(By.xpath("//*[@class='nav-link dropdown-toggle']")).click();
//		@Nullable
//		String currentUrl = driver.getCurrentUrl();
//		System.out.println(currentUrl);
//		@Nullable
//		String title = driver.getTitle();
//		System.out.println(title);
          driver.findElement(By.linkText("OrangeHRM, Inc")).click();
          driver.getCurrentUrl();
          String windowHandle = driver.getWindowHandle();
          System.out.println(windowHandle);
          // if multiple windows are open driver s focused on the first window so it closes first window when we use driver.close();
          Set<String> windowHandles = driver.getWindowHandles();
         List<String> newwindow = new ArrayList(windowHandles);
                      if (newwindow!=null) {
                    	  String parentwindow = newwindow.get(0);
                          String childWindow = newwindow.get(1);
					
                   
                 
                    
                    @Nullable
					String title = driver.switchTo().window(parentwindow).getTitle();
                    System.out.println(title);
                     
                    @Nullable
					String title2 = driver.switchTo().window(childWindow).getTitle();
                    System.out.println(title);
                      } 
                    for (String string : newwindow) {
						       @Nullable
							String title3 = driver.switchTo().window(string).getTitle();
						       
						       if (title3.equals("Human Resources Management Software | OrangeHRM")) {
								
							}
					}
	}
	

}
