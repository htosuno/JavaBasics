package com.syntax.class08;

import javax.jws.soap.SOAPBinding;

public class Homework {

	public static void main(String[] args) {
		// Print numbers 100 to 1
		for (int i = 100; i >= 1; i--) {
			System.out.println(i);
		}
		// Print odd numbers between 20 and 50
		System.out.println("Print odd numbers between 20 and 50");
		for (int i = 21; i <= 50; i+=2 ) {
			System.out.print(i + ", ");
		}
		System.out.println();
		// Print odd numbers between 20 and 50 (2nd way)
		System.out.println("Print odd numbers between 20 and 50 (2nd way)");
		for (int i = 21; i < 50; i++ ) {
			if(i % 2 == 1) System.out.print(i + ", ");
		}

	}

}
