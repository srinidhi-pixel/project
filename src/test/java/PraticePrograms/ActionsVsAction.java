package PraticePrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class ActionsVsAction {
public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	driver.get("https://swisnl.github.io/jQuery-contextMenu/3.x/demo.html");
	driver.manage().window().maximize();
	
	WebElement button = driver.findElement(By.xpath("//span[@class='context-menu-one btn btn-neutral']"));

  Actions a = new Actions(driver);
  
  //Right click
  Action action = a.contextClick(button).build();// building/creating an action and storing in a VAR.1st i want create action.whenrequredperform
  action.perform();//we are perform/completing action
  
}
}
