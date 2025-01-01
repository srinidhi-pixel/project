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
import org.testng.Assert;
import org.testng.annotations.Test;

public class ExcelSheet1 {
	@Test
	public void excelSheet() throws IOException, InterruptedException {
		
		FileInputStream fs = new FileInputStream("C:\\Users\\ACS\\Desktop\\New Microsoft Excel Worksheet.xlsx");
		XSSFWorkbook worksheet= new XSSFWorkbook(fs);
		XSSFSheet sheetAt = worksheet.getSheetAt(0);
		    XSSFRow row = sheetAt.getRow(1);
		    XSSFCell cell = row.getCell(0);
		    String un = cell.toString();
		     XSSFCell cell2 = row.getCell(1);
		     String pwd = cell2.toString();
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys(un);
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys(pwd);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		String dshbord = driver.getCurrentUrl();
	    String urlAftrLogin="https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index";
	    
	    Assert.assertEquals(dshbord, urlAftrLogin);
	    System.out.println("passed");
	}

}
