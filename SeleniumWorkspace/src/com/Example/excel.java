package com.Example;

import org.testng.annotations.Test;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class excel 
{
	@Test
	public void afrin() throws EncryptedDocumentException, InvalidFormatException, IOException
	{
		String path = "C:\\Users\\Dell\\SeleniumWorkspace\\SeleniumWorkspace\\excel\\log.xlsx";
		FileInputStream file = new FileInputStream(path);
		Workbook book = WorkbookFactory.create(file);
		Sheet sheet = book.getSheet("sheet1");
		Row row = sheet.getRow(0);
		Cell cell = row.getCell(0);
		 String str = cell.getStringCellValue();
		System.out.println(str);
		
		
	}
}
