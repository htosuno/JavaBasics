package com.syntax.class35;

import java.io.FileInputStream;

public class ExceptionTypes {

	public static void main(String[] args) {
		
//		Thread.sleep(2000);
		String xlPath = System.getProperty("user.dir") + "/testdata/sampleTestData.xls";
//		FileInputStream fis = new FileInputStream(xlPath);
		
		//unchecked exception - that are not checked by compiler
		int a=12;
		int b=0;
		
//		System.out.println(a/b);//ArithmeticException
		
		String str=null;
		System.out.println(str.length());//NullPointerException
	}

}
