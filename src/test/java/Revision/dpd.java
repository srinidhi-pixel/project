package Revision;

import java.time.Duration;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dpd {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		driver.manage().window().maximize();
	//	driver.get("https://www.jqueryscript.net/demo/Drop-Down-Combo-Tree/");
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
//		WebElement dpd = driver.findElement(By.xpath("//*[@class='comboTreeArrowBtnImg']"));
//		dpd.click();
		
	
		//Select sl = new Select(dpd);
	//	sl.selectByIndex(2);
//		List<WebElement> options = sl.getOptions();
//		 for (WebElement webElement : options) {
//			      webElement.click();
//		}
		
		//sl.selectByValue("");
		//sl.selectByVisibleText("");
		
//		List<WebElement> elements = driver.findElements(By.xpath("//*[@class='comboTreeItemTitle']"));
//		     for (WebElement webElement : elements) {
//				  String text = webElement.getText();
//				  if (text.equals("choice 1")||text.equals("choice 2")) {
//					  webElement.click();
//				}
//			}
		
	}
	


}
