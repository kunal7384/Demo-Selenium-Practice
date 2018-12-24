package com.utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.testng.annotations.Test;

public class ExcelWrite {
	
	static File file;
	
	static FileInputStream fis ;
	
	FileOutputStream fos;
	
	XSSFRow row;
	
	XSSFCell cell;
	
	
	
     @Test
	
	public  static void writeexcel(String path ,int row , int col ,String result) throws IOException, InvalidFormatException
	{

    file = new File("F:\\Selenium November Code 2018\\Framework\\src\\test\\java\\com\\testdata\\testwrite.xls")	;
    
    
    fis = new FileInputStream(file);
    
  //  XSSFWorkbook wb = new XSSFWorkbook(fis);
	
	
	 org.apache.poi.ss.usermodel.Workbook wb = WorkbookFactory.create(fis);
//	XSSFSheet st = wb.getSheetAt(0);
	 
	 org.apache.poi.ss.usermodel.Sheet st = wb.getSheet("Sheet1");
	 
	st.getRow(row).createCell(col).setCellValue(result);
		
		FileOutputStream fos = new FileOutputStream(file);
		
		wb.write(fos);
	 
    
    	 
	}
}
