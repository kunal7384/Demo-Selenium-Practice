
package com.utility;

import java.io.File;
import java.io.IOException;

import org.testng.annotations.Test;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

@Test
public class ReadExcel {
	
	File file ;
	
	
	Workbook wb;
	Sheet st;
	
	
	
	public ReadExcel(String path)
	{
		
		
	 file = new File(path);
	
	
try {
	wb = Workbook.getWorkbook(file);
} catch (BiffException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
} catch (IOException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
		
	st = wb.getSheet(0)	;
		
	}

	public String getData(int col ,int row)
	{
		 
	return st.getCell(col,row)	.getContents();
	

		
	}
}
