package PraticePrograms;

import java.time.Duration;
import java.util.Iterator;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SdetWebStaticTables {
public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	driver.get("https://testautomationpractice.blogspot.com/");
	driver.manage().window().maximize();
	//1) count no of rows in the table
int rows = driver.findElements(By.xpath("//table[@name='BookTable']//tr")).size();// every row is a webelement. multiple table
	
//	int rows =	driver.findElements(By.tagName("tr")).size();// this will count all rows in the web page. use this only u  have single table
	System.out.println("Number of rows:"+rows);
	
	
	//2) count no of columns
	int column = driver.findElements(By.xpath("//table[@name='BookTable']//th")).size();
	System.out.println("Number of column:"+column);
//	int column =	driver.findElements(By.tagName("th")).size();
//	System.out.println("Number of column:"+column);
	
	
	//3) read data from specific row and column(ex: 5th row and 1st colum)
	WebElement td = driver.findElement(By.xpath("//table[@name='BookTable']//tr[5]//td[1]"));
	System.out.println(td.getText());
	
	
//4) read data from all the rows and clms
	
//	for (int r = 2; r <=rows; r++) {
//		 for (int c = 1; c<=column; c++) {
//			 WebElement td1 = driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td["+c+"]"));
//			 // u cannot pass var directly into the x path so this is the syntax
//			 
//			 System.out.print(td1.getText()+"t"); // one tab space
//		}
//		 System.out.println();
//	}
  
	//5) print book names whose author is mukesh
//	
//	for (int r = 2; r <=rows; r++) {
//		
//		  WebElement td1 = driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td[2]"));// data is in 2nd column so td2.
//	//	 System.out.println(td1.getText());// we got all the rows and 2nd column
//		if (td1.getText().equals("Mukesh")) {//we first name and last name we ca use contains method 
//			 WebElement td2 = driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td[1]"));
//			 //same row data is der in colum1
//			 System.out.println(td2.getText()+"\t"+td1.getText());
//		} 
//		 
//	}
	
	//6)find total price of al the boks
	
	int total =0;
	
	for (int r = 2; r <=rows; r++) {
	
		   String price = driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td[4]")).getText();// data is in 2nd column so td2.
		  
		 total=total+Integer.parseInt(price);
	}
	
	System.out.println("Total price of the book:"+total);
}
}
