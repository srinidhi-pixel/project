package PraticePrograms;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SdetKeyboardOperations {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://text-compare.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//textarea[@id='inputText1']")).sendKeys("welcome");
		
		
		Actions a = new Actions(driver);
		//ctrl+A select the text 
		a.keyDown(Keys.CONTROL).sendKeys("A").keyUp(Keys.CONTROL).perform();//keydown for pressing ctrl. key up for releasing the ctrl
		
		//ctrl+c   copy the text into clipboard
		a.keyDown(Keys.CONTROL).sendKeys("C").keyUp(Keys.CONTROL).perform();
		
		//TAB shifting to next text area
		a.keyDown(Keys.TAB).keyUp(Keys.TAB).perform();
		
		//ctr+v  paste the text
		
		a.keyDown(Keys.CONTROL).sendKeys("V").keyUp(Keys.CONTROL).perform();
		
		
	}

}
