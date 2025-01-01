package BasicPrograms;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyTitleAndUrl {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://login.salesforce.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		
		String expected_title="Login | Salesforce";
		String actual_title=driver.getTitle();
		System.out.println(expected_title.equals(actual_title));
		
		if (actual_title!=null && expected_title.equalsIgnoreCase(actual_title)) {
			System.out.println(" title is corect");
			
		}
		else {
			System.out.println("title is not correct");
		}
		System.out.println(driver.getCurrentUrl());
		driver.close();
	}

}
