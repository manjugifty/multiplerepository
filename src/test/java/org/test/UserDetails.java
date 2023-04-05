package org.test;

import java.io.File;
import java.io.FileInputStream;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class UserDetails {
	public static void main(String[] args) throws Exception {
		File excelLoc = new File ("C:\\Users\\vigne\\eclipse-workspace\\MavenProject\\Excel\\User Details.xlsx");
		FileInputStream fIn = new FileInputStream(excelLoc);
		Workbook w = new XSSFWorkbook(fIn);
		Sheet s = w.getSheet("Details");
		for (int i = 0; i < s.getPhysicalNumberOfRows(); i++) {
			Row r = s.getRow(i);
			for (int j = 0; j < r.getPhysicalNumberOfCells(); j++) {
				Cell c = r.getCell(j);
				System.out.println(c);
			}
			
		}
	}

}
