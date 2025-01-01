package PraticePrograms;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SdetSlider {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.jqueryscript.net/demo/Price-Range-Slider-jQuery-UI/");
		driver.manage().window().maximize();
		
		// min slider
//		WebElement slider = driver.findElement(By.xpath("//div[@id='slider-range']//span[1]"));
//         System.out.println(slider.getLocation());// (59,289)=(x,y)
//         Actions a = new Actions(driver);
//        
//         a.dragAndDropBy(slider, 100, 289).perform();
//         
//         System.out.println(slider.getLocation());//(161,289) consider + 0r-5
        
		
		
	     //max slider
		WebElement maxslider = driver.findElement(By.xpath("(//span[@class='ui-slider-handle ui-corner-all ui-state-default'])[2]"));
		System.out.println(maxslider.getLocation());//(544,250)
		
		Actions a = new Actions(driver);
		a.dragAndDropBy(maxslider, -200, 289).perform();
		System.out.println(maxslider.getLocation());//(345,250)

	}

}
