package com.practice.utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class WriteExcel {
	
	
	File file;
	
	FileInputStream fis;
	
	FileOutputStream fos;
	
	@Test
	
	public void writeexcel(int row , int col , String result) throws IOException, InvalidFormatException
	{
 file = new File(System.getProperty("user.dir")+"/src/test/java/com/practice/testdata/logindataresult.xls");
 
 fis = new FileInputStream(file) ;
 
 
 org.apache.poi.ss.usermodel.Workbook wb = WorkbookFactory.create(fis);
//	XSSFSheet st = wb.getSheetAt(0);
	 
	 org.apache.poi.ss.usermodel.Sheet st = wb.getSheet("Sheet1");
	 
	 
	 st.getRow(row).createCell(col).setCellValue(result);
		
	 
	 
	 fos = new  FileOutputStream(file);
	 
	 wb.write(fos);
	}

}
