package F_Data_Driven;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Read_Data {
	
	public static void particular_Cell_Data() throws IOException {

		File f = new File("C:\\Users\\DELL\\eclipse-workspace\\Maven_Programs\\Fs Test Cases.xlsx");
		FileInputStream fis = new FileInputStream(f);
		Workbook wb = new XSSFWorkbook(fis);
		Sheet s = wb.getSheetAt(0);
		Row r = s.getRow(7);
		Cell c = r.getCell(5);
		CellType type = c.getCellType();
		
		if (type.equals(CellType.STRING)) {
			String cellValue = c.getStringCellValue();
			System.out.println(cellValue);			
		}
		
		else if (type.equals(CellType.NUMERIC)) {
			double numerincCellValue = c.getNumericCellValue();
			int value = (int) numerincCellValue;
			System.out.println(value);
		}
		
		wb.close();
		System.out.println();
	}
	
	
	public static void all_Data() throws IOException  {
		
		File f = new File("C:\\Users\\DELL\\eclipse-workspace\\Maven_Programs\\Fs Test Cases.xlsx");
		FileInputStream fis = new FileInputStream(f);
		Workbook wb = new XSSFWorkbook(fis);
		Sheet s = wb.getSheet("Automation");
		
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
				double numerincCellValue = c.getNumericCellValue();
				String valueOf = String.valueOf(numerincCellValue);
				System.out.println(valueOf);
			}
		}
		}

		wb.close();
		
		System.out.println();
	}
	
	
	
	
	public static void particular_Row_Data() throws IOException {
		
		File f = new File("C:\\Users\\DELL\\eclipse-workspace\\Maven_Programs\\Fs Test Cases.xlsx");
		FileInputStream fis = new FileInputStream(f);
		Workbook wb = new XSSFWorkbook(fis);
		Sheet s = wb.getSheet("Automation");
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
	
	
	
public static void particular_Column_Data() throws IOException {
		
		File f = new File("C:\\Users\\DELL\\eclipse-workspace\\Maven_Programs\\Fs Test Cases.xlsx");
		FileInputStream fis = new FileInputStream(f);
		Workbook wb = new XSSFWorkbook(fis);
		Sheet s = wb.getSheet("Automation");
		
		for (int i = 0; i <s.getPhysicalNumberOfRows(); i++) {
			Row r = s.getRow(i);
							
			 Cell c = r.getCell(3);
			
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
		particular_Cell_Data();
		all_Data();
		particular_Row_Data();
		particular_Column_Data();
	}

}
