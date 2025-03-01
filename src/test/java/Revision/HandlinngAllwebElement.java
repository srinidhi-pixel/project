package Revision;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Properties;
import java.util.Set;

import org.jspecify.annotations.Nullable;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class HandlinngAllwebElement {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("name")).sendKeys("aditya");
		driver.findElement(By.id("email")).sendKeys("adi@gmail.com");
		driver.findElement(By.xpath("//*[@placeholder='Enter Phone']")).sendKeys("9739099833");
		driver.findElement(By.xpath("//*[@id='textarea']")).sendKeys("Anand Nagar");
		
//		WebElement rdbtn = driver.findElement(By.xpath("//*[@type='radio']"));
//		boolean displayed = rdbtn.isDisplayed();
//		System.out.println(displayed);
//		boolean enabled = rdbtn.isEnabled();
//		System.out.println(enabled);
//		boolean selected = rdbtn.isSelected();
//		System.out.println(selected);
//	    rdbtn.click();
//	    boolean displaye = rdbtn.isDisplayed();
//		System.out.println(displaye);
//		boolean enable = rdbtn.isEnabled();
//		System.out.println(enable);
//		boolean selecte = rdbtn.isSelected();
//		System.out.println(selecte);
//	    //chck all rdbtn
		 List<WebElement> elements = driver.findElements(By.xpath("//*[@type='radio']"));
		 for (WebElement webElement : elements) {
			 webElement.click();
			 }
		 // chck all checkbox
//	          List<WebElement> chxbx = driver.findElements(By.xpath("//*[@type='checkbox']"));
//	          for (WebElement webElement : chxbx) {
//	        	  webElement.click();
//			}
	//	  first 3 chckbx
//		  List<WebElement> chxbx = driver.findElements(By.xpath("//*[@type='checkbox']"));
//		  for (int i = 0; i<=3; i++) {
//			      chxbx.get(i).click();
//		}
//		  for (int i = 0; i < chxbx.size(); i++) {
//			   if (chxbx.get(i).isSelected()) {
//				   chxbx.get(i).click();
//				
//			}
//			
//		}
		 
		 // last 3 chxbx
		 
//		 List<WebElement> chxbx = driver.findElements(By.xpath("//*[@type='checkbox']"));
//		 for (int i = 3; i <chxbx.size(); i++) {
//			    chxbx.get(i).click();
//			
//		}
	
		  
		  WebElement dpd = driver.findElement(By.xpath("//*[@id='country']"));
		  dpd.click();
		  
		  Select sl = new Select(dpd);
		  List<WebElement> options = sl.getOptions();
		  for (WebElement webElement : options) {
			  webElement.click();
			
		}
		//  sl.selectByIndex(5);
		 // sl.selectByValue("canada");
		  //sl.selectByVisibleText("France");
		  //  driver.findElement(By.xpath("//*[text()='Japan']")).click();
		  
		  driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		  driver.manage().window().maximize();
		  
		   driver.findElement(By.xpath("//*[@id='autocomplete']")).sendKeys("ind");
		 
		   List<WebElement> autos = driver.findElements(By.xpath("//*[@class='ui-menu-item-wrapper']"));
		  for (int i = 0; i <autos.size(); i++) {
			  if (autos.get(i).getText().equals("India")) {
				autos.get(i).click();
			}
			
		}
		  
		  List<WebElement> chxbx1 = driver.findElements(By.xpath("//*[@type='checkbox']"));
		  for (WebElement webElement : chxbx1) {
			String text = webElement.getText();
			if (text.equals("option2")||text.equals("option2")) {
				webElement.click();
			}
              
		}
	
		    for (int i = 1; i <chxbx1.size(); i++) {
				 chxbx1.get(i).click();
			}
		  
		  
		  
//		  driver.switchTo().newWindow(WindowType.WINDOW);
//		  driver.get("https://www.nopcommerce.com/en/demo");
//		  driver.switchTo().newWindow(WindowType.TAB);
		  
