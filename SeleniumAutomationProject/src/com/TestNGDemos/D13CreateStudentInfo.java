package com.TestNGDemos;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class D13CreateStudentInfo {
	String fPath = "C:\\Users\\Rajesh\\eclipse-workspace\\SeleniumAutomationProject\\Student.xlsx";
	
	File file;
	FileOutputStream fos;
	XSSFWorkbook wb;
	XSSFSheet sheet;
	XSSFRow row;
	XSSFCell cell;
	
	// hssfWorkbook - Xls file need to use. 
	
  @Test
  public void writeTheData() {
	  row = sheet.createRow(0); //Create 1st row
	  cell = row.createCell(0); //create 1st cell in 1st row
	  cell.setCellValue("Naren");

	  //row = sheet.createRow(1);
	  cell = row.createCell(1);
	  cell.setCellValue("Killer");
	  
	  sheet.createRow(1).createCell(0).setCellValue("Villan");
	  sheet.getRow(1).createCell(0).setCellValue("Millan");
	  
  }
  @BeforeTest
  public void beforeTest() throws FileNotFoundException {
	  file = new File(fPath);
	  fos = new FileOutputStream(file);
	  wb = new XSSFWorkbook();			// Create a new workbook
	  sheet = wb.createSheet("MySheet"); 	// Create a new in workbook
  }

  @AfterTest
  public void afterTest() throws IOException {
	  wb.write(fos);			//Write the data to excel file
	  wb.close();
	  fos.close();
  }

}
