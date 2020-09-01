package com.syntax.class20;

public class Student {
	String name;
	double grade1, grade2, grade3;

	Student(String Sname, double g1, double g2, double g3) {
		name = Sname;
		grade1 = g1;
		grade2 = g2;
		grade3 = g3;
	}

	double average() {
		return (grade1 + grade2 + grade3) / 3;
	}

}
