package com.syntax.class34;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DataFromExcelIntoMap {

	public static void main(String[] args) throws IOException {
		String xlPath = System.getProperty("user.dir") + "/testdata/sampleTestData.xlsx";
		FileInputStream fis = new FileInputStream(xlPath);

		Workbook book = new XSSFWorkbook(fis);

		Sheet sheet = book.getSheet("Sample");

		int rows = sheet.getPhysicalNumberOfRows();
		int cols = sheet.getRow(0).getPhysicalNumberOfCells();

		List<Map<String, String>> xlList = new ArrayList<>();

		for (int r = 1; r < rows; r++) {
			Map<String, String> map = new LinkedHashMap<>();

			for (int c = 0; c < cols; c++) {
				String key = sheet.getRow(0).getCell(c).toString();
				String value = sheet.getRow(r).getCell(c).toString();
				map.put(key, value);

			}
			xlList.add(map);
		}
		for (Map<String, String> map : xlList) {
			System.out.println(map);
		}

		book.close();
	}
}
