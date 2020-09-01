package com.syntax.class07;

public class Print50to1and1to20 {

	public static void main(String[] args) {
		int i = 50;
		System.out.println("Printing 50 to 1");
		while(i >= 1) {
			System.out.println(i);
			i--;
		}
		i++;
		System.out.println("Printing odds 1 to 20");
		while(i <= 20) {
			System.out.println(i);
			i+=2;
		}

	}

}
