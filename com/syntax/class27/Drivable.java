package com.syntax.class27;

public interface Drivable {// interface is collection of public abstract methods and public static final
							// variables
	String DRIVE = "Drive safe";// by default compiler adds PSF to variables
	void driving();//by default compiler adds PA to the methods
	void braking();
}

abstract class Motorcycle extends Vehicle implements Drivable{

	public void driving() {
		System.out.println("Motorcycle is driving");
	}
}
class Bike extends Motorcycle{
	public void braking() {
		System.out.println("Bikes can brake");
	}
}

class Vehicle{
	public void operateVehicle() {
		System.out.println("To operate any vehicle you need to have a driver's license");
	}
}
