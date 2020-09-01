package com.syntax.class28.groupTask1;

public class Car {
	double carPrice;
	String color;

	Car(double carPrice, String color) {
		this.carPrice = carPrice;
		this.color = color;
	}

	double calculateSalePrice() {
		return carPrice;
	}

	public static void main(String[] args) {
		Car c1 = new Car(25000, "white");
		Car c2 = new Truck(30000, "blue", 4500);
		Car c3 = new Sedan(20000, "black", 15);

		System.out.println(c1.calculateSalePrice());
		System.out.println(c2.calculateSalePrice());
		System.out.println(c3.calculateSalePrice());

	}

}

class Truck extends Car {
	double weight;

	Truck(double carPrice, String color, double weight) {
		super(carPrice, color);
		this.weight = weight;
	}

	double calculateSalePrice() {
		if (weight > 2000)
			return carPrice * 0.9;
		else
			return carPrice * 0.8;
	}

}

class Sedan extends Car {
	double length;

	Sedan(double carPrice, String color, double length) {
		super(carPrice, color);
		this.length = length;
	}

	double calculateSalePrice() {
		if (length > 20)
			return carPrice * 0.95;
		else
			return carPrice * 0.9;
	}

}