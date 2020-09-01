package com.syntax.class27;

public class DrivableTest {

	public static void main(String[] args) {
		Motorcycle m = new Bike();
		m.driving();
		m.braking();
		m.operateVehicle();		
		System.out.println(Motorcycle.DRIVE);
		
		Drivable d = new Bike();
		d.driving();
		d.braking();
		
		Vehicle v=new Bike();
		v.operateVehicle();
	}

}
