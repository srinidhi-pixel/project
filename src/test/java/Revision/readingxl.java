

package Revision;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Iterator;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class readingxl {
	public static void main(String[] args) throws IOException {
		FileInputStream file = new FileInputStream("C:\\Users\\ACS\\Desktop\\New Microsoft Excel Worksheet.xlsx");
		 XSSFWorkbook wb = new XSSFWorkbook(file);
		                  XSSFSheet sheet = wb.getSheet("sheet1");
		                              int ttlrow = sheet.getLastRowNum(); //6
		                              int  ttlclm = sheet.getRow(1).getLastCellNum(); // totlclm
		                              System.out.println(ttlrow);
		                              System.out.println(ttlclm);
		                              
		                              
		                              for (int r = 1; r<=ttlrow; r++) {
		                            	    XSSFRow row = sheet.getRow(r);
		                            	    System.out.println(row);
		                            	    String un = row.toString();
		                            	    System.out.println(un);
		                            	    
		                            	    
		                            	    for (int c = 0; c<ttlclm; c++) {
		                            	    	  
		                            	    	//System.out.print(row.getCell(c).toString()+"\t");
		                            	    	String pwd = row.getCell(c).toString();
		                            	    	System.out.println(pwd);
		                            	    	  WebDriver driver = new ChromeDriver();
		                            			  driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		                            			  WebDriverWait mywait = new WebDriverWait(driver,Duration.ofSeconds(3000));
		                            			  mywait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//img[@alt='company-branding']"))); 
		                            			  driver.manage().window().maximize();
		                            			   driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys(un);
		                            			   driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys(pwd);
		                            			   driver.findElement(By.xpath("//button[@type='submit']")).click();
		                            	   }
		                            	   
										
									}
		 
		
	
		             
	}

}
