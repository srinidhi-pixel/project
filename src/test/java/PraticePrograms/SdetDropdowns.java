package PraticePrograms;

import java.time.Duration;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SdetDropdowns {
public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	driver.get("https://testautomationpractice.blogspot.com/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
	WebElement dpd = driver.findElement(By.xpath("//*[@id='country']"));
//  only if u have select tag then only we can use      
       Select sl = new Select(dpd);
//         sl.selectByVisibleText("Germany");
//         sl.selectByValue("france");//value is the attribute in the html tag
//         sl.selectByIndex(0);
           sl.isMultiple();
	
//	capture the options from the dropdown
	List<WebElement> options = sl.getOptions();//WE WILL GET ALL OPTIONS AVLBL IN THE DROPDOWN. WE NO NEED TO WRITE COMON LOCATOR
	System.out.println(options.size());
	
	// printing all the option on the console
	
//	for (int i = 0; i <options.size(); i++) {
//		System.out.println(options.get(i).getText());
//		
//	}
	for (WebElement op : options) {
		System.out.println(op.getText());
		
	}
}
}
