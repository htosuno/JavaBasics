package com.syntax.class13;

public class Garage {

	public static void main(String[] args) {
		Car car1 = new Car();
		car1.make = "Tesla";
		car1.model = "X";
		car1.color = "Red";
		car1.year = 2020;
		car1.speed = 200;
		System.out.println(
				"Make of 1st car is " + car1.make + " and model is " + car1.model + " and it is in " + car1.color+" color.");

		Car car2 = new Car();
		car2.make = "BMW";
		car2.model = "M5";
		car2.color = "Blue";
		car2.year = 2018;
		car2.speed = 240;
		System.out.println("Make of 2nd car is " + car2.make);

	}

}
