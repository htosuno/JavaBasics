package com.syntax.class35;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter number");

		try {
			int num = sc.nextInt();
			System.out.println("You entered : " + num);

		} catch (InputMismatchException ime) {
			System.out.println("You did not enter a number");
		}
		System.out.println("Bye");

	}

}
