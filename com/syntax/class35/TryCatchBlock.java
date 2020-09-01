package com.syntax.class35;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class TryCatchBlock {

	public static void main(String[] args) {
		String xlPath = System.getProperty("user.dir") + "/sampleTestData.xlsx";
		try {
			FileInputStream fis = new FileInputStream(xlPath);
		} catch (FileNotFoundException fne) {// catching right exception
			System.out.println("I caught the exception");
		}

		System.out.println("------------------------");

		int[] array = { 10, 20 };

		try {
			System.out.println(array[2]);

		} catch (ArrayIndexOutOfBoundsException aiob) {
			System.out.println("I caught Array Index Out Of Bounds Exception !");
		}

		System.out.println("End of the code");

	}

}
