package PraticePrograms;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

//Excel file-->workbook==>sheets-->rows-->cells
public class WritingExcel {

	public static void main(String[] args) throws IOException {
		
FileOutputStream file = new FileOutputStream(System.getProperty("user.dir")+"\\testdata\\myfie.xlsx");
XSSFWorkbook workbook = new XSSFWorkbook();
XSSFSheet sheet = workbook.createSheet("Data");
XSSFRow row1 = sheet.createRow(0);
row1.createCell(0).setCellValue("welcome");
row1.createCell(1).setCellValue("java");
row1.createCell(2).setCellValue("Automation");


XSSFRow row2 = sheet.createRow(1);
row2.createCell(0).setCellValue("selenium");
row2.createCell(1).setCellValue("tenstng");
row2.createCell(2).setCellValue("manual");


XSSFRow row3 = sheet.createRow(2);
row3.createCell(0).setCellValue("postman");
row3.createCell(1).setCellValue("api");
row3.createCell(2).setCellValue("restassred");


workbook.write(file);
workbook.close();

file.close();
System.out.println(" file created");
	}

}
