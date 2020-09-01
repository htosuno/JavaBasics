package com.syntax.class08;

public class SkipNumbers {
	public static void main(String[] args) {
		//Print nums 1 to 10 but skip 5, 6, 7
		System.out.println("Skipping numbers 5, 6, 7");
		for(int i =1; i < 11; i++) {
			if(i == 5 || i == 6 || i == 7)continue;
			System.out.println(i);
		}
		//Print nums 1 to 100 but skip 35 to 55
		System.out.println("Skipping numbers 35 to 55");
		for(int i =1; i < 101; i++) {
			if(i >= 35 && i <= 55)continue;
			System.out.print(i + " ");
		}
		//Print numbers from 1 to 50 except those that are divisible by 3
		System.out.println("Skipping numbers divisable by 3");
		for(int i =1; i < 51; i++) {
			if(i%3==0)continue;
			System.out.print(i + " ");
		}
	}

}
