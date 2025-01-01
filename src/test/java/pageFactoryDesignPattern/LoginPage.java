package pageFactoryDesignPattern;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	//using pagefactory
	WebDriver driver;
	 LoginPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	//locating elements
@FindBy(xpath="//input[@placeholder='Username']")
WebElement  usernamefield;


@FindBy(xpath="//input[@placeholder='Password']")
WebElement passwordfield;

@FindBy(xpath="//button[@type='submit']")
WebElement loginbutton;

@FindBy(tagName="a")
List<WebElement>links;

//return elemennts using mtehods



public void setUserName(String user) {
	usernamefield.sendKeys(user);
}

public void setpwd(String pwd) {
	passwordfield.sendKeys(pwd);
}
public void clickBtn() {
	 loginbutton.click();
}
}
