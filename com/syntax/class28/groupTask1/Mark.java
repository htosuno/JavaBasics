package com.syntax.class28.groupTask1;

public abstract class Mark {
	abstract double getPercentage();

	public static void main(String[] args) {
		Mark stA=new StudentA(2, 3, 4);
		Mark stB=new StudentB(2, 3, 4, 4);
		System.out.println(stA.getPercentage());
		System.out.println(stB.getPercentage());

	}

}

class StudentA extends Mark {
	double a, b, c;

	public StudentA(double a, double b, double c) {
		this.a = a;
		this.b = b;
		this.c = c;

	}

	double getPercentage() {
		return (a + b + c) / 3;
	}

}

class StudentB extends Mark {
	double a, b, c, d;

	public StudentB(double a, double b, double c, double d) {
		this.a = a;
		this.b = b;
		this.c = c;
		this.d = d;

	}

	double getPercentage() {
		return (a + b + c + d) / 4;
	}

}