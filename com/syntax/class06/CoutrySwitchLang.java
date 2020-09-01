package com.syntax.class06;

import java.util.Scanner;

public class CoutrySwitchLang {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter your Country:");
		String country = scan.next();
		String language;
		switch (country.toLowerCase()) {
		case "england":
		case "australia":
		case "usa":
			language = "English";
			break;
		case "turkey":
			language = "Turkish";
			break;
		case "russia":
			language = "Russian";
			break;
		case "germany":
			language = "German";
			break;

		default:
			language = "unkown";
			break;
		}
		System.out.println("Your native language is " + language);

	}

}
