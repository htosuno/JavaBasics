package com.syntax.class18;

public class InstanceVariables {
	String name="Jane";

	public static void main(String[] args) {
		String name="Amy";
		System.out.println(name);
		
		InstanceVariables iv=new InstanceVariables();
		System.out.println(iv.name);
	}

}
