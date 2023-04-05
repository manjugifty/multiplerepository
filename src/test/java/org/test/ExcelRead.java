package org.test;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelRead {

	public static void main(String[] args) throws IOException {
		
		File excelLoc = new File("C:\\Users\\vigne\\eclipse-workspace\\MavenProject\\src\\test\\resources\\Excel.xlsx");
		FileInputStream fIn = new FileInputStream(excelLoc);
		Workbook w = new XSSFWorkbook(fIn);
		Sheet s = w.getSheet("Data");
		Row r = s.getRow(1);
		Cell c = r.getCell(1);
		System.out.println(c);
		int rows = s.getPhysicalNumberOfRows();
		int cells = r.getPhysicalNumberOfCells();
		System.out.println(rows);
		System.out.println(cells);
		
		
		
	}
}
