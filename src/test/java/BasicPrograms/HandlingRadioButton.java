package BasicPrograms;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingRadioButton {
	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		
		
		WebElement r1 = driver.findElement(By.xpath("//input[@value='radio1']"));
		System.out.println(r1.isDisplayed());
		System.out.println(r1.isEnabled());
		System.out.println(r1.isSelected());
		r1.click();
     
		WebElement r2 = driver.findElement(By.xpath("//input[@value='radio2']"));
		System.out.println(r2.isDisplayed());
		System.out.println(r2.isEnabled());
		System.out.println(r2.isSelected());
		r2.click();
		WebElement r3 = driver.findElement(By.xpath("//input[@value='radio3']"));
		System.out.println(r3.isDisplayed());
		System.out.println(r3.isEnabled());
		System.out.println(r3.isSelected());
		r3.click();
//		
//	 String text = driver.findElement(By.xpath("//label[text()='radio1']")).getText();
//		System.out.println(text);
//		
		List<WebElement> ar = driver.findElements(By.xpath("//input[@name='radioButton']"));
		for (int i = 0; i <ar.size(); i++) {
			ar.get(i).click();
		}
//		
//		String text = driver.findElement(By.xpath("//*[text()='Username']")).getText();
//		System.out.println(text);
//		
		
		}

}
