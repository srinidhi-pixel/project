package PraticePrograms;

import java.time.Duration;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SdetBootstrapDropdown {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.jqueryscript.net/demo/Drop-Down-Combo-Tree/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		
//		select first single option
		
		WebElement inputbox = driver.findElement(By.id("justAnInputBox"));//opens options list
		inputbox.click();
//		select first single option
		driver.findElement(By.xpath("//*[@type='checkbox']")).click();
		
//		capture all the options and size.
		
	List<WebElement> alloptions = driver.findElements(By.xpath("//*[@class='comboTreeItemTitle']"));

//		System.out.println(alloptions.size());
//         for (WebElement op : alloptions) {
//			System.out.println(op.getText());
//		}
//		select multiple options  normal for loop follows index
     
	for (WebElement op : alloptions) {
		String text = op.getText();
		if (text.equals("choice 1")||text.equals("choice 2")) {
			op.click();
		}
	}
	
	}
	}


