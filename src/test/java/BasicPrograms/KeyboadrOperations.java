package BasicPrograms;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class KeyboadrOperations {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://login.salesforce.com/?locale=in");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		WebElement usrname = driver.findElement(By.xpath("//*[@id='username']"));
	
		WebElement passwrd = driver.findElement(By.xpath("//*[@id='password']"));
		usrname.sendKeys("admin");
	
		
		
		usrname.sendKeys(Keys.CONTROL+"a");
		
		usrname.sendKeys(Keys.CONTROL+"c");
		
		passwrd.sendKeys(Keys.CONTROL+"v");
	}

}
