package Revision;

import org.jspecify.annotations.Nullable;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

// chrome browser has predefined class called ChromeOptionsClass. we can control browser settings. 3 dots
//1. Headless testing . without seeing on ui we perform testing.backend it will be rnning we annot see. we will get final o/p 
// we can do multiple task(since execution happend backend) adv
//faster execution
//user canot se the action on the page. he cannot understand flow/functionality of the test disadv
// preferd only in the devops env . not at the intial stages 

// ssl -- secure socket layers when ur acessing some website its type of security
public class OPtionsClass {
	public static void main(String[] args) {
		
		ChromeOptions options = new ChromeOptions();
	//	options.addArguments("--headless=new");
		options.setExperimentalOption("excludeSwitches", new String[] {"enable-automation"});
		
			WebDriver driver = new ChromeDriver(options);
			driver.get("https://www.opencart.com/index.php?route=cms/demo");
			@Nullable
			String title = driver.getTitle();
			if (title.equals("OpenCart - Demo")) {
				System.out.println("paseed");
			}else {
				System.out.println("Test Faileds");
			}
			
	}
		
	
		
	}
	


