package PraticePrograms;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtils {
	
	public static FileInputStream fi;
	public static FileOutputStream fo;
	public static XSSFWorkbook wb;
	public static XSSFSheet ws;
	public static XSSFRow row;
	public static XSSFCell cell;
	public static CellStyle style;
	
	public static int geRowCount(String xlfile,String xlsheet) throws IOException {
		
		fi=new FileInputStream(xlfile);//file path
		wb= new XSSFWorkbook(fi);
		ws=wb.getSheet(xlsheet);
		int rowcount = ws.getLastRowNum();
		wb.close();
		fi.close();
		return rowcount;
		
	}
public static int geCellCount(String xlfile,String xlsheet,int RowNum) throws IOException {
		
		fi=new FileInputStream(xlfile);//file path
		wb= new XSSFWorkbook(fi);
		ws=wb.getSheet(xlsheet);
	     row = ws.getRow(RowNum);
		int cellcount = row.getLastCellNum();
		wb.close();
		fi.close();
		return cellcount;
		
	}
public static String getCellData(String xlfile,String xlsheet,int rownum,int colnum) throws IOException {
	
	fi=new FileInputStream(xlfile);//file path
	wb= new XSSFWorkbook(fi);
	ws=wb.getSheet(xlsheet);
	  row = ws.getRow(rownum);
	cell = row.getCell(colnum);
	wb.close();
	fi.close();
	
	String data;
	try {
		//data=cell.toString(); read the data from the cell
		DataFormatter formatter = new DataFormatter();//returns the formatted value of cel as a string regardless of cell type. it contains number ,text 
		data = formatter.formatCellValue(cell);
		
	} catch (Exception e) {
		data="";//""empty cell not null
	}
	wb.close();
	fi.close();
	return data;
	
}

}
