package com.syntax.class20;

public class TestStudent {

	public static void main(String[] args) {
		Student s1 = new Student("Ali", 2, 3, 4);
		Student s2 = new Student("Tom", 4, 3, 4);
		Student s3 = new Student("Jhon", 2, 4, 4);
		Student s4 = new Student("Sam", 4, 3, 4);
		Student s5 = new Student("Amy", 2, 2, 4);

		System.out.println(s1.name + " has the average grade " + s1.average());
		System.out.println(s2.name + " has the average grade " + s2.average());
		System.out.println(s3.name + " has the average grade " + s3.average());
		System.out.println(s4.name + " has the average grade " + s4.average());
		System.out.println(s5.name + " has the average grade " + s5.average());
	}

}
