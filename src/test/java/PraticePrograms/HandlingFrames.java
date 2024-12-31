package PraticePrograms;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingFrames {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://ui.vision/demo/webtest/frames/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
//		by index. only whwn u have single web page
//		WebDriver frame = driver.switchTo().frame(0);
//		driver.findElement(By.xpath("//*[@type='text']")).sendKeys("aditya");
//		
//		driver.switchTo().defaultContent();// navigate back to original webpage.
//		WebDriver frame2 = driver.switchTo().frame(1);
//		driver.findElement(By.xpath("//*[@name='mytext2']")).sendKeys("adi");
//		
//		driver.switchTo().defaultContent();
//		WebDriver frame3 = driver.switchTo().frame(0);
//		WebElement frame1 = driver.findElement(By.xpath("//*[@type='text']"));
//		frame1.clear();
//		frame1.sendKeys("malkood");
		
		//by webelement. switch to frame first then locate the element inside the frame. frame will have frame tag
		
		WebElement frame2 = driver.findElement(By.xpath("//*[@src='frame_2.html']"));
		driver.switchTo().frame(frame2);
		driver.findElement(By.xpath("//*[@name='mytext2']")).sendKeys("adi");
		driver.switchTo().defaultContent();//switched to frame 2
		
		//frame1
		
		WebElement frame1 = driver.findElement(By.xpath("//*[@src='frame_1.html']"));
		driver.switchTo().frame(frame1);
		driver.findElement(By.xpath("//*[@name='mytext1']")).sendKeys("selenium");
		
		driver.switchTo().defaultContent();//switched to frame 2
		
		//frame 3 contains inner iframe.first locate frame 3
		
		WebElement frame3 = driver.findElement(By.xpath("//*[@src='frame_3.html']"));
		driver.switchTo().frame(frame3);
		driver.findElement(By.xpath("//*[@name='mytext3']")).sendKeys("selenium");
		
		// inner i frame  which is inside frame 3. there is only one i frame inside so use index
		
		driver.switchTo().frame(0);
		
		// interacting with inner frames. first get the link of inner web page. copy the link of inner web page open in other tab and locate
//		driver.findElement(By.xpath("//*[@class='AB7Lab Id5V1']")).click();
//		driver.switchTo().defaultContent();
//		using javascriptexcecutor
		WebElement rdbutn = driver.findElement(By.xpath("//*[@class='AB7Lab Id5V1']"));
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();",rdbutn);
		
		
	}

}
