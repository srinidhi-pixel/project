package Revision;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Multis {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.jqueryscript.net/demo/Drop-Down-Combo-Tree/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@class='comboTreeArrowBtnImg']")).click();
		
		List<WebElement> elements = driver.findElements(By.xpath("//*[@class='comboTreeItemTitle']"));
		          for (WebElement webElement : elements) {
					 String text = webElement.getText();
					 if (text.equals("choice 1")||text.equals("choice 2")) {
						webElement.click();
					}
				}
		
	}
	}


