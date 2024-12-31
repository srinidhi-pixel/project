package pageFactoryDesignPattern;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
public class LoginPage2 {
	//using page object model
	//constructor  will intiate the web driver
	
	WebDriver driver; //class var
	LoginPage2(WebDriver driver){//driver local parameter
		this.driver = driver;  // this will intiate webdriver auto
	}
	
	
	//locators

By textusrnameloc=	By.xpath("//input[@name='username']");
By textpwdloc=	By.xpath("//input[@name='password']");
By loginbuttonloc=	By.xpath("//button[@type='submit']");


//Action methods

public void setUserName(String user) {
	driver.findElement(loginbuttonloc).sendKeys(user);;
}

public void setpwd(String pwd) {
	driver.findElement(textpwdloc).sendKeys(pwd);;
}
public void clickBtn() {
	driver.findElement(loginbuttonloc).click();;
}

}