//		  driver.findElement(By.id("openwindow")).click();
//		  String windowHandle = driver.getWindowHandle();
//		  System.out.println(windowHandle);
//		  
//		  Set<String> windowHandles = driver.getWindowHandles();
//		   List<String> newindow = new ArrayList(windowHandles);
//		     for (String allwindow : newindow) {
//				             @Nullable
//							String title = driver.switchTo().window(allwindow).getTitle();
//				             if (title.equals("QAClick Academy - A Testing Academy to Learn, Earn and Shine")) {
//								System.out.println(driver.getCurrentUrl());
//							}
//			}
//		                 String parentwindow = newindow.get(0);
//		                 String childwindow = newindow.get(1);
//		                 
//		                 driver.switchTo().window(parentwindow);
//		                 System.out.println(driver.getTitle());
//		                 driver.switchTo().window(childwindow);
//		                 System.out.println(driver.getTitle());
		                 
		            
//		  driver.get("https://ui.vision/demo/webtest/frames/");
//			driver.manage().window().maximize();
//			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
			
//			By using index
//			driver.switchTo().frame(0);
//			driver.findElement(By.xpath("//*[@name='mytext1']")).sendKeys("adi");
//			driver.switchTo().defaultContent();
//			
//			driver.switchTo().frame(1);
//			driver.findElement(By.xpath("//*[@name='mytext2']")).sendKeys("mal");
//			driver.switchTo().defaultContent();
//			
//		  
//			driver.switchTo().frame(2);
//			driver.findElement(By.xpath("//*[@name='mytext3']")).sendKeys("sud");
//			driver.switchTo().defaultContent();
//			
//			driver.switchTo().frame(0);
//			WebElement ele = driver.findElement(By.xpath("//*[@name='mytext1']"));
//			ele.clear();
//			ele.sendKeys("shri");
//			driver.switchTo().defaultContent();
			
// By using webelement. first locate the frame using webeement then switch to frame then pass the input
			
//			WebElement frame1 = driver.findElement(By.xpath("//*[@src='frame_1.html']"));
//			  driver.switchTo().frame(frame1);
//			  driver.findElement(By.xpath("//*[@name='mytext1']")).sendKeys("gol");
//			  driver.switchTo().defaultContent();
//			  
//			  WebElement frame2 = driver.findElement(By.xpath("//*[@src='frame_2.html']"));
//			  driver.switchTo().frame(frame2);
//			  driver.findElement(By.xpath("//*[@name='mytext2']")).sendKeys("mal");
//			  driver.switchTo().defaultContent();
//			
//			  
//			  WebElement frame3 = driver.findElement(By.xpath("//*[@src='frame_3.html']"));
//			  driver.switchTo().frame(frame3);
//			  driver.findElement(By.xpath("//*[@name='mytext3']")).sendKeys("malood");
//			  driver.switchTo().frame(0);
//			  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
//			  WebElement rdbtn = driver.findElement(By.xpath("//*[@class='AB7Lab Id5V1']"));
//			  rdbtn.click();
//			  JavascriptExecutor js =(JavascriptExecutor)driver;
//			  js.executeScript("arguments[0].click;", rdbtn);
//			  driver.switchTo().defaultContent();
		    
//			driver.get("https://the-internet.herokuapp.com/javascript_alerts");
//			driver.findElement(By.xpath("//*[@onclick='jsAlert()']")).click();
//			String text = driver.switchTo().alert().getText();
//			System.out.println(text);
//			driver.switchTo().alert().accept();
//			
//			driver.findElement(By.xpath("//*[@onclick='jsConfirm()']")).click();
//			driver.switchTo().alert().dismiss();
//			
//			driver.findElement(By.xpath("//*[@onclick='jsPrompt()']")).click();
//			driver.switchTo().alert().sendKeys("adi");
//			driver.switchTo().alert().accept();
		    
		    //Mouse operations
