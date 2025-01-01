package TestNgDemo;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;


public class ExcelSheets{
	@Test
	public void handlingExcelSheet() throws IOException, InterruptedException {
		
		FileInputStream fs = new FileInputStream("C:\\Users\\ACS\\Desktop\\New Microsoft Excel Worksheet.xlsx");
		
		XSSFWorkbook workSheet= new XSSFWorkbook(fs);
	    XSSFSheet sheet= workSheet.getSheetAt(0);
		XSSFRow row= sheet.getRow(1);
		XSSFCell cell1 = row.getCell(0);
		
		
		String username=cell1.toString();
		System.out.println(cell1);
		
		
		XSSFCell cell2 =row.getCell(1);
		String pwd=cell2.toString();
		System.out.println(cell2);
		
		
		WebDriver driver =new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		Thread.sleep(3000);
		WebElement un = driver.findElement(By.xpath("//input[@placeholder='Username']"));
		un.sendKeys(username);
		Thread.sleep(3000);
		WebElement pwd1 = driver.findElement(By.xpath("//input[@placeholder='Password']"));
		pwd1.sendKeys(pwd);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(3000);
		
		String expectedUrl=driver.getCurrentUrl();
		
		String urlAfterLogin="https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index";
		
		Assert.assertEquals(urlAfterLogin, expectedUrl);
		
		System.out.println("Test Case Passed Successfully");

	}

}
