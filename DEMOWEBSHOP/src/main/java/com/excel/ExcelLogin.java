package com.excel;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelLogin {

	public  String excel_email(int a) throws IOException {
		  
		  FileInputStream fil = new FileInputStream(new File("src\\test\\resources\\TestData\\TestData.xlsx"));
		  XSSFWorkbook workbook = new XSSFWorkbook(fil);
		  XSSFSheet sheet=workbook.getSheet("Sheet1");
			  String un=sheet.getRow(a).getCell(0).getStringCellValue();
			  
        
		return un;
}
	public  String excel_password(int b) throws IOException {
		  
		  FileInputStream fil = new FileInputStream(new File("src\\test\\resources\\TestData\\TestData.xlsx"));
		  XSSFWorkbook workbook = new XSSFWorkbook(fil);
		  XSSFSheet sheet=workbook.getSheet("Sheet1");
		  String pwd=sheet.getRow(b).getCell(1).getStringCellValue();
		  
return pwd;
}
}


