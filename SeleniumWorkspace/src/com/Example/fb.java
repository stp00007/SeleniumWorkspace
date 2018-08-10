package com.Example;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.ss.util.CellAddress;
import org.testng.annotations.Test;

public class fb 
{
	@Test
	public void  abc() throws EncryptedDocumentException, InvalidFormatException, IOException
	{
	String path = "E:\\TE2\\actitime\\excel\\log.xlsx";
		FileInputStream file= new FileInputStream(path);
//		Workbook workbook = WorkbookFactory.create(file);
//		Sheet sheet = workbook.getSheet("sheet1");
//		Row row = sheet.getRow(2);
//		Cell cell = row.getCell(1);
//		String val = cell.getStringCellValue();
//		System.out.println(val);
		
	 Sheet val = WorkbookFactory.create(file).getSheet("sheet1");
		 CellAddress str = val.getActiveCell();
		System.out.println(str);
	}
}
