package com.syntax.class33;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class WritingToPropertyFile {

	public static void main(String[] args) throws IOException {
		String filePath = "configs\\Example.properties";

		FileInputStream fis = new FileInputStream(filePath);

		Properties prop = new Properties();
		prop.load(fis);

		prop.setProperty("address", "15241");
		
		String newFile= "configs/NewFile.properties";
		
		FileOutputStream fos = new FileOutputStream(newFile);

		prop.store(fos, "Added address");


	}

}
