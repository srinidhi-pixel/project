package BasicPrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrp {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
		driver.manage().window().maximize();
		
		
		WebElement sthm = driver.findElement(By.xpath("//*[@id='box2']"));
		WebElement sweden = driver.findElement(By.xpath("//*[@id='box102']"));
		Thread.sleep(2000);
		Actions a = new Actions(driver);
//        a.clickAndHold(sweden).moveToElement(sweden).release().build().perform();

		a.dragAndDrop(sthm, sweden).build().perform();
	}

}
