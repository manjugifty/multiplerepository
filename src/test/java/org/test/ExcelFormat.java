package org.test;

import java.io.File;
import java.io.FileInputStream;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelFormat {

	public static void main(String[] args) throws Exception {
		File excelLoc = new File("C:\\Users\\vigne\\eclipse-workspace\\MavenProject\\src\\test\\resources\\Excel Read.xlsx");
		FileInputStream fIn = new FileInputStream(excelLoc);
		Workbook w = new XSSFWorkbook(fIn);
		Sheet s = w.getSheet("Data");
		for (int i = 0; i < s.getPhysicalNumberOfRows(); i++) {
			Row r = s.getRow(i);
			for (int j = 1; j < r.getPhysicalNumberOfCells(); j++) {
				Cell c = r.getCell(j);
				int type = c.getCellType();
				if (type==1) {
					String sValue = c.getStringCellValue();
					System.out.println(sValue);
				}
				
					 else if (type==0) {
					if (DateUtil.isCellDateFormatted(c)) {
						Date dte = c.getDateCellValue();
						SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
						String dValue = sdf.format(dte);
						System.out.println(dValue);
					}
					else {
						double d = c.getNumericCellValue();
						long l = (long)d;
						String nValue = String.valueOf(l);
						System.out.println(nValue);
					}
				}

				}
			}
		}
		
	}
	

