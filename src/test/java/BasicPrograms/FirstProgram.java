package BasicPrograms;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstProgram {

	public static void main(String[] args) throws InterruptedException {
	 WebDriver driver= new ChromeDriver();
	 driver.get("https://login.salesforce.com/");
	 driver.manage().window().maximize();
	 Thread.sleep(4000);
	 driver.quit();
	}

}
