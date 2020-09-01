package com.syntax.class08;

import java.util.Scanner;

public class ApplyCreditCard {

	public static void main(String[] args) {
		// Create a program that will be asking user to apply for a credit card 10 times. 
		// As soon you get an “yes” from a user program should stop asking
		Scanner scan = new Scanner(System.in);
		String s;
		for(int i = 1; i < 11; i++) {
			System.out.println("Do you want to apply for a credit card?");
			s = scan.next();
			if(s.equalsIgnoreCase("yes")) {
				System.out.println("Thank you for applying for a credit card.");
				break;
			}
			
			
		}

	}

}
