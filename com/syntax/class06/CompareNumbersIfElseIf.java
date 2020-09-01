package com.syntax.class06;

import java.util.Scanner;

public class CompareNumbersIfElseIf {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Please enter the first number");
		double a = scan.nextDouble();
		
		System.out.println("Please enter the second number");
		double b = scan.nextDouble();
		
		System.out.println("Please enter the third number");
		double c = scan.nextDouble();

		double largest = 0;
				
		if (a > b) largest = a;
		else largest = b;
		if (c > largest) largest = c;
		
		System.out.println("Largest number is " + largest);
	}

}
