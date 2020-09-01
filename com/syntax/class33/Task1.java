package com.syntax.class33;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Task1 {

	public static void main(String[] args) throws IOException {
		String filePath = "configs\\Browse.properties";

		FileInputStream fis = new FileInputStream(filePath);

		Properties prop = new Properties();
		prop.load(fis);

		String value1 = prop.getProperty("browser");
		System.out.println(value1);
				
		String value2 = prop.getProperty("url");
		System.out.println(value2);		

	}

}
