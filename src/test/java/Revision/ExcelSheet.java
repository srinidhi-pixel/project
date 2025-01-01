package Revision;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.jspecify.annotations.Nullable;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import junit.framework.Assert;

public class ExcelSheet {
	@Test
	public void handlingExcelSheet() throws IOException {
		
		FileInputStream fs = new FileInputStream("C:\\Users\\ACS\\Desktop\\New Microsoft Excel Worksheet.xlsx");
		XSSFWorkbook worksheet = new XSSFWorkbook(fs);
		 XSSFSheet sheetAt = worksheet.getSheetAt(0);
		  XSSFRow row = sheetAt.getRow(1);
		  XSSFCell cell1 = row.getCell(0);
		  
		  String un = cell1.toString();
		
		  System.out.println(cell1);
		  
		  XSSFCell cell2 = row.getCell(1);
		  String pwd = cell2.toString();
		  System.out.println(cell2);
		  
		  
		  WebDriver driver = new ChromeDriver();
		  driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		  WebDriverWait mywait = new WebDriverWait(driver,Duration.ofSeconds(3000));
		  mywait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//img[@alt='company-branding']"))); 
		  driver.manage().window().maximize();
		   driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys(un);
		   driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys(pwd);
		   driver.findElement(By.xpath("//button[@type='submit']")).click();
		   
		   
		String currentUrl = driver.getCurrentUrl();
		
		String loginaftrurl="https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index";
		
	Assert.assertEquals(currentUrl, loginaftrurl);
	System.out.println("pased");
		
	}

}
