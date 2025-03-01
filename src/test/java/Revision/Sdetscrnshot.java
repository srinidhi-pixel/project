package Revision;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sdetscrnshot {
public static void main(String[] args) throws IOException {
	WebDriver driver = new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get("https://www.nopcommerce.com/en/demo");
	driver.manage().window().maximize();
	 
	//1) full page scrnshot
	TakesScreenshot ts = (TakesScreenshot)driver;
	File srcfile = ts.getScreenshotAs(OutputType.FILE);
    File dstfile = new File(System.getProperty("user.dir")+"\\SCREENSHOT\\fullpage.png");	
   
    FileUtils.copyFile(srcfile, dstfile);


//2) specific section. no need to use takescrenshot as interface. webelemnt is also interface. child interfcae of searchcontex 
 WebElement featuredproduct = driver.findElement(By.xpath("//*[@]"));
 featuredproduct.getScreenshotAs(OutputType.FILE);
 //we dont take screenshot foe every tc if there are failed tc we will capture sc if pass we wil report 
 
}
}