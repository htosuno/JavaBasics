package com.syntax.class35;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;

public class Task2 {

	static List<Exception> exceptionMethod() {
		List<Exception> eList = new ArrayList<Exception>();

		try {
			System.out.println(10 / 0);
		} catch (ArithmeticException ae) {
			eList.add(ae);
		}

		try {
			FileInputStream fis = new FileInputStream("");
		} catch (FileNotFoundException fne) {
			eList.add(fne);
		}

		String str = null;
		try {
			System.out.println(str.length());
		} catch (NullPointerException npe) {
			eList.add(npe);
		}

		int[] array = { 10, 20 };
		try {
			System.out.println(array[2]);
		} catch (ArrayIndexOutOfBoundsException aobe) {
			eList.add(aobe);
		}
		return eList;

	}

	public static void main(String[] args) {
		List <Exception> eL = exceptionMethod();
		for (Exception e : eL) {
//			System.out.println(e.getMessage());
			System.out.println(e);
		}
	}

}
