package com.syntax.class34;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Task1 {

	public static void main(String[] args) throws IOException {
		String filePath = System.getProperty("user.dir") + "/testdata/Class34Task1.xlsx";
		FileInputStream fis = new FileInputStream(filePath);

		Workbook book = new XSSFWorkbook(fis);
		Sheet sheet = book.getSheet("My Sheet");

		sheet.createRow(1).createCell(0).setCellValue("halil123");
		sheet.getRow(1).createCell(1).setCellValue("halil123");

		sheet.createRow(2).createCell(0).setCellValue("james");
		sheet.getRow(2).createCell(1).setCellValue("james123");
		
		FileOutputStream fos = new FileOutputStream(filePath);
		book.write(fos);
		book.close();
		fos.close();

	}

}
