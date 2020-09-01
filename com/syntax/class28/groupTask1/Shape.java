package com.syntax.class28.groupTask1;

interface Shape {
	double calculateArea();

	double calculatePerimiter();

	public static void main(String[] args) {
		Shape c = new Circle(5);
		Shape s = new Square(10);

		System.out.println(c.calculateArea());
		System.out.println(c.calculatePerimiter());
		System.out.println(s.calculateArea());
		System.out.println(s.calculatePerimiter());

	}
}

class Circle implements Shape {
	double radius;

	Circle(double radius) {
		this.radius = radius;
	}

	public double calculateArea() {
		return Math.PI * Math.pow(radius, 2);
	}

	public double calculatePerimiter() {
		return 2 * Math.PI * radius;
	}

}

class Square implements Shape {
	double length;

	Square(double length) {
		this.length = length;
	}

	public double calculateArea() {
		return Math.pow(length, 2);
	}

	public double calculatePerimiter() {
		return 4 * length;
	}

}
