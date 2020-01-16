package com.highaltitude;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Project1 {
	
	public static String getData(int rowNo, int cellNo) throws Throwable {
		
		String v = null;
		
		File loc = new File("C:\\Users\\GT Sanatorium\\Desktop\\Sridharan Project\\Project\\DataType\\Project Excel.xlsx");
		
		FileInputStream s = new FileInputStream(loc);
		Workbook w = new XSSFWorkbook(s);
		
		Sheet s1 = w.getSheet("Sheet1");
		Row r = s1.getRow(rowNo);
		Cell c = r.getCell(cellNo);
		v = c.getStringCellValue();
		return v;
		 

	}
	
	

	

}
