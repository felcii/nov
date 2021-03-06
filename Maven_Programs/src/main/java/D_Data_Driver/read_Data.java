package D_Data_Driver;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class read_Data {
	
	public static void particular_cell_data() throws IOException {
		
		File f = new File(
"C:\\Users\\DELL\\eclipse-workspace\\Maven_Programs\\auto tc d.xlsx");

		FileInputStream fis =  new FileInputStream(f);
		Workbook wb = new XSSFWorkbook(fis);
		Sheet s = wb.getSheetAt(0);
		Row r = s.getRow(2);
		Cell c = r.getCell(2);
		CellType type = c.getCellType();
		
		if (type.equals(CellType.STRING)) {
			String cellValue = c.getStringCellValue();
			System.out.println(cellValue);
		}
		
		else if (type.equals(CellType.NUMERIC)) {
			double numericCellValue = c.getNumericCellValue();
			int value = (int) numericCellValue;
			System.out.println(value);
			
		}

		wb.close();
		System.out.println();

	}
	
	
public static void all_data() throws IOException {
		
		File f = new File(
"C:\\Users\\DELL\\eclipse-workspace\\Maven_Programs\\auto tc d.xlsx");

		FileInputStream fis =  new FileInputStream(f);
		Workbook wb = new XSSFWorkbook(fis);
		Sheet s = wb.getSheetAt(0);
		
		for (int i = 0; i < s.getPhysicalNumberOfRows(); i++) {
			Row r = s.getRow(i);
			
		for (int j = 0; j < r.getPhysicalNumberOfCells(); j++) {
			Cell c = r.getCell(j);
			
			CellType type = c.getCellType();
				
			if (type.equals(CellType.STRING)) {
				String cellValue = c.getStringCellValue();
				System.out.println(cellValue);
			}
			
			
			else if (type.equals(CellType.NUMERIC)) {
				double numericCellValue = c.getNumericCellValue();
				String valueOf = String.valueOf(numericCellValue);
				System.out.println(valueOf);
			}
			
			}
		}
		
		wb.close();
		System.out.println();

		}
	
public static void particular_row_data() throws IOException {
	
		File f = new File(
				"C:\\Users\\DELL\\eclipse-workspace\\Maven_Programs\\auto tc d.xlsx");

		FileInputStream fis =  new FileInputStream(f);
		Workbook wb = new XSSFWorkbook(fis);
		Sheet s = wb.getSheetAt(0);
		Row r = s.getRow(2);
		
		for (int i = 0; i <r.getPhysicalNumberOfCells(); i++) {
			Cell c = r.getCell(i);
			
			CellType type = c.getCellType();
			
			if (type.equals(CellType.STRING)) {
				String cellValue = c.getStringCellValue();
				System.out.println(cellValue);				
			}
			
			else if (type.equals(CellType.NUMERIC)) {
				double numericCellValue = c.getNumericCellValue();
				int numericValue = (int) numericCellValue;
				String strng = Integer.toString(numericValue);
				System.out.println(strng);
			}
		}
		wb.close();
		
		System.out.println();
	}


public static void particular_column_data() throws IOException {
	
	File f = new File("C:\\Users\\DELL\\eclipse-workspace\\Maven_Programs\\auto tc d.xlsx");
	FileInputStream fis = new FileInputStream(f);
	Workbook wb = new XSSFWorkbook(fis);
	Sheet s = wb.getSheetAt(0);
	
	for (int i = 0; i <s.getPhysicalNumberOfRows(); i++) {
		Row r = s.getRow(i);
						
		 Cell c = r.getCell(4);
		
		CellType type = c.getCellType();
		
		if (type.equals(CellType.STRING)) {
			String cellValue = c.getStringCellValue();
			System.out.println(cellValue);				
		}
		
		else if (type.equals(CellType.NUMERIC)) {
			double numericCellValue = c.getNumericCellValue();
			int numericValue = (int) numericCellValue;
			String strng = Integer.toString(numericValue);
			System.out.println(strng);
		}
	}
	
	wb.close();
	
	System.out.println();
}

	public static void main(String[] args) throws IOException {
		
		particular_cell_data();
		all_data();
		particular_row_data();
		particular_column_data();
	}
	

}
