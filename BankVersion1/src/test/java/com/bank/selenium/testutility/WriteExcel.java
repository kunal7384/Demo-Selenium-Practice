package com.bank.selenium.testutility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.Test;

public class WriteExcel {
	
	@Test
	
	public void writeExcelSheet(int row , int col ,String result) throws InvalidFormatException, IOException
	{
		
	File file = new File(System.getProperty("user.dir")+"/src/test/java/com/bank/selenium/testdata/testwrite.xls")	;
		
	FileInputStream fis = new FileInputStream(file)	;
	
	org.apache.poi.ss.usermodel.Workbook wb = WorkbookFactory.create(fis);
//	XSSFSheet st = wb.getSheetAt(0);
	 
	 org.apache.poi.ss.usermodel.Sheet st = wb.getSheet("Sheet1");
	 
	 
	 st.getRow(row).createCell(col).setCellValue(result);
	 
	 FileOutputStream fos = new FileOutputStream(file);
	 
		wb.write(fos);

	}
	

}
