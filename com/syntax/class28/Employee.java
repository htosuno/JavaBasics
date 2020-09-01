package com.syntax.class28;

public class Employee {
	private double salary;
	private int age, empId;

	public double getSalary() {
		return salary;
	}

	public int getAge() {
		return age;
	}

	public int getEmpId() {
		return empId;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public void setAge(int age) {
		if(age>16) {
			this.age = age;
		}
		
	}

	public void setEmpId(int empId) {
		if(empId>0)	this.empId = empId;
	}

}
