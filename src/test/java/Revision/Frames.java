package Revision;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver = new ChromeDriver();
	try {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	} catch (Exception e) {
		e.printStackTrace();
	}
	driver.get("https://ui.vision/demo/webtest/frames/");
	driver.manage().window().maximize();
	
//	WebDriver frame = driver.switchTo().frame("3439d6a3174afc22cd6ca1f169b8dee1");
//	frame.findElement(By.xpath("//*[@type='text']")).sendKeys("di");
//driver.switchTo().frame("mytext1").findElement(By.xpath("//*[@type='text']")).sendKeys("adi");
	
//	
//     driver.switchTo().frame(0);
//	 WebElement element = driver.findElement(By.xpath("//*[@type='text']"));	
//	 element.sendKeys("adi");
//	 driver.switchTo().defaultContent();
//	
//	
//	 driver.switchTo().frame(1);
//	WebElement element2 = driver.findElement(By.xpath("//*[@type='text']"));                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            
//	element2.sendKeys("malkood");
//	driver.switchTo().defaultContent();//switch to frame 0 becz frame3 is in frame 1
//	
//	driver.switchTo().frame(2);
//	WebElement element3 = driver.findElement(By.xpath("//*[@type='text']"));
//	element3.sendKeys("sudarshan");
//	driver.switchTo().defaultContent();//switched to frame 0
//	
//	
//	driver.switchTo().frame(0);
//	 WebElement newel = driver.findElement(By.xpath("//*[@type='text']"));	
//	newel.clear();
//	 WebElement newel2 = driver.findElement(By.xpath("//*[@type='text']"));	
//	 newel2.sendKeys("malkood");
	
	//by webelement 3 types of by id,name , second by index. by web element
	
	 // firdtlocate frame  then locate web element 
	
	WebElement frame1 = driver.findElement(By.xpath("//*[@src='frame_1.html']"));
	driver.switchTo().frame(frame1);
	driver.findElement(By.xpath("//*[@type='text']")).sendKeys("adi");
	driver.switchTo().defaultContent(); //this will come back to original web page where all the web pages merged as a frame
	
	WebElement frame2 = driver.findElement(By.xpath("//*[@src='frame_2.html']"));
	 driver.switchTo().frame(frame2);
	 driver.findElement(By.xpath("//*[@type='text']")).sendKeys("malkood");
	
}
}