//              driver.get("https://www.nopcommerce.com/en/demo");
//              WebElement pdlink = driver.findElement(By.xpath("//*[text()='Product']"));
//              WebElement shwcaselink = driver.findElement(By.xpath("//*[text()='Showcase']"));
//                                  
//                         Actions a = new Actions(driver);
//                                a.moveToElement(pdlink).moveToElement(shwcaselink).click().build().perform();
//                                a.contextClick();//right click
//                                a.doubleClick();//double click/		 
                        //        a.dragAndDrop(srcelement, destinationelement);
		                          
                              
		       // KeyBoad Operation.with mouse operation
//		    driver.get("https://text-compare.com/");
//		    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
//		    driver.manage().window().maximize();
//		    
//		      WebElement element = driver.findElement(By.xpath("//*[@name='text1']"));
//		     element.sendKeys("Welcome");
		      
//		      element.sendKeys(Keys.CONTROL+"A");
//				element.sendKeys(Keys.CONTROL+"C");
//				element.sendKeys(Keys.CONTROL.TAB);
//				element.sendKeys(Keys.CONTROL+"V");
		    
//		    Actions a = new Actions(driver);
//		    a.keyDown(Keys.CONTROL).sendKeys("A").keyUp(Keys.CONTROL).build().perform();
//		    a.keyDown(Keys.CONTROL).sendKeys("C").keyUp(Keys.CONTROL).build().perform();
//		    a.keyDown(Keys.TAB).keyUp(Keys.CONTROL).build().perform();
//		    a.keyDown(Keys.CONTROL).sendKeys("V").keyDown(Keys.CONTROL).build().perform();
		    
		    
		    //slider 
//		     driver.get("https://www.jqueryscript.net/demo/Price-Range-Slider-jQuery-UI/");
//		     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
//		     driver.manage().window().maximize();
//		   
		     //first locate the min slider . then get the location n change only x axsis. use drag and dropby build .perform
//		     WebElement slider = driver.findElement(By.xpath("//*[@class='ui-slider-handle ui-corner-all ui-state-default']"));
//		    System.out.println(slider.getLocation());
//		    
//		    Actions a = new Actions(driver);
//		    a.dragAndDropBy(slider,100,259).perform();
		    
		    //max change x axis
		     
//		    WebElement maxslider = driver.findElement(By.xpath("(//*[@class='ui-slider-handle ui-corner-all ui-state-default'])[2]"));
//		      System.out.println(maxslider.getLocation());
//		      
//		      Actions a = new Actions(driver);
//		      a.dragAndDropBy(maxslider, -200, 294).build().perform();
		     
		     
		     //scrollbar is not a webelement we cannot locate
		     
		 	driver.get("https://www.nopcommerce.com/en/demo");
		 	driver.manage().window().maximize();
		 	//by pixel
		 	JavascriptExecutor js = (JavascriptExecutor)driver;		 
//		 	js.executeScript("window.scrollBy(0,1000)","");
//			System.out.println(js.executeScript("return window.pageYOffset;"));
			
			//by specific eleemnt btn
//			WebElement btn = driver.findElement(By.xpath("//*[@class='btn blue-button']"));
//			js.executeScript("arguments[0].scrollIntoView();", btn);
			
			// end of the page
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
//		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
//		System.out.println(js.executeScript("return window.pageYOffset;"));
		
		// reading properties file 
		
		try {
			FileInputStream is = new FileInputStream(System.getProperty("user.dir")+"\\testdata\\confif.properties");
			
			Properties prop = new Properties();
			prop.load(is);
			  String url = prop.getProperty("url");
			  String email = prop.getProperty("email");
			   String pwd = prop.getProperty("pwd");
			   String oid = prop.getProperty("oid");
			   String cid = prop.getProperty("cid");
			   
			   Set<Object> keySet = prop.keySet();
			   System.out.println(keySet);
			   
			             
			   Collection<Object> values = prop.values();
			   System.out.println(values);
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 
		
		
	}

	

}
