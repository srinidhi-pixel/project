package PraticePrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SdetRightClick {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver = new ChromeDriver();
	driver.get("https://swisnl.github.io/jQuery-contextMenu/3.x/demo.html");
	driver.manage().window().maximize();
	
	WebElement button = driver.findElement(By.xpath("//span[@class='context-menu-one btn btn-neutral']"));

  Actions a = new Actions(driver);
  
  //Right click
  a.contextClick(button).perform();
  
  Thread.sleep(2000);
  //click on copy
  driver.findElement(By.className("context-menu-item context-menu-icon context-menu-icon-copy")).click(); 
  //UL -->LI TAG
  Thread.sleep(3000);
  
  // close alert box
  Thread.sleep(5000);
  driver.switchTo().alert().accept();
  
}

}
