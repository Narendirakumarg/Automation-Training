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
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class D14CreateLoginData {
	
	String fPath = "C:\\Users\\Rajesh\\eclipse-workspace\\SeleniumAutomationProject\\Student1.xlsx";
	File file;
	FileOutputStream fos;
	XSSFWorkbook wb;
	XSSFSheet sheet;
	XSSFRow row;
	XSSFCell cell;
	int index = 0;	
	
  @Test(dataProvider = "getLogindata")
  public void writeData(String us, String ps, String rs) {
	  sheet.createRow(index).createCell(0).setCellValue(us);
	  sheet.getRow(index).createCell(1).setCellValue(ps);
	  sheet.getRow(index).createCell(2).setCellValue(rs);
	  index++;
  }

  @DataProvider
  public Object[][] getLogindata() {
    return new Object[][] {
      new Object[] { "Username", "password", "Result" },
      new Object[] { "admin", "admin123", "Not run" },
      new Object[] { "min", "min123", "Not run" },
      new Object[] { "ad", "ad123", "Not run" },
      new Object[] { "ad", "ad123", "Not run" },
    };
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
