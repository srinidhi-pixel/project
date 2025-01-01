package PraticePrograms;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class SdetExcel {
	public static void main(String[] args) throws IOException {
		FileInputStream file = new FileInputStream("C:\\Users\\ACS\\Desktop\\New Microsoft Excel Worksheet (2).xlsx");
		XSSFWorkbook workbook= new XSSFWorkbook(file);
	            XSSFSheet sheet = workbook.getSheet("Sheet1");

	int totalrows = sheet.getLastRowNum();//his will give last row which is equal to no of rows.count from 0
	int totalcells = sheet.getRow(1).getLastCellNum();// total number of cells.count from 1
    System.out.println(totalrows);
	System.out.println(totalcells);
	
	
	for (int r = 0; r <=totalrows; r++) {// it wil get all 5 rows index from 0. TOTAL 6 ROWS  
		XSSFRow currentrow = sheet.getRow(r);
		
		for (int c = 0; c < totalcells; c++) {  //it will get cell index 0,1,2,3. all 4 cells 
			//currentrow.getCell(c).toString();
			System.out.print(currentrow.getCell(c).toString()+"\t");
		}
		System.out.println();
	}
	 workbook.close();
	 file.close();
	 
	
	}
	


}
