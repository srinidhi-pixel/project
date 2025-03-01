package Revision;
//status code should be >= 400 thn its broken link .< 400 its  not
// link should have href="//xyz.com" with attribute. hit url to server--status code.status code >=400.<400 not

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;
import java.net.URLConnection;
import java.time.Duration;
import java.util.List;

import org.jspecify.annotations.Nullable;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLink {
	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws IOException {
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.deadlinkcity.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		
		int noOfBrokenLinks=0;
		// capture all the links
		List<WebElement> links = driver.findElements(By.tagName("a"));
		System.out.println(links.size());
		
		for (WebElement linkElement : links) {
			  @Nullable
			String hrefvalue = linkElement.getAttribute("href");
			  if (hrefvalue==null|| hrefvalue.isEmpty()) {
				  System.out.println("Not possible");
				  continue; // if attribute is not der i will skip
				  }
			  
			  // hit url to server
			  
			  try {
				 URL url = new URL(hrefvalue);
				//URL linkurl = new URL(hrefvalue); //converted href value from string to url format
				HttpURLConnection openConnection = (HttpURLConnection)url.openConnection(); // open connection to the server
				openConnection .connect();// connect to server and sent request to the server
				if (openConnection .getResponseCode()>=400) {
					System.out.println(hrefvalue+"====>broken link");
					
					 noOfBrokenLinks++;
				}else {
					System.out.println(hrefvalue+"==>Not abroken link");
				}
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			  
			  System.out.println("Number of broken links:"+noOfBrokenLinks);
			  
		}
		
	}
	
		
	

}
