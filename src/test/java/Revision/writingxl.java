package Revision;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class writingxl {
	public static void main(String[] args) throws IOException {
		FileOutputStream os = new FileOutputStream(System.getProperty("user.dir")+"\\testdata\\xlsx.xlsx");
	                  XSSFWorkbook wb = new XSSFWorkbook();
	                     XSSFSheet sheet = wb.createSheet("data");
	                                XSSFRow row = sheet.createRow(0);
	                                row.createCell(0).setCellValue("adi");
	                                row.createCell(1).setCellValue("mal");
	                                row.createCell(2).setCellValue("gol");
	                                
	                                wb.write(os);
	                                wb.close();
	                                
	                                System.out.println("file created");
	                                
	                          

	}

}
