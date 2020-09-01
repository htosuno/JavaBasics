package com.syntax.class09;

import java.util.Scanner;

public class Homework1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int start, end, sumOdd = 0, sumEven = 0, total = 0;
		
		System.out.println("Please enter the starting number:");
		start = scan.nextInt();
		System.out.println("Please enter the ending number:");
		end = scan.nextInt();
		
		for(int i = start; i <= end; i++) {
			if(i % 2==1)sumOdd += i;
			else sumEven += i;
		}
		total = sumEven + sumOdd;
		System.out.println("For the given interval, sum of odd numbers is " + sumOdd);
		System.out.println("For the given interval, sum of even numbers is " + sumEven);
		System.out.println("For the given interval, sum of a numbers is " + total);


	}

}
